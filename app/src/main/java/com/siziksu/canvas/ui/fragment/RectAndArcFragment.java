package com.siziksu.canvas.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.siziksu.canvas.R;

public class RectAndArcFragment extends Fragment {

    public RectAndArcFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_rect_and_arc, container, false);
    }
}
