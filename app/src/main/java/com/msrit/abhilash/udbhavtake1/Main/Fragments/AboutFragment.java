package com.msrit.abhilash.udbhavtake1.Main.Fragments;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.msrit.abhilash.udbhavtake1.Main.Activities.ImageActivity;
import com.msrit.abhilash.udbhavtake1.R;

/**
 * Created by Abhilash on 09/03/2016.
 */
public class AboutFragment extends Fragment {
    Button schedule,fb,snap;
    public static String FACEBOOK_URL = "https://www.facebook.com/msritudbhav";
    public static String FACEBOOK_PAGE_ID = "Udbhav";
    public AboutFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_about, container, false);
        schedule = (Button) view.findViewById(R.id.schedule);
        fb = (Button) view.findViewById(R.id.fb);
        snap = (Button) view.findViewById(R.id.snapchat);

        schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ImageActivity.class);
                startActivity(intent);
            }
        });

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent facebookIntent = new Intent(Intent.ACTION_VIEW);
                String facebookUrl = getFacebookPageURL(getActivity());
                facebookIntent.setData(Uri.parse(facebookUrl));
                startActivity(facebookIntent);
            }
        });

        snap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getActivity(), "Add 'msrit_udbhav' on snapchat to follow all the fun and action!", Toast.LENGTH_SHORT).show();

            }
        });

        return view;
    }

    public String getFacebookPageURL(Context context) {
        PackageManager packageManager = context.getPackageManager();
        try {
            int versionCode = packageManager.getPackageInfo("com.facebook.katana", 0).versionCode;
            if (versionCode >= 3002850) { //newer versions of fb app
                return "fb://facewebmodal/f?href=" + FACEBOOK_URL;
            } else { //older versions of fb app
                return "fb://page/" + FACEBOOK_PAGE_ID;
            }
        } catch (PackageManager.NameNotFoundException e) {
            return FACEBOOK_URL; //normal web url
        }
    }
}
