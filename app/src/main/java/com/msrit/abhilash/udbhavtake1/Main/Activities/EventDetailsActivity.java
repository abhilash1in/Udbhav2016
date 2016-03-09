package com.msrit.abhilash.udbhavtake1.Main.Activities;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.MenuItem;
import android.support.v4.app.NavUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.msrit.abhilash.udbhavtake1.Main.Data.Data;
import com.msrit.abhilash.udbhavtake1.Main.Data.EventData;
import com.msrit.abhilash.udbhavtake1.Main.Fragments.TwoFragment2;
import com.msrit.abhilash.udbhavtake1.Old.TwoFragment;
import com.msrit.abhilash.udbhavtake1.R;

public class EventDetailsActivity extends AppCompatActivity {

    public String data;
    public android.support.v7.widget.Toolbar toolbar;
    public CollapsingToolbarLayout collapsingToolbar;
    View timingsLayout;
    View rulesLayout;
    View contactLayout;
    View registerButtonLayout;
    TextView date,time,location,rules,coordinator;
    String phoneNumber;
    ImageView call,sms,whatsapp;
    Button register;
    EventData event = TwoFragment2.ParticularEvent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
/*
        setContentView(R.layout.activity_event_details);
*/        setContentView(R.layout.event_details2);

       /* RecyclerView recyclerView = (RecyclerView) findViewById(R.id.scrollableview);
        final List<ItemData> nitemsData = new ArrayList<ItemData>();
        nitemsData.add( new ItemData("Literature",R.mipmap.ic_launcher));
        nitemsData.add( new ItemData("Art",R.mipmap.ic_launcher));
        nitemsData.add(new ItemData("Music", R.mipmap.ic_launcher));
        nitemsData.add( new ItemData("Theatre",R.mipmap.ic_launcher));
        nitemsData.add( new ItemData("Dance",R.mipmap.ic_launcher));
        nitemsData.add( new ItemData("Udbhav Cup",R.mipmap.ic_launcher));
        nitemsData.add(new ItemData("Misc", R.mipmap.ic_launcher));*/


        /*
        nitemsData.remove(0);
        item_remove(nitemsData,"Favourite");

        nitemsData.remove(new ItemData("Cloud",R.mipmap.ic_launcher));
        */


        /*recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        MyAdapter mAdapter = new MyAdapter(nitemsData);
        recyclerView.setAdapter(mAdapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());*/

        toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.anim_toolbar);
        setSupportActionBar(toolbar);
        collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle(event.getEvent_name());
        ImageView header = (ImageView) findViewById(R.id.header);
        collapsingToolbar.setContentScrimColor(getResources().getColor(R.color.colorPrimary));


        timingsLayout = findViewById(R.id.timingsLayout);
        rulesLayout = findViewById(R.id.rulesLayout);
        contactLayout = findViewById(R.id.contactLayout);
        registerButtonLayout = findViewById(R.id.registerButton);

        date = (TextView) timingsLayout.findViewById(R.id.date);
        time = (TextView) timingsLayout.findViewById(R.id.time);
        location = (TextView) timingsLayout.findViewById(R.id.venue);

        rules = (TextView) rulesLayout.findViewById(R.id.rules);



        register =(Button) registerButtonLayout.findViewById(R.id.rButton);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Home2.setPage(1);
                Intent intent =  new Intent(EventDetailsActivity.this, Home2.class);
                intent.putExtra("EXTRA_PAGE", 1);
                startActivity(intent);
            }
        });

        coordinator = (TextView) contactLayout.findViewById(R.id.coordinator);
        call = (ImageView) contactLayout.findViewById(R.id.call);
        sms = (ImageView) contactLayout.findViewById(R.id.sms);
        whatsapp = (ImageView) contactLayout.findViewById(R.id.whatsapp);



        date.setText(event.getDate());
        time.setText(event.getTime());
        location.setText(event.getVenue());
        rules.setText(event.getRules());
        coordinator.setText(event.getCoordinator());
        phoneNumber = event.getPhone();

        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //TODO is internet checking required?
                /*if(isNetworkAvailable()==false) {
                    Snackbar snackbar = Snackbar
                            .make(findViewById(R.id.snackbarCoordinatorLayout), "Check your internet connection", Snackbar.LENGTH_LONG);
                    snackbar.show();
                }
                else {
                    Uri uri = Uri.parse("smsto:" + phoneNumber);
                    Intent i = new Intent(Intent.ACTION_SENDTO, uri);
                    i.putExtra("sms_body", "Test");
                    i.setPackage("com.whatsapp");
                    startActivity(i);
                }*/

                Uri uri = Uri.parse("smsto:" + phoneNumber);
                Intent i = new Intent(Intent.ACTION_SENDTO, uri);
                i.putExtra("sms_body", "Test");
                i.setPackage("com.whatsapp");
                startActivity(i);
            }
        });
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + phoneNumber));
                    startActivity(intent);
                } catch (SecurityException e) {
                    //TODO add number to dialer, doesn't require permission
                    Toast.makeText(EventDetailsActivity.this, "You've disabled permissions to make calls through this app", Toast.LENGTH_SHORT).show();
                }

            }
        });

        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent smsIntent = new Intent(android.content.Intent.ACTION_VIEW);
                smsIntent.setType("vnd.android-dir/mms-sms");
                smsIntent.putExtra("address",phoneNumber);
                smsIntent.putExtra("sms_body","Hey! I'm interested in the event "+event.getEvent_name()+" and I want to know" +
                        " more details about it.");
                startActivity(smsIntent);
            }
        });

       /* ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {

            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.hide();
        }*/

        data = getIntent().getExtras().getString("event_name", "Try again");
        Log.v("event name", data);
        /*TextView event_name = (TextView) findViewById(R.id.event_name);
        event_name.setText(data);*/

        /*findViewById(R.id.register).setOnTouchListener(mDelayHideTouchListener);*/
    }

    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            // This ID represents the Home or Up button.
            NavUtils.navigateUpFromSameTask(this);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * Touch listener to use for in-layout UI controls to delay hiding the
     * system UI. This is to prevent the jarring behavior of controls going away
     * while interacting with activity UI.
     */
    private final View.OnTouchListener mDelayHideTouchListener = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {
            /*if (AUTO_HIDE) {
                delayedHide(AUTO_HIDE_DELAY_MILLIS);
            }*/
            return false;
        }
    };

}
