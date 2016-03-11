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
import com.parse.ParseObject;

import java.util.List;


/**
 * Created by Abhilash on 11/12/2015.
 */
public class ResultsAdapter extends RecyclerView.Adapter<ResultsAdapter.ViewHolder> {

    public List<ParseObject> nitemsData;

    public ResultsAdapter(List<ParseObject> nitemsData){
        this.nitemsData=nitemsData;
    }

    public ResultsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,int viewType) {
        // create a new view
        View itemLayoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.results_card, null);

        // create ViewHolder

        ViewHolder viewHolder = new ViewHolder(itemLayoutView);
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

        viewHolder.txtViewTitle.setText(nitemsData.get(position).getString("event_name"));
        viewHolder.txtViewTitle.setSelected(true);

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

    // inner class to hold a reference to each item of RecyclerView
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public TextView txtViewTitle;
        public CardView cardView;

        public ViewHolder(View itemLayoutView) {
            super(itemLayoutView);
            itemLayoutView.setOnClickListener(this);
            txtViewTitle = (TextView) itemLayoutView.findViewById(R.id.event_name);
            cardView = (CardView) itemLayoutView.findViewById(R.id.results_card_view);
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
