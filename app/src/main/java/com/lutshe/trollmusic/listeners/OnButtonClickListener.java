package com.lutshe.trollmusic.listeners;

import android.content.Context;
import android.view.View;
import com.lutshe.trollmusic.MediaPlayerManager;

/**
 * Created by Arsen Adzhiametov on 28.10.2015
 */
public class OnButtonClickListener implements View.OnClickListener {

    private String pathToAudio;
    private Context context;

    public OnButtonClickListener(Context context, String pathToAudio) {
        this.context = context;
        this.pathToAudio = pathToAudio;
    }

    @Override
    public void onClick(View v) {
        MediaPlayerManager.getInstance(context).play(pathToAudio);
    }
}
