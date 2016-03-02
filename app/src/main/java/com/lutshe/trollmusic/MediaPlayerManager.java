package com.lutshe.trollmusic;

import android.content.Context;
import android.media.MediaPlayer;

import java.io.IOException;

/**
 * Created by Arsen Adzhiametov on 28.10.2015
 */
public class MediaPlayerManager {

    private static MediaPlayerManager mediaPlayerManager;

    private Context context;
	private FileSystemAudioManager fileSystemAudioManager;
    private MediaPlayer mediaPlayers [];
	private int activePlayerPosition;

    private MediaPlayerManager(Context context) {
        this.context = context;
	    fileSystemAudioManager = new FileSystemAudioManager();
	    mediaPlayers = new MediaPlayer[fileSystemAudioManager.getAudioCount()];
	    for (int i = 0; i < mediaPlayers.length; i++) {
		    mediaPlayers[i] = createMediaPlayerForPosition(i);
	    }
    }

    public static MediaPlayerManager getInstance(Context context) {
        if (mediaPlayerManager == null) {
            mediaPlayerManager = new MediaPlayerManager(context);
        }
        return mediaPlayerManager;
    }

    public void play(int position) {
	    stop();
	    MediaPlayer mp = mediaPlayers[position];
	    try {
		    mp.prepare();
	    } catch (IOException e) {
		    e.printStackTrace();
	    }
	    mp.seekTo(0);
	    mp.start();
	    activePlayerPosition = position;

    }

    public void stop() {
	    MediaPlayer mp = mediaPlayers[activePlayerPosition];
        if (mp != null && mp.isPlaying()) {
            mp.stop();
        }
    }

	private MediaPlayer createMediaPlayerForPosition(int position) {
		MediaPlayer mp = new MediaPlayer();
		try {
            mp.setDataSource(fileSystemAudioManager.getAudionInPosition(position));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return mp;
	}
}
