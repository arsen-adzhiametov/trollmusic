package com.lutshe.trollmusic.listeners;

import android.content.Context;
import android.view.View;
import com.lutshe.trollmusic.MediaPlayerManager;

/**
 * Created by Arsen Adzhiametov on 28.10.2015
 */
public class OnStopButtonClickListener implements View.OnClickListener {

    private Context context;

    public OnStopButtonClickListener(Context context) {
        this.context = context;
    }

    @Override
    public void onClick(View v) {
        MediaPlayerManager.getInstance(context).stop();
    }
}
