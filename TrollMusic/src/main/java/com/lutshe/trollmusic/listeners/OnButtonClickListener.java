package com.lutshe.trollmusic.listeners;

import android.content.Context;
import android.view.View;
import com.lutshe.trollmusic.MediaPlayerManager;

/**
 * Created by Arsen Adzhiametov on 28.10.2015
 */
public class OnButtonClickListener implements View.OnClickListener {

    private int rawResourceId;
    private Context context;

    public OnButtonClickListener(Context context, int rawResourceId) {
        this.context = context;
        this.rawResourceId = rawResourceId;
    }

    @Override
    public void onClick(View v) {
        MediaPlayerManager.getInstance(context).play(rawResourceId);
    }
}
