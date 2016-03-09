package com.msrit.abhilash.udbhavtake1.Old;

import android.os.Bundle;

import android.support.v4.view.ViewPager;
import android.support.v7.widget.CardView;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
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

import java.util.Iterator;
import java.util.List;

public class OneFragment extends android.support.v4.app.Fragment
{
    public TextView name;
    public ImageView imgViewIcon;
    public CardView cardView;

    public OneFragment() {
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
        RecyclerView recyclerView = (RecyclerView) root.findViewById(R.id.recyclerViewOne);
        final List<ItemData> nitemsData = Data.getCategories();


        /*
        nitemsData.remove(0);
        item_remove(nitemsData,"Favourite");

        nitemsData.remove(new ItemData("Cloud",R.mipmap.ic_launcher));
        */


        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        MyAdapter mAdapter = new MyAdapter(nitemsData);
        recyclerView.setAdapter(mAdapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(getActivity(), new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {
                        // TODO Handle item click
                        name = (TextView) view.findViewById(R.id.item_title);
                        imgViewIcon = (ImageView) view.findViewById(R.id.item_icon);
                        cardView = (CardView) view.findViewById(R.id.card_view);

                        android.support.v4.app.Fragment fragment = new TwoFragment();

                        android.support.v4.app.FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                        Log.v("id", container.getId() + "");

                        /*transaction.remove(OneFragment.this);
                        transaction.add(container.getId(),fragment,"three").commit();*/
/*
                        transaction.add(R.id.one_container,fragment).commit();
*/
                        ViewPager vpViewPager = (ViewPager) container;

                        transaction.replace(vpViewPager.getId(),fragment);
                        transaction.show(fragment);
                        transaction.addToBackStack(null);
                        transaction.commit();


                        /*CustomTabActivity tabActivity = (CustomTabActivity) getActivity();
                        tabActivity.changeFragment(fragment);*/

/*
                        ((BaseContainerFragment)getParentFragment()).replaceFragment(fragment, true);
*/


                        /*Intent intent = new Intent(view.getContext(),EventDetailsActivity.class);
                        intent.putExtra("event_name",name.getText().toString());
                        (view.getContext()).startActivity(intent);
                        Log.v("itemclick","list item: "+name.getText().toString());*/

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

