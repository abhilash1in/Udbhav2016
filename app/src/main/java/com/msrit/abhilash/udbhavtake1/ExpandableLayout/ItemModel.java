package com.msrit.abhilash.udbhavtake1.ExpandableLayout;

/**
 * Created by Abhilash on 28/01/2016.
 */
import android.animation.TimeInterpolator;

import com.msrit.abhilash.udbhavtake1.Main.Data.ItemData;

import java.util.ArrayList;

public class ItemModel {
    public final String description;
    public final int colorId1;
    public final int colorId2;
    public final TimeInterpolator interpolator;
    public final ArrayList<ItemData> events;

    public ItemModel(String description, int colorId1, int colorId2, TimeInterpolator interpolator,ArrayList<ItemData> events) {
        this.description = description;
        this.colorId1 = colorId1;
        this.colorId2 = colorId2;
        this.interpolator = interpolator;
        this.events=events;
    }
}