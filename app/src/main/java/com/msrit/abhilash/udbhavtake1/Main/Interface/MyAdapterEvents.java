package com.msrit.abhilash.udbhavtake1.Main.Interface;

import android.graphics.Color;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.msrit.abhilash.udbhavtake1.Main.Data.ItemData;
import com.msrit.abhilash.udbhavtake1.R;

import java.util.Iterator;
import java.util.List;


import android.graphics.Color;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.msrit.abhilash.udbhavtake1.Main.Data.ItemData;
import com.msrit.abhilash.udbhavtake1.R;

import java.util.List;


/**
 * Created by Abhilash on 11/12/2015.
 */
public class MyAdapterEvents extends RecyclerView.Adapter<MyAdapterEvents.ViewHolder> {
    /*
        private ItemData[] itemsData;
    */
    final int HEADING =1,EVENT=0;
    public List<ItemData> nitemsData;

       /* public MyAdapter(ItemData[] itemsData) {
            this.itemsData = itemsData;
        }*/

    public MyAdapterEvents(List<ItemData> nitemsData){
        nitemsData.add(0,new ItemData("Inter-College events",0,null,true));
        int n=1;
        while(nitemsData.get(n).isInter())
            n++;
        nitemsData.add(n,new ItemData("Intra-College events",0,null,true));
        this.nitemsData=nitemsData;
    }

    public void delete(int position){
        nitemsData.remove(position);
        notifyItemRemoved(position);
    }

    public MyAdapterEvents.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {

        View itemLayoutView;
        ViewHolder viewHolder;
        // create a new view
        if(viewType == EVENT)
        {
            itemLayoutView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.card, null);
            viewHolder = new ViewHolder(itemLayoutView);
        }
        else
        {
            itemLayoutView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.card, null);
            viewHolder = new ViewHolder(itemLayoutView);
        }

        // create ViewHolder
        /*log("OnCreateViewHolder");*/

        return viewHolder;
    }

    /*public void log(String s){
        Log.v("log", s);
    }*/

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {

        // - get data from your itemsData at this position
        // - replace the contents of the view with that itemsData

        if(getItemViewType(position)==HEADING)
        {

        }
        else
        {

        }

        viewHolder.txtViewTitle.setText(nitemsData.get(position).getTitle());
        viewHolder.txtViewTitle.setSelected(true);
/*
        viewHolder.description.setText(nitemsData.get(position).getDescription());
*/
        if(nitemsData.get(position).getImageUrl()==0)
        {
            viewHolder.imgViewIcon.setVisibility(View.GONE);
            viewHolder.imgViewIcon.setImageDrawable(null);
        }
        else if(nitemsData.get(position).getImageUrl()!=0)
        {
            viewHolder.imgViewIcon.setImageResource(nitemsData.get(position).getImageUrl());
        }

        /*if(nitemsData.get(position).getImageUrl()==0)
        {
            viewHolder.imgViewIcon.setImageDrawable(null);
            viewHolder.imgViewIcon.setVisibility(View.GONE);
        }
        else
        {
            Picasso.with(viewHolder.imgViewIcon.getContext()).load(nitemsData.get(position).getImageUrl()).placeholder(R.mipmap.ic_launcher).into(viewHolder.imgViewIcon);

        }*/

        if(true) {
            if (position == 0)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#2d566b"));
            if (position == 1)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#227586"));
            if (position == 2)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#871e6a"));
            if (position == 3)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#ab1656"));
            if (position == 4)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#125688"));
            if (position == 5)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#3F51B5"));
        }

        //second option

        else
        {
            if (position == 4)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#2d566b"));
            if (position == 2)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#227586"));
            if (position == 0)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#871e6a"));
            if (position == 1)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#ab1656"));
            if (position == 5)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#125688"));
            if (position == 3)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#3F51B5"));
        }
        /*log("OnBindViewHolder");*/

    }

    public int getItemViewType (int position) {
        //Some logic to know which type will come next;
        if(position==0)
            return HEADING;
        else
            return EVENT;
    }

    // inner class to hold a reference to each item of RecyclerView
    public class GeneralViewHolder extends RecyclerView.ViewHolder
    {
        public GeneralViewHolder(View itemView) {
            super(itemView);
        }
    }
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public TextView txtViewTitle;
        public ImageView imgViewIcon;
/*
        public TextView description;
*/
        public CardView cardView;

        public ViewHolder(View itemLayoutView) {
            super(itemLayoutView);
            itemLayoutView.setOnClickListener(this);
            txtViewTitle = (TextView) itemLayoutView.findViewById(R.id.card_item_title);
            imgViewIcon = (ImageView) itemLayoutView.findViewById(R.id.card_item_icon);
/*
            description = (TextView) itemLayoutView.findViewById(R.id.card_item_description);
*/
            cardView = (CardView) itemLayoutView.findViewById(R.id.card_view);
            /*log("ViewHolder called");*/
        }
        @Override
        public void onClick(View v) {

        /*
            mDataset = Functions.getData();
            new FileAdapter();
            notifyDataSetChanged();

            int position = getAdapterPosition();
            // or
            position = getLayoutPosition();
            // both worked for me
        */
           /* delete(getPosition());*/


            /*Intent intent = new Intent(v.getContext(),EventDetailsActivity.class);
            intent.putExtra("event_name",txtViewTitle.getText().toString());
            (v.getContext()).startActivity(intent);*/


            /*Log.v("onclick", txtViewTitle.getText().toString());
            Log.v("onclick", "clicked");*/
        }


    }


    // Return the size of your itemsData (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return nitemsData.size();
    }

    public void remove(int position) {
        nitemsData.remove(position);
        notifyItemRemoved(position);
    }
}
