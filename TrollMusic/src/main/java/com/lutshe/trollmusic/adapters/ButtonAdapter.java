package com.lutshe.trollmusic.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import com.lutshe.trollmusic.R;
import com.lutshe.trollmusic.exceptions.NotImplementedException;
import com.lutshe.trollmusic.listeners.OnButtonClickListener;

/**
 * Created by Arsen Adzhiametov on 28.10.2015
 */
public class ButtonAdapter extends BaseAdapter {

    private Context context;

    public ButtonAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return 20;
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
        button.setText("Button " + position);
        button.setId(position);
        button.setOnClickListener(new OnButtonClickListener(context, R.raw.teenage));
        return button;
    }
}
