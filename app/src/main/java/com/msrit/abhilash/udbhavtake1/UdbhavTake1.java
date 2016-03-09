package com.msrit.abhilash.udbhavtake1;

import android.app.Application;
import android.widget.Toast;

import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.SaveCallback;

/**
 * Created by Abhilash on 07/03/2016.
 */
public class UdbhavTake1 extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.enableLocalDatastore(this);
        Parse.initialize(this);


        /*final ParseObject testObject = new ParseObject("TestObject");
        testObject.put("foo", "bar");
        testObject.saveInBackground(new SaveCallback() {
            @Override
            public void done(ParseException e) {
                if (e == null) {
                    Toast.makeText(getApplicationContext(), "Initialised", Toast.LENGTH_SHORT).show();
                } else {
                    e.printStackTrace();
                    Toast.makeText(getApplicationContext(), "Fail", Toast.LENGTH_SHORT).show();
                }
            }
        });*/
    }
}
