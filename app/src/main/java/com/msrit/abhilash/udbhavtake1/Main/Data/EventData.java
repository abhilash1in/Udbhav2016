package com.msrit.abhilash.udbhavtake1.Main.Data;

import android.widget.TextView;

/**
 * Created by Abhilash on 14/01/2016.
 */
public class EventData {
    private String event_name,date,time,venue,rules,coordinator,phone;
    int size;
    boolean inter =false; //true=interEvent, false=intraEvent

    public boolean isInter() {
        return inter;
    }

    public void setInter(boolean inter) {
        this.inter = inter;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setEvent_name(String event_name) {

        this.event_name = event_name;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public void setCoordinator(String coordinator) {
        this.coordinator = coordinator;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getEvent_name() {
        return event_name;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getVenue() {
        return venue;
    }

    public String getRules() {
        return rules;
    }

    public String getCoordinator() {
        return coordinator;
    }

    public String getPhone() {
        return phone;
    }

    public int getSize() {
        return size;
    }
}
