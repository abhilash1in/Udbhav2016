package com.msrit.abhilash.udbhavtake1.Main.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.github.aakira.expandablelayout.ExpandableRelativeLayout;
import com.msrit.abhilash.udbhavtake1.ExpandableLayout.RecyclerViewActivity;
import com.msrit.abhilash.udbhavtake1.Main.Data.Data;
import com.msrit.abhilash.udbhavtake1.Main.Data.ItemData;
import com.msrit.abhilash.udbhavtake1.R;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Example about replacing fragments inside a ViewPager. I'm using
 * android-support-v7 to maximize the compatibility.
 *
 * @author Dani Lao (@dani_lao)
 *
 */
public class StaticFragment extends Fragment {
    final static ArrayList<ItemData> categories = Data.getCategories();

    private static final String TAG = "StaticFragment";
    Button register;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater
                .inflate(R.layout.register, container, false);

        register = (Button) view.findViewById(R.id.register);


        /*final ExpandableRelativeLayout expandableLayout
                = (ExpandableRelativeLayout) view.findViewById(R.id.expandableLayout);*/

        /*TextView tv = new TextView(getActivity());
        tv.setText("sample sample sample");
        expandableLayout.addView(tv);*/

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO uncomment
                /*Intent intent = new Intent(getActivity(), RecyclerViewActivity.class);
                startActivity(intent);*/
                Toast.makeText(getActivity(), "Didn't I tell you? Registration form coming soon", Toast.LENGTH_SHORT).show();

            }
        });

/*
// toggle expand, collapse
        expandableLayout.toggle();
// expand
        expandableLayout.expand();
*/
/*//*
/ collapse
        expandableLayout.collapse();*//*


// move position of child view
        expandableLayout.moveChild(0);
// move optional position
        expandableLayout.move(500);

// set base position which is close position
        expandableLayout.setClosePosition(500);
*/

        LinearLayout ll = (LinearLayout) view.findViewById(R.id.list);

        CheckBox cb = new CheckBox(getActivity());
        cb.setText("Registration form coming soon!");
        ll.addView(cb);

        /*for(int i = 0; i < 10; i++) {
            CheckBox cb = new CheckBox(getActivity());
            cb.setText("Dynamic Checkbox " + i);
            cb.setId(i+10);
            ll.addView(cb);
        }*/


        //TODO uncomment
        /*Iterator<ItemData> it  = categories.iterator();
        while(it.hasNext())
        {
            CheckBox cb = new CheckBox(getActivity());
            cb.setText(it.next().getTitle());
            ll.addView(cb);

        }*/

        return view;
    }

}
