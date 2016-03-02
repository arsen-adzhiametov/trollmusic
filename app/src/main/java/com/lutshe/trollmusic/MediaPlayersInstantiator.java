package com.lutshe.trollmusic;

import android.content.Context;
import android.os.AsyncTask;

/**
 * Created by arsen_adzhiametov on 02/03/2016.
 */
public class MediaPlayersInstantiator extends AsyncTask<String, Void, String> {

	private Context context;

	public MediaPlayersInstantiator(Context context) {
		this.context = context;
	}

	@Override
	protected String doInBackground(String... params) {
		MediaPlayerManager.getInstance(context);
		return null;
	}
}
