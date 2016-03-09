package com.msrit.abhilash.udbhavtake1.Old;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.msrit.abhilash.udbhavtake1.Main.Data.Data;
import com.msrit.abhilash.udbhavtake1.Main.Data.ItemData;
import com.msrit.abhilash.udbhavtake1.R;


import java.util.Iterator;
import java.util.List;

public class TwoFragment extends android.support.v4.app.Fragment{

    public TwoFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Log.v("error","twoFragment");
        // Inflate the layout for this fragment
        View root= inflater.inflate(R.layout.fragment_two, container, false);

        final List<ItemData> nitemsData = Data.getLitEvents();

        item_remove(nitemsData,"Favourite");

        /*UltimateRecyclerView ultimateRecyclerView = (UltimateRecyclerView) root.findViewById(R.id.ultimate_recycler_view);
        ultimateRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        final MyAdapter mAdapter = new MyAdapter(nitemsData);
        ultimateRecyclerView.setAdapter(mAdapter);
        ultimateRecyclerView.setItemAnimator(new DefaultItemAnimator());*/
        return root;
    }

    public void item_remove(List<ItemData> nitemsData,String att){
        Iterator<ItemData> itr = nitemsData.iterator();
        while (itr.hasNext()) {
            ItemData nitem = itr.next();

            if (nitem.getTitle().equals(att))
            {
                itr.remove();
            }
        }

    }

}