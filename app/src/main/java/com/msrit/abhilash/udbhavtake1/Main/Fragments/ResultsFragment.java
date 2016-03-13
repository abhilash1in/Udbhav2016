package com.msrit.abhilash.udbhavtake1.Main.Fragments;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.msrit.abhilash.udbhavtake1.Main.Interface.RecyclerItemClickListener;
import com.msrit.abhilash.udbhavtake1.Main.Interface.ResultsAdapter;
import com.msrit.abhilash.udbhavtake1.R;
import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import java.util.List;

/**
 * Created by Abhilash on 09/03/2016.
 */
public class ResultsFragment extends Fragment{

    private SwipeRefreshLayout mRefreshLayout;
    TextView msg;
    RecyclerView recyclerView;
    Button tryAgain;
    ProgressDialog dialog;
    TextView first,second,third;
    boolean flag = false;
    View d;
    ResultsAdapter mAdapter;
    public ResultsFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_results, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.results_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        mRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.swipe_container);
/*
        ll = (LinearLayout) view.findViewById(R.id.checkConnection);
*/
        msg = (TextView) view.findViewById(R.id.msg_result);
        tryAgain = (Button) view.findViewById(R.id.tryAgainButton);
        Log.v("test", tryAgain.getText().toString());
        tryAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("test", "clicked, flag =" + flag);
                if (isNetworkAvailable()) {
                    flag = true;
                    fetchResults();
                } else
                {
                    Toast.makeText(getActivity(), "No internet connection!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        tryAgain.setVisibility(View.GONE);

        if(isNetworkAvailable())
        {
            fetchResults();
        }
        else {
            /*ll.setVisibility(View.VISIBLE);*/
            msg.setText("No internet connection!");
            tryAgain.setVisibility(View.VISIBLE);
            /*attachListener();*/
        }


        mRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                fetchResults();
            }
        });

        return view;
    }


    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getActivity().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    private void fetchResults()
    {
        Log.v("test","fetch called");
        if(flag)
        {
            dialog = ProgressDialog.show(getActivity(), "","Loading. Please wait...", true);
            flag=false;
        }
        ParseQuery<ParseObject> query = new ParseQuery<>("results");
        query.findInBackground(new FindCallback<ParseObject>() {
            @Override
            public void done(final List<ParseObject> list, ParseException e) {
                if (e == null) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    Log.v("test", "fetched,size = " + list.size());
                    if (list.size() != 0) {
                        /*ll.setVisibility(View.GONE);*/

                        msg.setVisibility(View.GONE);
                        tryAgain.setVisibility(View.GONE);

                        mAdapter = new ResultsAdapter(list);
                        recyclerView.setAdapter(mAdapter);
                        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(getActivity(), new RecyclerItemClickListener.OnItemClickListener() {
                                    @Override
                                    public void onItemClick(View view, int position) {
                                        if(d!=null){
                                            ((ViewGroup)d.getParent()).removeAllViews();
                                        }
                                        d = View.inflate(getContext(), R.layout.results_dialog_layout,null);
                                        first = (TextView) d.findViewById(R.id.first_winner);
                                        second = (TextView) d.findViewById(R.id.second_winner);
                                        third = (TextView) d.findViewById(R.id.third_winner);

                                        first.setText(list.get(position).getString("first"));
                                        second.setText(list.get(position).getString("second"));
                                        third.setText(list.get(position).getString("third"));

                                        AlertDialog.Builder alert = new AlertDialog.Builder(getActivity());
                                        alert.setView(d);
                                        alert.setTitle(list.get(position).getString("event_name"));
                                        alert.setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                                            public void onClick(DialogInterface dialog, int which) {
                                                // continue with delete
                                                dialog.dismiss();
                                            }
                                        })
                                                .show();
                                    }
                                })
                        );
                    } else if (list.size() == 0) {
                        msg.setVisibility(View.VISIBLE);
                        msg.setText("Results not yet available");
                        tryAgain.setVisibility(View.VISIBLE);
                        /*attachListener();*/

                        /*ll.setVisibility(View.VISIBLE);*/
                    }

                } else {
                    e.printStackTrace();
                }
            }
        });
        mRefreshLayout.setRefreshing(false);
    }

    /*private void attachListener()
    {
        tryAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("test", "clicked, flag =" + flag);
                if (isNetworkAvailable()) {
                    flag = true;
                    fetchResults();
                } else
                    Toast.makeText(getActivity(), "No internet connection!", Toast.LENGTH_SHORT).show();
            }
        });
    }*/

}
