package com.msrit.abhilash.udbhavtake1.ExpandableLayout;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.github.aakira.expandablelayout.ExpandableLayout;
import com.github.aakira.expandablelayout.ExpandableLayoutListenerAdapter;
import com.github.aakira.expandablelayout.ExpandableRelativeLayout;
import com.github.aakira.expandablelayout.Utils;
import com.msrit.abhilash.udbhavtake1.Main.Data.ItemData;
import com.msrit.abhilash.udbhavtake1.R;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class RecyclerViewRecyclerAdapter extends RecyclerView.Adapter<RecyclerViewRecyclerAdapter.ViewHolder> {

    private final List<ItemModel> data;
    private Context context;
    private SparseBooleanArray expandState = new SparseBooleanArray();
    ArrayList<ItemData> events;

    public RecyclerViewRecyclerAdapter(final List<ItemModel> data) {
        this.data = data;
        for (int i = 0; i < data.size(); i++) {
            expandState.append(i, false);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
        this.context = parent.getContext();
        return new ViewHolder(LayoutInflater.from(context)
                .inflate(R.layout.recycler_view_list_row, parent, false));
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        final ItemModel item = data.get(position);
        final Resources resource = context.getResources();

        holder.textView.setText(item.description);
        holder.itemView.setBackgroundColor(resource.getColor(item.colorId1));
        holder.expandableLayout.setBackgroundColor(resource.getColor(item.colorId2));
        holder.expandableLayout.setInterpolator(item.interpolator);
        holder.expandableLayout.setExpanded(expandState.get(position));
        holder.expandableLayout.setListener(new ExpandableLayoutListenerAdapter() {
            @Override
            public void onPreOpen() {
                createRotateAnimator(holder.buttonLayout, 0f, 180f).start();
                expandState.put(position, true);
            }

            @Override
            public void onPreClose() {
                createRotateAnimator(holder.buttonLayout, 180f, 0f).start();
                expandState.put(position, false);
            }
        });

        holder.buttonLayout.setRotation(expandState.get(position) ? 180f : 0f);
        holder.buttonLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                onClickButton(holder.expandableLayout);
            }
        });
        holder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickButton(holder.expandableLayout);
            }
        });

        holder.ll.setOrientation(LinearLayout.VERTICAL);
        holder.ll.removeAllViews();

        events = item.events;
        Iterator<ItemData> it  = events.iterator();
        while(it.hasNext()) {


            RelativeLayout rl = new RelativeLayout(context);
            RelativeLayout.LayoutParams rlp = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.WRAP_CONTENT,
                    RelativeLayout.LayoutParams.WRAP_CONTENT);
            rl.setLayoutParams(rlp);

            TextView tv = new TextView(context);
            tv.setText(it.next().getTitle());
            final RelativeLayout.LayoutParams param =
                    new RelativeLayout.LayoutParams(
                            ViewGroup.LayoutParams.MATCH_PARENT,
                            ViewGroup.LayoutParams.WRAP_CONTENT);
            /*param.addRule(RelativeLayout.CENTER_IN_PARENT,  RelativeLayout.TRUE);*/


            final ExpandableRelativeLayout erl = new ExpandableRelativeLayout(context);
            erl.setExpanded(false);
            erl.setBackgroundColor(Color.BLACK);
            erl.setLayoutParams(new LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));

            TextView tv2 = new TextView(context);
            tv2.setText("testing testing 1234");
            tv2.setTextColor(Color.WHITE);
            erl.addView(tv2);

            rl.addView(tv,param);
            rl.addView(erl);


            tv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    erl.toggle();
                }
            });

            holder.ll.addView(rl);

            /*CheckBox cb = new CheckBox(context);
            cb.setText(it.next().getTitle());
            holder.ll.addView(cb);*/
        }
    }

    private void onClickButton(final ExpandableLayout expandableLayout) {
        expandableLayout.toggle();
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;
        public RelativeLayout buttonLayout;
        public ExpandableRelativeLayout expandableLayout;
        public LinearLayout ll;

        public ViewHolder(View v) {
            super(v);
            textView = (TextView) v.findViewById(R.id.textView);
            buttonLayout = (RelativeLayout) v.findViewById(R.id.button);
            expandableLayout = (ExpandableRelativeLayout) v.findViewById(R.id.expandableLayout);
            ll = (LinearLayout) v.findViewById(R.id.event_list_register);
        }
    }

    public ObjectAnimator createRotateAnimator(final View target, final float from, final float to) {
        ObjectAnimator animator = ObjectAnimator.ofFloat(target, "rotation", from, to);
        animator.setDuration(300);
        animator.setInterpolator(Utils.createInterpolator(Utils.LINEAR_INTERPOLATOR));
        return animator;
    }
}