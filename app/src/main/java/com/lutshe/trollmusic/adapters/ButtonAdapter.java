package com.lutshe.trollmusic.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import com.lutshe.trollmusic.FileSystemAudioManager;
import com.lutshe.trollmusic.exceptions.NotImplementedException;
import com.lutshe.trollmusic.listeners.OnButtonClickListener;

/**
 * Created by Arsen Adzhiametov on 28.10.2015
 */
public class ButtonAdapter extends BaseAdapter {

    private Context context;
    private FileSystemAudioManager fileSystemAudioManager;

    public ButtonAdapter(Context context) {
        this.context = context;
        fileSystemAudioManager = new FileSystemAudioManager();
    }

    @Override
    public int getCount() {
        return fileSystemAudioManager.getAudioCount();
    }

    @Override
    public Object getItem(int position) {
        throw new NotImplementedException();
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        Button button = new Button(context);
        button.setLayoutParams(new GridView.LayoutParams(250, 150));
        button.setPadding(8, 8, 8, 8);
        button.setText(fileSystemAudioManager.getAudioNameInPosition(position));
        button.setLines(2);
        button.setTextSize(10);
        button.setId(position);
        button.setOnClickListener(new OnButtonClickListener(context, fileSystemAudioManager.getAudionInPosition(position)));
        return button;
    }
}
