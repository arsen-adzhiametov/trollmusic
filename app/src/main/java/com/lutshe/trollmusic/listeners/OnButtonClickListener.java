package com.lutshe.trollmusic.listeners;

import android.content.Context;
import android.view.View;
import com.lutshe.trollmusic.MediaPlayerManager;

/**
 * Created by Arsen Adzhiametov on 28.10.2015
 */
public class OnButtonClickListener implements View.OnClickListener {

    private int position;
    private Context context;

    public OnButtonClickListener(Context context, int position) {
        this.context = context;
        this.position = position;
    }

    @Override
    public void onClick(View v) {
        MediaPlayerManager.getInstance(context).play(position);
    }
}
