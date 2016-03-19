package com.msrit.abhilash.udbhavtake1.Main.Data;

import java.util.ArrayList;

/**
 * Created by Abhilash on 11/12/2015.
 */
public class ItemData {


    private String title;
    private String description = "Description";
    private int imageUrl;
    private ArrayList<ItemData> events;
    boolean inter;
    private int amt;
    private EventData particularEvent = new EventData();


    /*//TODO delete this constructor
    public ItemData(String title,String description,int imageUrl){
        //events data
        this.title = title;
        this.imageUrl = imageUrl;
        this.description=description;
    }*/

    public ItemData(String title,int imageUrl,EventData particularEvent, boolean inter, int amt){
        //events data
        this.title = title;
        this.imageUrl = imageUrl;
        this.particularEvent=particularEvent;
        this.inter=inter;
        this.amt = amt;

    }


    public ItemData(String title,int imageUrl,ArrayList<ItemData> events){
        //category data
        this.title = title;
        this.imageUrl = imageUrl;
        this.events=events;
    }

    // getters

    public int getAmt() {
        return amt;
    }
    public String getTitle()
    {
        return this.title;
    }
    public int getImageUrl()
    {
        return this.imageUrl;
    }
    public ArrayList<ItemData> getEvents()
    {
        return this.events;
    }
    public EventData getParticularEvent() {
        return particularEvent;
    }
    public boolean isInter() {
        return this.inter;
    }
}