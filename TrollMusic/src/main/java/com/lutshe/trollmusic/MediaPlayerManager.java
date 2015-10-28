package com.lutshe.trollmusic;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * Created by Arsen Adzhiametov on 28.10.2015
 */
public class MediaPlayerManager {

    private static MediaPlayerManager mediaPlayerManager;

    private Context context;
    private MediaPlayer mp;

    private MediaPlayerManager(Context context){
        this.context = context;
    }

    public static MediaPlayerManager getInstance(Context context) {
        if (mediaPlayerManager == null) {
            mediaPlayerManager = new MediaPlayerManager(context);
        }
        return mediaPlayerManager;
    }

    public void play(int rawResourceId) {
        if (mp != null && mp.isPlaying()) {
            mp.stop();
            mp.reset();
            mp.release();
            mp = null;
        }
        mp = MediaPlayer.create(context, rawResourceId);
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.reset();
                mp.release();
                MediaPlayerManager.this.mp = null;
            }
        });
        mp.start();
    }

}
