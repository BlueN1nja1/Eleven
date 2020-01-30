/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.lineageos.eleven;
public interface IElevenService extends android.os.IInterface
{
  /** Default implementation for IElevenService. */
  public static class Default implements org.lineageos.eleven.IElevenService
  {
    @Override public void openFile(java.lang.String path) throws android.os.RemoteException
    {
    }
    @Override public void open(long[] list, int position, long sourceId, int sourceType) throws android.os.RemoteException
    {
    }
    @Override public void stop() throws android.os.RemoteException
    {
    }
    @Override public void pause() throws android.os.RemoteException
    {
    }
    @Override public void play() throws android.os.RemoteException
    {
    }
    @Override public void prev(boolean forcePrevious) throws android.os.RemoteException
    {
    }
    @Override public void next() throws android.os.RemoteException
    {
    }
    @Override public void enqueue(long[] list, int action, long sourceId, int sourceType) throws android.os.RemoteException
    {
    }
    @Override public void setQueuePosition(int index) throws android.os.RemoteException
    {
    }
    @Override public void setShuffleMode(int shufflemode) throws android.os.RemoteException
    {
    }
    @Override public void setRepeatMode(int repeatmode) throws android.os.RemoteException
    {
    }
    @Override public void moveQueueItem(int from, int to) throws android.os.RemoteException
    {
    }
    @Override public void refresh() throws android.os.RemoteException
    {
    }
    @Override public void playlistChanged() throws android.os.RemoteException
    {
    }
    @Override public boolean isPlaying() throws android.os.RemoteException
    {
      return false;
    }
    @Override public long[] getQueue() throws android.os.RemoteException
    {
      return null;
    }
    @Override public long getQueueItemAtPosition(int position) throws android.os.RemoteException
    {
      return 0L;
    }
    @Override public int getQueueSize() throws android.os.RemoteException
    {
      return 0;
    }
    @Override public int getQueuePosition() throws android.os.RemoteException
    {
      return 0;
    }
    @Override public int getQueueHistoryPosition(int position) throws android.os.RemoteException
    {
      return 0;
    }
    @Override public int getQueueHistorySize() throws android.os.RemoteException
    {
      return 0;
    }
    @Override public int[] getQueueHistoryList() throws android.os.RemoteException
    {
      return null;
    }
    @Override public long duration() throws android.os.RemoteException
    {
      return 0L;
    }
    @Override public long position() throws android.os.RemoteException
    {
      return 0L;
    }
    @Override public long seek(long pos) throws android.os.RemoteException
    {
      return 0L;
    }
    @Override public void seekRelative(long deltaInMs) throws android.os.RemoteException
    {
    }
    @Override public long getAudioId() throws android.os.RemoteException
    {
      return 0L;
    }
    @Override public org.lineageos.eleven.service.MusicPlaybackTrack getCurrentTrack() throws android.os.RemoteException
    {
      return null;
    }
    @Override public org.lineageos.eleven.service.MusicPlaybackTrack getTrack(int index) throws android.os.RemoteException
    {
      return null;
    }
    @Override public long getNextAudioId() throws android.os.RemoteException
    {
      return 0L;
    }
    @Override public long getPreviousAudioId() throws android.os.RemoteException
    {
      return 0L;
    }
    @Override public long getArtistId() throws android.os.RemoteException
    {
      return 0L;
    }
    @Override public long getAlbumId() throws android.os.RemoteException
    {
      return 0L;
    }
    @Override public java.lang.String getArtistName() throws android.os.RemoteException
    {
      return null;
    }
    @Override public java.lang.String getTrackName() throws android.os.RemoteException
    {
      return null;
    }
    @Override public java.lang.String getAlbumName() throws android.os.RemoteException
    {
      return null;
    }
    @Override public java.lang.String getPath() throws android.os.RemoteException
    {
      return null;
    }
    @Override public int getShuffleMode() throws android.os.RemoteException
    {
      return 0;
    }
    @Override public int removeTracks(int first, int last) throws android.os.RemoteException
    {
      return 0;
    }
    @Override public int removeTrack(long id) throws android.os.RemoteException
    {
      return 0;
    }
    @Override public boolean removeTrackAtPosition(long id, int position) throws android.os.RemoteException
    {
      return false;
    }
    @Override public int getRepeatMode() throws android.os.RemoteException
    {
      return 0;
    }
    @Override public int getMediaMountedCount() throws android.os.RemoteException
    {
      return 0;
    }
    @Override public int getAudioSessionId() throws android.os.RemoteException
    {
      return 0;
    }
    @Override public void setShakeToPlayEnabled(boolean enabled) throws android.os.RemoteException
    {
    }
    @Override public void setLockscreenAlbumArt(boolean enabled) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements org.lineageos.eleven.IElevenService
  {
    private static final java.lang.String DESCRIPTOR = "org.lineageos.eleven.IElevenService";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.lineageos.eleven.IElevenService interface,
     * generating a proxy if needed.
     */
    public static org.lineageos.eleven.IElevenService asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.lineageos.eleven.IElevenService))) {
        return ((org.lineageos.eleven.IElevenService)iin);
      }
      return new org.lineageos.eleven.IElevenService.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      switch (code)
      {
        case INTERFACE_TRANSACTION:
        {
          reply.writeString(descriptor);
          return true;
        }
        case TRANSACTION_openFile:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.openFile(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_open:
        {
          data.enforceInterface(descriptor);
          long[] _arg0;
          _arg0 = data.createLongArray();
          int _arg1;
          _arg1 = data.readInt();
          long _arg2;
          _arg2 = data.readLong();
          int _arg3;
          _arg3 = data.readInt();
          this.open(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_stop:
        {
          data.enforceInterface(descriptor);
          this.stop();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_pause:
        {
          data.enforceInterface(descriptor);
          this.pause();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_play:
        {
          data.enforceInterface(descriptor);
          this.play();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_prev:
        {
          data.enforceInterface(descriptor);
          boolean _arg0;
          _arg0 = (0!=data.readInt());
          this.prev(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_next:
        {
          data.enforceInterface(descriptor);
          this.next();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_enqueue:
        {
          data.enforceInterface(descriptor);
          long[] _arg0;
          _arg0 = data.createLongArray();
          int _arg1;
          _arg1 = data.readInt();
          long _arg2;
          _arg2 = data.readLong();
          int _arg3;
          _arg3 = data.readInt();
          this.enqueue(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setQueuePosition:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          this.setQueuePosition(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setShuffleMode:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          this.setShuffleMode(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setRepeatMode:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          this.setRepeatMode(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_moveQueueItem:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          this.moveQueueItem(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_refresh:
        {
          data.enforceInterface(descriptor);
          this.refresh();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_playlistChanged:
        {
          data.enforceInterface(descriptor);
          this.playlistChanged();
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_isPlaying:
        {
          data.enforceInterface(descriptor);
          boolean _result = this.isPlaying();
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        case TRANSACTION_getQueue:
        {
          data.enforceInterface(descriptor);
          long[] _result = this.getQueue();
          reply.writeNoException();
          reply.writeLongArray(_result);
          return true;
        }
        case TRANSACTION_getQueueItemAtPosition:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          long _result = this.getQueueItemAtPosition(_arg0);
          reply.writeNoException();
          reply.writeLong(_result);
          return true;
        }
        case TRANSACTION_getQueueSize:
        {
          data.enforceInterface(descriptor);
          int _result = this.getQueueSize();
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_getQueuePosition:
        {
          data.enforceInterface(descriptor);
          int _result = this.getQueuePosition();
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_getQueueHistoryPosition:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.getQueueHistoryPosition(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_getQueueHistorySize:
        {
          data.enforceInterface(descriptor);
          int _result = this.getQueueHistorySize();
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_getQueueHistoryList:
        {
          data.enforceInterface(descriptor);
          int[] _result = this.getQueueHistoryList();
          reply.writeNoException();
          reply.writeIntArray(_result);
          return true;
        }
        case TRANSACTION_duration:
        {
          data.enforceInterface(descriptor);
          long _result = this.duration();
          reply.writeNoException();
          reply.writeLong(_result);
          return true;
        }
        case TRANSACTION_position:
        {
          data.enforceInterface(descriptor);
          long _result = this.position();
          reply.writeNoException();
          reply.writeLong(_result);
          return true;
        }
        case TRANSACTION_seek:
        {
          data.enforceInterface(descriptor);
          long _arg0;
          _arg0 = data.readLong();
          long _result = this.seek(_arg0);
          reply.writeNoException();
          reply.writeLong(_result);
          return true;
        }
        case TRANSACTION_seekRelative:
        {
          data.enforceInterface(descriptor);
          long _arg0;
          _arg0 = data.readLong();
          this.seekRelative(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_getAudioId:
        {
          data.enforceInterface(descriptor);
          long _result = this.getAudioId();
          reply.writeNoException();
          reply.writeLong(_result);
          return true;
        }
        case TRANSACTION_getCurrentTrack:
        {
          data.enforceInterface(descriptor);
          org.lineageos.eleven.service.MusicPlaybackTrack _result = this.getCurrentTrack();
          reply.writeNoException();
          if ((_result!=null)) {
            reply.writeInt(1);
            _result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          }
          else {
            reply.writeInt(0);
          }
          return true;
        }
        case TRANSACTION_getTrack:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          org.lineageos.eleven.service.MusicPlaybackTrack _result = this.getTrack(_arg0);
          reply.writeNoException();
          if ((_result!=null)) {
            reply.writeInt(1);
            _result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          }
          else {
            reply.writeInt(0);
          }
          return true;
        }
        case TRANSACTION_getNextAudioId:
        {
          data.enforceInterface(descriptor);
          long _result = this.getNextAudioId();
          reply.writeNoException();
          reply.writeLong(_result);
          return true;
        }
        case TRANSACTION_getPreviousAudioId:
        {
          data.enforceInterface(descriptor);
          long _result = this.getPreviousAudioId();
          reply.writeNoException();
          reply.writeLong(_result);
          return true;
        }
        case TRANSACTION_getArtistId:
        {
          data.enforceInterface(descriptor);
          long _result = this.getArtistId();
          reply.writeNoException();
          reply.writeLong(_result);
          return true;
        }
        case TRANSACTION_getAlbumId:
        {
          data.enforceInterface(descriptor);
          long _result = this.getAlbumId();
          reply.writeNoException();
          reply.writeLong(_result);
          return true;
        }
        case TRANSACTION_getArtistName:
        {
          data.enforceInterface(descriptor);
          java.lang.String _result = this.getArtistName();
          reply.writeNoException();
          reply.writeString(_result);
          return true;
        }
        case TRANSACTION_getTrackName:
        {
          data.enforceInterface(descriptor);
          java.lang.String _result = this.getTrackName();
          reply.writeNoException();
          reply.writeString(_result);
          return true;
        }
        case TRANSACTION_getAlbumName:
        {
          data.enforceInterface(descriptor);
          java.lang.String _result = this.getAlbumName();
          reply.writeNoException();
          reply.writeString(_result);
          return true;
        }
        case TRANSACTION_getPath:
        {
          data.enforceInterface(descriptor);
          java.lang.String _result = this.getPath();
          reply.writeNoException();
          reply.writeString(_result);
          return true;
        }
        case TRANSACTION_getShuffleMode:
        {
          data.enforceInterface(descriptor);
          int _result = this.getShuffleMode();
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_removeTracks:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _result = this.removeTracks(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_removeTrack:
        {
          data.enforceInterface(descriptor);
          long _arg0;
          _arg0 = data.readLong();
          int _result = this.removeTrack(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_removeTrackAtPosition:
        {
          data.enforceInterface(descriptor);
          long _arg0;
          _arg0 = data.readLong();
          int _arg1;
          _arg1 = data.readInt();
          boolean _result = this.removeTrackAtPosition(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          return true;
        }
        case TRANSACTION_getRepeatMode:
        {
          data.enforceInterface(descriptor);
          int _result = this.getRepeatMode();
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_getMediaMountedCount:
        {
          data.enforceInterface(descriptor);
          int _result = this.getMediaMountedCount();
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_getAudioSessionId:
        {
          data.enforceInterface(descriptor);
          int _result = this.getAudioSessionId();
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_setShakeToPlayEnabled:
        {
          data.enforceInterface(descriptor);
          boolean _arg0;
          _arg0 = (0!=data.readInt());
          this.setShakeToPlayEnabled(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_setLockscreenAlbumArt:
        {
          data.enforceInterface(descriptor);
          boolean _arg0;
          _arg0 = (0!=data.readInt());
          this.setLockscreenAlbumArt(_arg0);
          reply.writeNoException();
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements org.lineageos.eleven.IElevenService
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      @Override public void openFile(java.lang.String path) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(path);
          boolean _status = mRemote.transact(Stub.TRANSACTION_openFile, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().openFile(path);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void open(long[] list, int position, long sourceId, int sourceType) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeLongArray(list);
          _data.writeInt(position);
          _data.writeLong(sourceId);
          _data.writeInt(sourceType);
          boolean _status = mRemote.transact(Stub.TRANSACTION_open, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().open(list, position, sourceId, sourceType);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void stop() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_stop, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().stop();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void pause() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_pause, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().pause();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void play() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_play, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().play();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void prev(boolean forcePrevious) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(((forcePrevious)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_prev, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().prev(forcePrevious);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void next() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_next, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().next();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void enqueue(long[] list, int action, long sourceId, int sourceType) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeLongArray(list);
          _data.writeInt(action);
          _data.writeLong(sourceId);
          _data.writeInt(sourceType);
          boolean _status = mRemote.transact(Stub.TRANSACTION_enqueue, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().enqueue(list, action, sourceId, sourceType);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setQueuePosition(int index) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(index);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setQueuePosition, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setQueuePosition(index);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setShuffleMode(int shufflemode) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(shufflemode);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setShuffleMode, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setShuffleMode(shufflemode);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setRepeatMode(int repeatmode) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(repeatmode);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setRepeatMode, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setRepeatMode(repeatmode);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void moveQueueItem(int from, int to) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(from);
          _data.writeInt(to);
          boolean _status = mRemote.transact(Stub.TRANSACTION_moveQueueItem, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().moveQueueItem(from, to);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void refresh() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_refresh, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().refresh();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void playlistChanged() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_playlistChanged, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().playlistChanged();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public boolean isPlaying() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_isPlaying, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().isPlaying();
          }
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public long[] getQueue() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        long[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getQueue, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getQueue();
          }
          _reply.readException();
          _result = _reply.createLongArray();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public long getQueueItemAtPosition(int position) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        long _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(position);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getQueueItemAtPosition, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getQueueItemAtPosition(position);
          }
          _reply.readException();
          _result = _reply.readLong();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public int getQueueSize() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getQueueSize, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getQueueSize();
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public int getQueuePosition() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getQueuePosition, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getQueuePosition();
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public int getQueueHistoryPosition(int position) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(position);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getQueueHistoryPosition, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getQueueHistoryPosition(position);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public int getQueueHistorySize() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getQueueHistorySize, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getQueueHistorySize();
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public int[] getQueueHistoryList() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getQueueHistoryList, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getQueueHistoryList();
          }
          _reply.readException();
          _result = _reply.createIntArray();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public long duration() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        long _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_duration, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().duration();
          }
          _reply.readException();
          _result = _reply.readLong();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public long position() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        long _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_position, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().position();
          }
          _reply.readException();
          _result = _reply.readLong();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public long seek(long pos) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        long _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeLong(pos);
          boolean _status = mRemote.transact(Stub.TRANSACTION_seek, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().seek(pos);
          }
          _reply.readException();
          _result = _reply.readLong();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void seekRelative(long deltaInMs) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeLong(deltaInMs);
          boolean _status = mRemote.transact(Stub.TRANSACTION_seekRelative, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().seekRelative(deltaInMs);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public long getAudioId() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        long _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getAudioId, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getAudioId();
          }
          _reply.readException();
          _result = _reply.readLong();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public org.lineageos.eleven.service.MusicPlaybackTrack getCurrentTrack() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        org.lineageos.eleven.service.MusicPlaybackTrack _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getCurrentTrack, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getCurrentTrack();
          }
          _reply.readException();
          if ((0!=_reply.readInt())) {
            _result = org.lineageos.eleven.service.MusicPlaybackTrack.CREATOR.createFromParcel(_reply);
          }
          else {
            _result = null;
          }
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public org.lineageos.eleven.service.MusicPlaybackTrack getTrack(int index) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        org.lineageos.eleven.service.MusicPlaybackTrack _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(index);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getTrack, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getTrack(index);
          }
          _reply.readException();
          if ((0!=_reply.readInt())) {
            _result = org.lineageos.eleven.service.MusicPlaybackTrack.CREATOR.createFromParcel(_reply);
          }
          else {
            _result = null;
          }
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public long getNextAudioId() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        long _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getNextAudioId, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getNextAudioId();
          }
          _reply.readException();
          _result = _reply.readLong();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public long getPreviousAudioId() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        long _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPreviousAudioId, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getPreviousAudioId();
          }
          _reply.readException();
          _result = _reply.readLong();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public long getArtistId() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        long _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getArtistId, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getArtistId();
          }
          _reply.readException();
          _result = _reply.readLong();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public long getAlbumId() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        long _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getAlbumId, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getAlbumId();
          }
          _reply.readException();
          _result = _reply.readLong();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public java.lang.String getArtistName() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getArtistName, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getArtistName();
          }
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public java.lang.String getTrackName() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getTrackName, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getTrackName();
          }
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public java.lang.String getAlbumName() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getAlbumName, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getAlbumName();
          }
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public java.lang.String getPath() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPath, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getPath();
          }
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public int getShuffleMode() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getShuffleMode, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getShuffleMode();
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public int removeTracks(int first, int last) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(first);
          _data.writeInt(last);
          boolean _status = mRemote.transact(Stub.TRANSACTION_removeTracks, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().removeTracks(first, last);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public int removeTrack(long id) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeLong(id);
          boolean _status = mRemote.transact(Stub.TRANSACTION_removeTrack, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().removeTrack(id);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public boolean removeTrackAtPosition(long id, int position) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeLong(id);
          _data.writeInt(position);
          boolean _status = mRemote.transact(Stub.TRANSACTION_removeTrackAtPosition, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().removeTrackAtPosition(id, position);
          }
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public int getRepeatMode() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getRepeatMode, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getRepeatMode();
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public int getMediaMountedCount() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getMediaMountedCount, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getMediaMountedCount();
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public int getAudioSessionId() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getAudioSessionId, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getAudioSessionId();
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void setShakeToPlayEnabled(boolean enabled) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(((enabled)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_setShakeToPlayEnabled, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setShakeToPlayEnabled(enabled);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setLockscreenAlbumArt(boolean enabled) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(((enabled)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_setLockscreenAlbumArt, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().setLockscreenAlbumArt(enabled);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      public static org.lineageos.eleven.IElevenService sDefaultImpl;
    }
    static final int TRANSACTION_openFile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_open = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_stop = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_pause = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_play = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_prev = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_next = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_enqueue = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_setQueuePosition = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_setShuffleMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_setRepeatMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_moveQueueItem = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_refresh = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_playlistChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    static final int TRANSACTION_isPlaying = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
    static final int TRANSACTION_getQueue = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
    static final int TRANSACTION_getQueueItemAtPosition = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
    static final int TRANSACTION_getQueueSize = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
    static final int TRANSACTION_getQueuePosition = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
    static final int TRANSACTION_getQueueHistoryPosition = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
    static final int TRANSACTION_getQueueHistorySize = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
    static final int TRANSACTION_getQueueHistoryList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
    static final int TRANSACTION_duration = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
    static final int TRANSACTION_position = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
    static final int TRANSACTION_seek = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
    static final int TRANSACTION_seekRelative = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
    static final int TRANSACTION_getAudioId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
    static final int TRANSACTION_getCurrentTrack = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
    static final int TRANSACTION_getTrack = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
    static final int TRANSACTION_getNextAudioId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
    static final int TRANSACTION_getPreviousAudioId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
    static final int TRANSACTION_getArtistId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
    static final int TRANSACTION_getAlbumId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 32);
    static final int TRANSACTION_getArtistName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 33);
    static final int TRANSACTION_getTrackName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 34);
    static final int TRANSACTION_getAlbumName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 35);
    static final int TRANSACTION_getPath = (android.os.IBinder.FIRST_CALL_TRANSACTION + 36);
    static final int TRANSACTION_getShuffleMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 37);
    static final int TRANSACTION_removeTracks = (android.os.IBinder.FIRST_CALL_TRANSACTION + 38);
    static final int TRANSACTION_removeTrack = (android.os.IBinder.FIRST_CALL_TRANSACTION + 39);
    static final int TRANSACTION_removeTrackAtPosition = (android.os.IBinder.FIRST_CALL_TRANSACTION + 40);
    static final int TRANSACTION_getRepeatMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 41);
    static final int TRANSACTION_getMediaMountedCount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 42);
    static final int TRANSACTION_getAudioSessionId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 43);
    static final int TRANSACTION_setShakeToPlayEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 44);
    static final int TRANSACTION_setLockscreenAlbumArt = (android.os.IBinder.FIRST_CALL_TRANSACTION + 45);
    public static boolean setDefaultImpl(org.lineageos.eleven.IElevenService impl) {
      if (Stub.Proxy.sDefaultImpl == null && impl != null) {
        Stub.Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static org.lineageos.eleven.IElevenService getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  public void openFile(java.lang.String path) throws android.os.RemoteException;
  public void open(long[] list, int position, long sourceId, int sourceType) throws android.os.RemoteException;
  public void stop() throws android.os.RemoteException;
  public void pause() throws android.os.RemoteException;
  public void play() throws android.os.RemoteException;
  public void prev(boolean forcePrevious) throws android.os.RemoteException;
  public void next() throws android.os.RemoteException;
  public void enqueue(long[] list, int action, long sourceId, int sourceType) throws android.os.RemoteException;
  public void setQueuePosition(int index) throws android.os.RemoteException;
  public void setShuffleMode(int shufflemode) throws android.os.RemoteException;
  public void setRepeatMode(int repeatmode) throws android.os.RemoteException;
  public void moveQueueItem(int from, int to) throws android.os.RemoteException;
  public void refresh() throws android.os.RemoteException;
  public void playlistChanged() throws android.os.RemoteException;
  public boolean isPlaying() throws android.os.RemoteException;
  public long[] getQueue() throws android.os.RemoteException;
  public long getQueueItemAtPosition(int position) throws android.os.RemoteException;
  public int getQueueSize() throws android.os.RemoteException;
  public int getQueuePosition() throws android.os.RemoteException;
  public int getQueueHistoryPosition(int position) throws android.os.RemoteException;
  public int getQueueHistorySize() throws android.os.RemoteException;
  public int[] getQueueHistoryList() throws android.os.RemoteException;
  public long duration() throws android.os.RemoteException;
  public long position() throws android.os.RemoteException;
  public long seek(long pos) throws android.os.RemoteException;
  public void seekRelative(long deltaInMs) throws android.os.RemoteException;
  public long getAudioId() throws android.os.RemoteException;
  public org.lineageos.eleven.service.MusicPlaybackTrack getCurrentTrack() throws android.os.RemoteException;
  public org.lineageos.eleven.service.MusicPlaybackTrack getTrack(int index) throws android.os.RemoteException;
  public long getNextAudioId() throws android.os.RemoteException;
  public long getPreviousAudioId() throws android.os.RemoteException;
  public long getArtistId() throws android.os.RemoteException;
  public long getAlbumId() throws android.os.RemoteException;
  public java.lang.String getArtistName() throws android.os.RemoteException;
  public java.lang.String getTrackName() throws android.os.RemoteException;
  public java.lang.String getAlbumName() throws android.os.RemoteException;
  public java.lang.String getPath() throws android.os.RemoteException;
  public int getShuffleMode() throws android.os.RemoteException;
  public int removeTracks(int first, int last) throws android.os.RemoteException;
  public int removeTrack(long id) throws android.os.RemoteException;
  public boolean removeTrackAtPosition(long id, int position) throws android.os.RemoteException;
  public int getRepeatMode() throws android.os.RemoteException;
  public int getMediaMountedCount() throws android.os.RemoteException;
  public int getAudioSessionId() throws android.os.RemoteException;
  public void setShakeToPlayEnabled(boolean enabled) throws android.os.RemoteException;
  public void setLockscreenAlbumArt(boolean enabled) throws android.os.RemoteException;
}
