/*
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
package org.lineageos.eleven.utils;

import android.app.Activity;
import android.content.ContentUris;
import android.net.Uri;
import android.provider.MediaStore;

import androidx.fragment.app.FragmentManager;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

import org.lineageos.eleven.Config;
import org.lineageos.eleven.Config.SmartPlaylistType;
import org.lineageos.eleven.R;
import org.lineageos.eleven.model.Playlist;

public abstract class PlaylistPopupMenuHelper extends PopupMenuHelper {
    private Playlist mPlaylist;

    public PlaylistPopupMenuHelper(Activity activity, FragmentManager fragmentManager,
                                   PopupMenuType type) {
        super(activity, fragmentManager);
        mType = type;
    }

    public abstract Playlist getPlaylist(int position);

    @Override
    public PopupMenuType onPreparePopupMenu(int position) {
        mPlaylist = getPlaylist(position);
        return mPlaylist.isSmartPlaylist() ?
                PopupMenuType.SmartPlaylist : PopupMenuType.Playlist;
    }

    public void updateName(String name) {
        if (mPlaylist != null) {
            mPlaylist.mPlaylistName = name;
        }
    }

    @Override
    protected long getSourceId() {
        return mPlaylist.mPlaylistId;
    }

    @Override
    protected Config.IdType getSourceType() {
        return Config.IdType.Playlist;
    }

    @Override
    protected long[] getIdList() {
        if (mPlaylist.isSmartPlaylist()) {
            final Config.SmartPlaylistType type = SmartPlaylistType.getTypeById(getSourceId());
            if (type != null) {
                return MusicUtils.getSongListForSmartPlaylist(mActivity, type);
            }
        } else {
            return MusicUtils.getSongListForPlaylist(mActivity, getSourceId());
        }
        return new long[0];
    }

    @Override
    protected void onDeleteClicked() {
        // TODO: do this with a proper DialogFragment
        buildDeleteDialog(getId(), mPlaylist.mPlaylistName).show();
    }

    @Override // FIXME: is this really the right thing?
    protected long getId() {
        return mPlaylist.mPlaylistId;
    }

    /**
     * Create a new {@link MaterialAlertDialogBuilder} for easy playlist deletion
     *
     * @param playlistName The title of the playlist being deleted
     * @param playlistId   The ID of the playlist being deleted
     * @return A new {@link MaterialAlertDialogBuilder} used to delete playlists
     */
    private MaterialAlertDialogBuilder buildDeleteDialog(final long playlistId, final String playlistName) {
        return new MaterialAlertDialogBuilder(mActivity)
                .setTitle(mActivity.getString(R.string.delete_dialog_title, playlistName))
                .setPositiveButton(R.string.context_menu_delete, (dialog, which) -> {
                    final Uri mUri = ContentUris.withAppendedId(
                            MediaStore.Audio.Playlists.getContentUri(MediaStore.VOLUME_EXTERNAL),
                            playlistId);
                    mActivity.getContentResolver().delete(mUri, null, null);
                    MusicUtils.refresh();
                })
                .setNegativeButton(R.string.cancel, (dialog, which) -> dialog.dismiss())
                .setMessage(R.string.cannot_be_undone);
    }
}
