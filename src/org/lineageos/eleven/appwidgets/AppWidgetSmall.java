/*
 * Copyright (C) 2012 Andrew Neal
 * Copyright (C) 2014 The CyanogenMod Project
 * Copyright (C) 2021 The LineageOS Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.lineageos.eleven.appwidgets;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.RemoteViews;

import org.lineageos.eleven.MusicPlaybackService;
import org.lineageos.eleven.R;
import org.lineageos.eleven.ui.activities.HomeActivity;

/**
 * Square App-Widget
 *
 * @author Andrew Neal (andrewdneal@gmail.com)
 */
@SuppressLint("NewApi")
public class AppWidgetSmall extends AppWidgetBase {

    public static final String APP_WIDGET_UPDATE = "app_widget_small_update";

    private static AppWidgetSmall mInstance;

    public static synchronized AppWidgetSmall getInstance() {
        if (mInstance == null) {
            mInstance = new AppWidgetSmall();
        }
        return mInstance;
    }

    @Override
    public void onUpdate(final Context context, final AppWidgetManager appWidgetManager,
            final int[] appWidgetIds) {
        defaultAppWidget(context, appWidgetIds);
        final Intent updateIntent = new Intent(MusicPlaybackService.SERVICECMD);
        updateIntent.putExtra(MusicPlaybackService.CMDNAME, AppWidgetSmall.APP_WIDGET_UPDATE);
        updateIntent.putExtra(AppWidgetManager.EXTRA_APPWIDGET_IDS, appWidgetIds);
        updateIntent.addFlags(Intent.FLAG_RECEIVER_REGISTERED_ONLY);
        context.sendBroadcast(updateIntent);
    }

    /**
     * Initialize given widgets to default state, where we launch Music on
     * default click and hide actions if service not running.
     */
    private void defaultAppWidget(final Context context, final int[] appWidgetIds) {
        final RemoteViews appWidgetViews = new RemoteViews(context.getPackageName(),
                R.layout.app_widget_small);
        showDefaults(context, appWidgetViews);
        linkButtons(context, appWidgetViews);
        pushUpdate(context, appWidgetIds, appWidgetViews);
    }

    private void pushUpdate(final Context context, final int[] appWidgetIds,
                            final RemoteViews views) {
        final AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        if (appWidgetIds != null) {
            appWidgetManager.updateAppWidget(appWidgetIds, views);
        } else {
            appWidgetManager.updateAppWidget(new ComponentName(context, getClass()), views);
        }
    }

    /**
     * Check against {@link AppWidgetManager} if there are any instances of this
     * widget.
     */
    private boolean hasInstances(final Context context) {
        final AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        final int[] mAppWidgetIds = appWidgetManager.getAppWidgetIds(new ComponentName(context,
                getClass()));
        return mAppWidgetIds.length > 0;
    }

    /**
     * Handle a change notification coming over from
     * {@link MusicPlaybackService}
     */
    public void notifyChange(final MusicPlaybackService service, final String what) {
        if (hasInstances(service)) {
            if (MusicPlaybackService.META_CHANGED.equals(what)
                    || MusicPlaybackService.PLAYSTATE_CHANGED.equals(what)) {
                performUpdate(service, null);
            }
        }
    }

    /**
     * Update all active widget instances by pushing changes
     */
    public void performUpdate(final MusicPlaybackService service, final int[] appWidgetIds) {
        final RemoteViews appWidgetView = new RemoteViews(service.getPackageName(),
                R.layout.app_widget_small);

        final CharSequence trackName = service.getTrackName();
        final CharSequence albumName = service.getAlbumName();
        final CharSequence artistName = service.getArtistName();
        final Bitmap bitmap = service.getAlbumArt(true).getBitmap();

        // Set the titles and artwork
        if (!TextUtils.isEmpty(trackName) || !TextUtils.isEmpty(artistName)) {
            appWidgetView.setTextViewText(R.id.app_widget_line_one, trackName);
            appWidgetView.setTextViewText(R.id.app_widget_line_two, albumName);
            appWidgetView.setTextViewText(R.id.app_widget_line_three, artistName);
        }
        appWidgetView.setImageViewBitmap(R.id.app_widget_image, bitmap);

        // Set correct drawable for pause state
        final boolean isPlaying = service.isPlaying();
        if (isPlaying) {
            appWidgetView.setImageViewResource(R.id.app_widget_small_play,
                    R.drawable.btn_widget_pause);
            appWidgetView.setContentDescription(R.id.app_widget_small_play,
                    service.getString(R.string.accessibility_pause));
        } else {
            appWidgetView.setImageViewResource(R.id.app_widget_small_play,
                    R.drawable.btn_widget_play);
            appWidgetView.setContentDescription(R.id.app_widget_small_play,
                    service.getString(R.string.accessibility_play));
        }

        // Link actions buttons to intents
        linkButtons(service, appWidgetView);

        // Update the app-widget
        pushUpdate(service, appWidgetIds, appWidgetView);
    }

    /**
     * Link up various button actions using {@link PendingIntent}s.
     *
     */
    private void linkButtons(final Context context, final RemoteViews views) {
        Intent action;
        PendingIntent pendingIntent;

        final ComponentName serviceName = new ComponentName(context, MusicPlaybackService.class);

        // Home
        action = new Intent(context, HomeActivity.class);
        action.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        pendingIntent = PendingIntent.getActivity(context, 0, action, PendingIntent.FLAG_IMMUTABLE);
        views.setOnClickPendingIntent(R.id.app_widget_small_info_container, pendingIntent);
        views.setOnClickPendingIntent(R.id.app_widget_image, pendingIntent);

        // Play and pause
        pendingIntent = buildPendingIntent(context, MusicPlaybackService.TOGGLEPAUSE_ACTION,
                serviceName);
        views.setOnClickPendingIntent(R.id.app_widget_small_play, pendingIntent);
    }
}
