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
    EventData particularEvent = new EventData();


    /*//TODO delete this constructor
    public ItemData(String title,String description,int imageUrl){
        //events data
        this.title = title;
        this.imageUrl = imageUrl;
        this.description=description;
    }*/

    public ItemData(String title,String description,int imageUrl,EventData particularEvent){
        //events data
        this.title = title;
        this.imageUrl = imageUrl;
        this.description=description;
        this.particularEvent=particularEvent;
    }


    public ItemData(String title,String description,int imageUrl,ArrayList<ItemData> events){
        //category data
        this.title = title;
        this.imageUrl = imageUrl;
        this.description=description;
        this.events=events;
    }

    // getters & setters
    public String getTitle()
    {
        return this.title;
    }
    public int getImageUrl()
    {
        return this.imageUrl;
    }
    public String getDescription()
    {
        return this.description;
    }
    public ArrayList<ItemData> getEvents()
    {
        return this.events;
    }
    public EventData getParticularEvent() {
        return particularEvent;
    }
}