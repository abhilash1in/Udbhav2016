package com.msrit.abhilash.udbhavtake1.Main.Fragments;

import android.os.Bundle;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.msrit.abhilash.udbhavtake1.Main.Data.Data;
import com.msrit.abhilash.udbhavtake1.Main.Data.ItemData;
import com.msrit.abhilash.udbhavtake1.Main.Interface.MyAdapter;
import com.msrit.abhilash.udbhavtake1.Main.Interface.RecyclerItemClickListener;
import com.msrit.abhilash.udbhavtake1.R;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OneFragment2 extends android.support.v4.app.Fragment
{
    public TextView name;
    public ImageView imgViewIcon;
    public CardView cardView;
    public final static ArrayList<ItemData> categories = Data.getCategories();
    public static ItemData particularCategory;

    public OneFragment2() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_one, container, false);




        /*
        categories.remove(0);
        item_remove(categories,"Favourite");

        categories.remove(new ItemData("Cloud",R.mipmap.ic_launcher));
        */

        final RecyclerView recyclerView = (RecyclerView) root.findViewById(R.id.recyclerViewOne);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        MyAdapter mAdapter = new MyAdapter(categories);
        recyclerView.setAdapter(mAdapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(getActivity(), new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {
                        // TODO Handle item click

                        particularCategory = categories.get(position);

                        name = (TextView) view.findViewById(R.id.card_item_title);
                        imgViewIcon = (ImageView) view.findViewById(R.id.card_item_icon);
                        cardView = (CardView) view.findViewById(R.id.card_view);

                        /*Log.v("position",name.getText().toString());*/

                        /*Bundle args = new Bundle();
                        args.putString("CategoryName", name.getText().toString());*/

                        FragmentTransaction trans = getFragmentManager()
                                .beginTransaction();
				/*
				 * IMPORTANT: We use the "root frame" defined in
				 * "root_fragment.xml" as the reference to replace fragment
				 */
                        TwoFragment2 fragment2 = new TwoFragment2();
                        /*fragment2.setArguments(args);*/
                        trans.replace(R.id.root_frame, fragment2);

				/*
				 * IMPORTANT: The following lines allow us to add the fragment
				 * to the stack and return to it later, by pressing back
				 */
                        trans.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                        trans.addToBackStack(null);
                        trans.commit();
                    }
                })
        );
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

