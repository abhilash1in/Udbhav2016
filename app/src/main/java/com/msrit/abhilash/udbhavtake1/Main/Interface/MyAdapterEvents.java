package com.msrit.abhilash.udbhavtake1.Main.Interface;

import android.graphics.Color;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.msrit.abhilash.udbhavtake1.Main.Data.ItemData;
import com.msrit.abhilash.udbhavtake1.R;

import java.util.List;


/**
 * Created by Abhilash on 11/12/2015.
 */
public class MyAdapterEvents extends RecyclerView.Adapter<MyAdapterEvents.GeneralViewHolder> {
    /*
        private ItemData[] itemsData;
    */
    final int HEADING =1,EVENT=0;
    public List<ItemData> nitemsData;
    int n=0;

       /* public MyAdapter(ItemData[] itemsData) {
            this.itemsData = itemsData;
        }*/

    public MyAdapterEvents(List<ItemData> nitemsData, int n){
        this.n=n;
        this.nitemsData=nitemsData;
    }

    public void delete(int position){
        nitemsData.remove(position);
        notifyItemRemoved(position);
    }

    public MyAdapterEvents.GeneralViewHolder onCreateViewHolder(ViewGroup parent,int viewType) {
        GeneralViewHolder holder;
        View itemLayoutView;
        // create a new view
        if(viewType == EVENT)
        {
            itemLayoutView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.card, null);
            holder = new ViewHolderEvents(itemLayoutView);
        }
        else
        {
            itemLayoutView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.card, null);
            holder = new ViewHolderHeading(itemLayoutView);
        }

        // create ViewHolder
        /*log("OnCreateViewHolder");*/

        return holder;
    }

    /*public void log(String s){
        Log.v("log", s);
    }*/

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(GeneralViewHolder vh, int position) {

        // - get data from your itemsData at this position
        // - replace the contents of the view with that itemsData

        if(getItemViewType(position)==EVENT)
        {

            ViewHolderEvents viewHolder = (ViewHolderEvents) vh;

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

/*
            Log.v("position",""+position);
*/


                if(true) {
                    if (position == 0)
                        viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#2d566b"));
                    else if (position == 1)
                        viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#227586"));
                    else if (position == 2)
                        viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#871e6a"));
                    else if (position == 3)
                        viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#ab1656"));
                    else if (position == 4)
                        viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#125688"));
                    else if (position == 5)
                        viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#3F51B5"));
                    else if (position == 6)
                        viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#2d566b"));
                    else if (position == 7)
                        viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#227586"));
                    else if (position == 8)
                        viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#871e6a"));
                    else if (position == 9)
                        viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#ab1656"));
                    else if (position == 10)
                        viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#125688"));
                    else if (position == 11)
                        viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#3F51B5"));
                    else if (position == 12)
                        viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#2d566b"));
                    else if (position == 13)
                        viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#227586"));
                    else if (position == 14)
                        viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#871e6a"));
                    else if (position == 15)
                        viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#ab1656"));
                    else if (position == 16)
                        viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#125688"));
                    else if (position == 17)
                        viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#3F51B5"));
            }

            //second option

            else
            {
                /*if (position == 4)
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
                    viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#3F51B5"));*/


                if (position == 0)
                    viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#2d102c"));
                else if (position == 1)
                    viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#530030"));
                else if (position == 2)
                    viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#820233"));
                else if (position == 3)
                    viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#cb293e"));
                else if (position == 4)
                    viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#ef4339"));
                else if (position == 5)
                    viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#2d102c"));
                else if (position == 6)
                    viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#530030"));
                else if (position == 7)
                    viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#820233"));
                else if (position == 8)
                    viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#cb293e"));
                else if (position == 9)
                    viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#ef4339"));
                else if (position == 10)
                    viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#2d102c"));
                else if (position == 11)
                    viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#530030"));
            }

        }
        else
        {
            ViewHolderHeading viewHolder = (ViewHolderHeading) vh;
            viewHolder.txtViewTitle.setText(nitemsData.get(position).getTitle());
            viewHolder.txtViewTitle.setSelected(true);
/*
            viewHolder.cardView.setCardBackgroundColor(R.color.colorPrimary);
*/

            viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#34495e"));

        }

        /*log("OnBindViewHolder");*/

    }

    @Override
    public long getItemId(int position) {
        ItemData item = nitemsData.get(position);
        return item.hashCode();
    }

    public int getItemViewType (int position) {
        //Some logic to know which type will come next;
        if(position==0||position==n)
            return HEADING;
        else
            return EVENT;
    }

    // inner class to hold a reference to each item of RecyclerView
    public class GeneralViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        public GeneralViewHolder(View itemView) {
            super(itemView);
        }

        @Override
        public void onClick(View v) {

        }
    }
    public class ViewHolderEvents extends GeneralViewHolder implements View.OnClickListener{

        public TextView txtViewTitle;
        public ImageView imgViewIcon;
/*
        public TextView description;
*/
        public CardView cardView;

        public ViewHolderEvents(View itemLayoutView) {
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

    public class ViewHolderHeading extends GeneralViewHolder implements View.OnClickListener{

        public TextView txtViewTitle;
        public ImageView imgViewIcon;
        /*
                public TextView description;
        */
        public CardView cardView;

        public ViewHolderHeading(View itemLayoutView) {
            super(itemLayoutView);
            itemLayoutView.setOnClickListener(this);
            txtViewTitle = (TextView) itemLayoutView.findViewById(R.id.card_item_title);
            txtViewTitle.setGravity(Gravity.CENTER_HORIZONTAL);
            imgViewIcon = (ImageView) itemLayoutView.findViewById(R.id.card_item_icon);
            imgViewIcon.setVisibility(View.GONE);
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
