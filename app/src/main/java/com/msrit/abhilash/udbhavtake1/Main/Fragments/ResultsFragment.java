package com.msrit.abhilash.udbhavtake1.Main.Fragments;

import android.app.ProgressDialog;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v4.app.Fragment;
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
public class ResultsFragment extends Fragment {
    /*LinearLayout ll;*/
    TextView msg;
    RecyclerView recyclerView;
    Button tryAgain;
    ProgressDialog dialog;
    boolean flag = false;
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



/*
        ll = (LinearLayout) view.findViewById(R.id.checkConnection);
*/
        msg = (TextView) view.findViewById(R.id.msg_result);
        tryAgain = (Button) view.findViewById(R.id.tryAgainButton);
        Log.v("test",tryAgain.getText().toString());
        attachListener();
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
            public void done(List<ParseObject> list, ParseException e) {
                if(e==null)
                {
                    if(dialog!=null)
                    {
                        dialog.dismiss();
                    }
                    Log.v("test", "fetched,size = " + list.size());
                    if(list.size()!=0)
                    {
                        /*ll.setVisibility(View.GONE);*/

                        msg.setVisibility(View.GONE);
                        tryAgain.setVisibility(View.GONE);

                        ResultsAdapter mAdapter = new ResultsAdapter(list);
                        recyclerView.setItemAnimator(new DefaultItemAnimator());
                        recyclerView.setAdapter(mAdapter);
                        /*recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(getActivity(), new RecyclerItemClickListener.OnItemClickListener() {
                                    @Override
                                    public void onItemClick(View view, int position) {

                                    }
                                })
                        );*/
                    }
                    else if (list.size()==0)
                    {
                        msg.setVisibility(View.VISIBLE);
                        msg.setText("Results not yet available");
                        tryAgain.setVisibility(View.VISIBLE);
                        /*attachListener();*/

                        /*ll.setVisibility(View.VISIBLE);*/
                    }
                }
                else
                {
                    e.printStackTrace();
                }
            }
        });
    }

    private void attachListener()
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
    }

}
