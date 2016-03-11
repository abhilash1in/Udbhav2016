package com.msrit.abhilash.udbhavtake1.Main.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.msrit.abhilash.udbhavtake1.R;

/**
 * Created by Abhilash on 09/03/2016.
 */
public class AboutFragment extends Fragment {
    Button test;
    public AboutFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_about, container, false);
        test=(Button) view.findViewById(R.id.test);
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Button clicked", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
