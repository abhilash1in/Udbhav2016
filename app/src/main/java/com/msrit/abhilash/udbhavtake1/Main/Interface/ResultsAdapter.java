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
        View itemLayoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.results_card, parent, false);

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
            else if (position == 18)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#2d566b"));
            else if (position == 19)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#227586"));
            else if (position == 20)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#871e6a"));
            else if (position == 21)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#ab1656"));
            else if (position == 22)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#125688"));
            else if (position == 23)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#3F51B5"));
            else if (position == 24)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#2d566b"));
            else if (position == 25)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#227586"));
            else if (position == 26)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#871e6a"));
            else if (position == 27)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#ab1656"));
            else if (position == 28)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#125688"));
            else if (position == 29)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#3F51B5"));
            else if (position == 30)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#2d566b"));
            else if (position == 31)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#227586"));
            else if (position == 32)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#871e6a"));
            else if (position == 33)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#ab1656"));
            else if (position == 34)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#125688"));
            else if (position == 35)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#3F51B5"));
            else if (position == 36)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#2d566b"));
            else if (position == 37)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#227586"));
            else if (position == 38)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#871e6a"));
            else if (position == 39)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#ab1656"));
            else if (position == 40)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#125688"));
            else if (position == 41)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#3F51B5"));
            else if (position == 42)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#2d566b"));
            else if (position == 43)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#227586"));
            else if (position == 44)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#871e6a"));
            else if (position == 45)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#ab1656"));
            else if (position == 46)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#125688"));
            else if (position == 47)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#3F51B5"));
            else if (position == 48)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#2d566b"));
            else if (position == 49)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#227586"));
            else if (position == 50)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#871e6a"));
            else if (position == 51)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#ab1656"));
            else if (position == 52)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#125688"));
            else if (position == 53)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#3F51B5"));
            else if (position == 54)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#2d566b"));
            else if (position == 55)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#227586"));
            else if (position == 56)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#871e6a"));
            else if (position == 57)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#ab1656"));
            else if (position == 58)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#125688"));
            else if (position == 59)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#3F51B5"));
            else if (position == 60)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#2d566b"));
            else if (position == 61)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#227586"));
            else if (position == 62)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#871e6a"));
            else if (position == 63)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#ab1656"));
            else if (position == 64)
                viewHolder.cardView.setCardBackgroundColor(Color.parseColor("#125688"));


        }


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
