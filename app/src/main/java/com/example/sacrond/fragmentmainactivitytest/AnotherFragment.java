package com.example.sacrond.fragmentmainactivitytest;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Sacrond on 9/30/2015.
 */
public class AnotherFragment extends Fragment {

    public AnotherFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.another_fragment, container, false);
        return view;
    }
}
