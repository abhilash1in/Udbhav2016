package com.msrit.abhilash.udbhavtake1.ExpandableLayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.aakira.expandablelayout.ExpandableRelativeLayout;
import com.marshalchen.ultimaterecyclerview.ui.DividerItemDecoration;
import com.msrit.abhilash.udbhavtake1.Main.Data.ItemData;
import com.msrit.abhilash.udbhavtake1.Main.Fragments.OneFragment2;
import com.msrit.abhilash.udbhavtake1.Main.Interface.RecyclerItemClickListener;
import com.msrit.abhilash.udbhavtake1.R;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;

import com.github.aakira.expandablelayout.Utils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {

    final ArrayList<ItemData> categories = OneFragment2.categories;

    public static void startActivity(Context context) {
        context.startActivity(new Intent(context, RecyclerViewActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        /*getSupportActionBar().setTitle(RecyclerViewActivity.class.getSimpleName());*/

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerViewRegister);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL_LIST));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        final List<ItemModel> data = new ArrayList<>();
        Iterator<ItemData> it  = categories.iterator();
        while(it.hasNext())
        {
            ItemData temp = it.next();
            data.add(new ItemModel(

                    temp.getTitle(),
                    R.color.material_red_500,
                    R.color.material_red_300,
                    Utils.createInterpolator(Utils.ACCELERATE_INTERPOLATOR),
                    temp.getEvents()
            ));
        }


        /*data.add(new ItemModel(
                "0 ACCELERATE_DECELERATE_INTERPOLATOR",
                R.color.material_red_500,
                R.color.material_red_300,
                Utils.createInterpolator(Utils.ACCELERATE_DECELERATE_INTERPOLATOR)));
        data.add(new ItemModel(
                "1 ACCELERATE_INTERPOLATOR",
                R.color.material_pink_500,
                R.color.material_pink_300,
                Utils.createInterpolator(Utils.ACCELERATE_INTERPOLATOR)));
        data.add(new ItemModel(
                "2 BOUNCE_INTERPOLATOR",
                R.color.material_purple_500,
                R.color.material_purple_300,
                Utils.createInterpolator(Utils.BOUNCE_INTERPOLATOR)));
        data.add(new ItemModel(
                "3 DECELERATE_INTERPOLATOR",
                R.color.material_deep_purple_500,
                R.color.material_deep_purple_300,
                Utils.createInterpolator(Utils.DECELERATE_INTERPOLATOR)));
        data.add(new ItemModel(
                "4 FAST_OUT_LINEAR_IN_INTERPOLATOR",
                R.color.material_indigo_500,
                R.color.material_indigo_300,
                Utils.createInterpolator(Utils.FAST_OUT_LINEAR_IN_INTERPOLATOR)));
        data.add(new ItemModel(
                "5 FAST_OUT_SLOW_IN_INTERPOLATOR",
                R.color.material_blue_500,
                R.color.material_blue_300,
                Utils.createInterpolator(Utils.FAST_OUT_SLOW_IN_INTERPOLATOR)));
        data.add(new ItemModel(
                "6 LINEAR_INTERPOLATOR",
                R.color.material_light_blue_500,
                R.color.material_light_blue_300,
                Utils.createInterpolator(Utils.LINEAR_INTERPOLATOR)));
        data.add(new ItemModel(
                "7 LINEAR_OUT_SLOW_IN_INTERPOLATOR",
                R.color.material_cyan_500,
                R.color.material_cyan_300,
                Utils.createInterpolator(Utils.LINEAR_OUT_SLOW_IN_INTERPOLATOR)));*/
        recyclerView.setAdapter(new RecyclerViewRecyclerAdapter(data));
        /*recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(this, new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {
                        ExpandableRelativeLayout expandableLayout = (ExpandableRelativeLayout) view.findViewById(R.id.expandableLayout);
                        expandableLayout.toggle();
                    }
                })
        );*/
    }
}