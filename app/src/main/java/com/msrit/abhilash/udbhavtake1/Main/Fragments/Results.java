package com.msrit.abhilash.udbhavtake1.Main.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.msrit.abhilash.udbhavtake1.R;

/**
 * Created by Abhilash on 09/03/2016.
 */
public class Results extends Fragment {
    public Results() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater
                .inflate(R.layout.results, container, false);



        return view;
    }
}
