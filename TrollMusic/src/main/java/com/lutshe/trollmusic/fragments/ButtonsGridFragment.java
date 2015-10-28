package com.lutshe.trollmusic.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import com.lutshe.trollmusic.R;
import com.lutshe.trollmusic.adapters.ButtonAdapter;

public class ButtonsGridFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_buttons_grid, container, false);
        GridView gridview = (GridView) rootView.findViewById(R.id.buttons_grid);
        gridview.setAdapter(new ButtonAdapter(getActivity()));
        return rootView;
    }


}
