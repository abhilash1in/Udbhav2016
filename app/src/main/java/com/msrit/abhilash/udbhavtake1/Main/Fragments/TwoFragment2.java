package com.msrit.abhilash.udbhavtake1.Main.Fragments;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.msrit.abhilash.udbhavtake1.Main.Activities.EventDetailsActivity;
import com.msrit.abhilash.udbhavtake1.Main.Data.EventData;
import com.msrit.abhilash.udbhavtake1.Main.Data.ItemData;
import com.msrit.abhilash.udbhavtake1.Main.Interface.MyAdapterEvents;
import com.msrit.abhilash.udbhavtake1.Main.Interface.RecyclerItemClickListener;
import com.msrit.abhilash.udbhavtake1.R;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/*import java.util.Objects;
import java.util.stream.Collectors;*/


public class TwoFragment2 extends android.support.v4.app.Fragment{

    public static EventData ParticularEvent;
    static ArrayList<ItemData> events;

    public TwoFragment2() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {

        Log.v("error", "twoFragment");
        // Inflate the layout for this fragment
        View root= inflater.inflate(R.layout.fragment_two, container, false);



/*        String categoryName = getArguments().getString("CategoryName");
        ArrayList<ItemData> categories = OneFragment2.categories;*/

        ItemData particularCategory = OneFragment2.particularCategory;
        events=particularCategory.getEvents();


        /*for(int i=0;i<categories.size();i++)
        {
            ItemData temp = categories.get(i);
            if(temp.getTitle()==categoryName)
            {
                events=temp.getEvents();
            }
        }*/
/*
        ArrayList<ItemData> result = categories.stream()
                                    .filter(a -> Objects.equals(a.title, "three"))
                                    .collect(Collectors.toList());
*/

/*
        final ArrayList<ArrayList<ItemData>> eventList = new ArrayList<ArrayList<ItemData>>();
*/

        /*item_remove(events, "LitEvent0");*/

        /*UltimateRecyclerView ultimateRecyclerView = (UltimateRecyclerView) root.findViewById(R.id.ultimate_recycler_view);
        ultimateRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        final MyAdapterEvents mAdapter = new MyAdapterEvents(events);
        ultimateRecyclerView.setAdapter(mAdapter);
        ultimateRecyclerView.setItemAnimator(new DefaultItemAnimator());
 *//*       ultimateRecyclerView.setOnClickListener(
                new RecyclerItemClickListener(getActivity(), new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {
                        // TODO Handle item click

                        Intent intent = new Intent(view.getContext(),EventDetailsActivity.class);
                        intent.putExtra("event_name",name.getText().toString());
                        (view.getContext()).startActivity(intent);

                    }
                })

        );*/

        final RecyclerView recyclerView = (RecyclerView) root.findViewById(R.id.recyclerViewTwo);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        MyAdapterEvents mAdapter = new MyAdapterEvents(events);
        recyclerView.setAdapter(mAdapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(getActivity(), new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        // TODO Handle item click

                        ParticularEvent = events.get(position).getParticularEvent();
                        if (ParticularEvent != null) {
                            Intent intent = new Intent(view.getContext(),EventDetailsActivity.class);
                        /*intent.putExtra("event_name",name.getText().toString());*/
                            intent.putExtra("event_name","Event Name");
                            (view.getContext()).startActivity(intent);
                        }

                        /*Log.v("itemclick","list item: "+name.getText().toString());*/
                    }
                })
        );

        return root;
    }

    public void item_remove(List<ItemData> nitemsData,String att){
        Iterator<ItemData> itr = nitemsData.iterator();
        while (itr.hasNext()) {
            ItemData nitem = itr.next();

            if (nitem.getTitle().equals(att)) {
                itr.remove();
            }
        }

    }

    /*public ItemData getParticularEvent()
    {
        return ParticularEvent;
    }*/

}