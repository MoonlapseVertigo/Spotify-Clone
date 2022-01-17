package com.galanosPli40.audiostreamer.ui;

import android.support.v4.media.MediaMetadataCompat;

import com.galanosPli40.audiostreamer.MyApplication;
import com.galanosPli40.audiostreamer.models.Artist;
import com.galanosPli40.audiostreamer.util.MyPreferenceManager;

public interface IMainActivity {

    void hideProgressBar();

    void showPrgressBar();

    void onCategorySelected(String category);

    void onArtistSelected(String category, Artist artist);

    void setActionBarTitle(String title);

    void playPause();

    MyApplication getMyApplicationInstance();

    void onMediaSelected(String playlistId, MediaMetadataCompat mediaItem, int position);

    MyPreferenceManager getMyPreferenceManager();
}
