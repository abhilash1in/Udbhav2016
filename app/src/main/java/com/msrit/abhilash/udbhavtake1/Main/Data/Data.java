package com.msrit.abhilash.udbhavtake1.Main.Data;

import com.msrit.abhilash.udbhavtake1.R;

import java.util.ArrayList;

/**
 * Created by Abhilash on 14/01/2016.
 */
public class Data {




    public static ArrayList<ItemData> getCategories()
    {
        final ArrayList<ItemData> categories = new ArrayList<>();
        categories.add( new ItemData("Literature","Long long long long long long long long long long long long long long long description",R.mipmap.icon1,getLitEvents()));
        categories.add( new ItemData("Art","Long long long long long long long long long long long long long long long description",R.mipmap.icon2,getArtEvents()));
        categories.add(new ItemData("Music", "Description",R.mipmap.icon2,getMusicEvents()));
        categories.add( new ItemData("Theatre","Description",R.mipmap.icon2,getTheatreEvents()));
        categories.add( new ItemData("Dance","Description",R.mipmap.icon2,getDanceEvents()));
        categories.add(new ItemData("Udbhav Cup", "Description",R.mipmap.icon2,getUdbhavCupEvents()));
        categories.add(new ItemData("Misc", "Description",R.mipmap.icon2,getMiscEvents()));
        return categories;
    }
    public static ArrayList<ItemData> getLitEvents() {
        final ArrayList<ItemData> LitEvents = new ArrayList<>();
        LitEvents.add(new ItemData("LitEvent0", "LitEvent0 Description", R.mipmap.icon2,getLitEvent0Data()));
        LitEvents.add(new ItemData("LitEvent1", "LitEvent1 Description", R.mipmap.icon2,getLitEvent0Data()));
        LitEvents.add(new ItemData("LitEvent2", "LitEvent2 Description", R.mipmap.icon2,getLitEvent0Data()));
        LitEvents.add(new ItemData("LitEvent3", "LitEvent3 Description", R.mipmap.icon2,getLitEvent0Data()));
        LitEvents.add(new ItemData("LitEvent4", "LitEvent4 Description", R.mipmap.icon2,getLitEvent0Data()));
        LitEvents.add(new ItemData("LitEvent5", "LitEvent5 Description", R.mipmap.icon2,getLitEvent0Data()));
        LitEvents.add(new ItemData("LitEvent6", "LitEvent6 Description", R.mipmap.icon2,getLitEvent0Data()));
        LitEvents.add(new ItemData("LitEvent7", "LitEvent7 Description", R.mipmap.icon2,getLitEvent0Data()));
        LitEvents.add(new ItemData("LitEvent8", "LitEvent8 Description", R.mipmap.icon2,getLitEvent0Data()));
        LitEvents.add(new ItemData("LitEvent9", "LitEvent9 Description", R.mipmap.icon2,getLitEvent0Data()));
        LitEvents.add(new ItemData("LitEvent10", "LitEvent10 Description", R.mipmap.icon2,getLitEvent0Data()));
        LitEvents.add(new ItemData("LitEvent11", "LitEvent11 Description", R.mipmap.icon2,getLitEvent0Data()));
        LitEvents.add(new ItemData("LitEvent12", "LitEvent12 Description", R.mipmap.icon2,getLitEvent0Data()));
        LitEvents.add(new ItemData("LitEvent13", "LitEvent13 Description", R.mipmap.icon2,getLitEvent0Data()));
        LitEvents.add(new ItemData("LitEvent14", "LitEvent14 Description", R.mipmap.icon2,getLitEvent0Data()));
        return LitEvents;
    }


    public static ArrayList<ItemData> getArtEvents() {
        final ArrayList<ItemData> ArtEvents = new ArrayList<>();
        ArtEvents.add(new ItemData("ArtEvent0", "LitEvent0 Description", R.mipmap.icon2,getArtEvent0Data()));
        ArtEvents.add(new ItemData("ArtEvent1", "ArtEvent1 Description", R.mipmap.icon2,getArtEvent0Data()));
        ArtEvents.add(new ItemData("ArtEvent2", "ArtEvent2 Description", R.mipmap.icon2,getArtEvent0Data()));
        ArtEvents.add(new ItemData("ArtEvent3", "ArtEvent3 Description", R.mipmap.icon2,getArtEvent0Data()));
        ArtEvents.add(new ItemData("ArtEvent4", "ArtEvent4 Description", R.mipmap.icon2,getArtEvent0Data()));
        ArtEvents.add(new ItemData("ArtEvent5", "ArtEvent5 Description", R.mipmap.icon2,getArtEvent0Data()));
        ArtEvents.add(new ItemData("ArtEvent6", "ArtEvent6 Description", R.mipmap.icon2,getArtEvent0Data()));
        ArtEvents.add(new ItemData("ArtEvent7", "ArtEvent7 Description", R.mipmap.icon2,getArtEvent0Data()));
        ArtEvents.add(new ItemData("ArtEvent8", "ArtEvent8 Description", R.mipmap.icon2,getArtEvent0Data()));
        ArtEvents.add(new ItemData("ArtEvent9", "ArtEvent9 Description", R.mipmap.icon2,getArtEvent0Data()));
        ArtEvents.add(new ItemData("ArtEvent10", "ArtEvent10 Description", R.mipmap.icon2,getArtEvent0Data()));
        ArtEvents.add(new ItemData("ArtEvent11", "ArtEvent11 Description", R.mipmap.icon2,getArtEvent0Data()));
        ArtEvents.add(new ItemData("ArtEvent12", "ArtEvent12 Description", R.mipmap.icon2,getArtEvent0Data()));
        ArtEvents.add(new ItemData("ArtEvent13", "ArtEvent13 Description", R.mipmap.icon2,getArtEvent0Data()));
        ArtEvents.add(new ItemData("ArtEvent14", "ArtEvent14 Description", R.mipmap.icon2,getArtEvent0Data()));
        return ArtEvents;
    }


    public static ArrayList<ItemData> getMusicEvents() {
        final ArrayList<ItemData> MusicEvents = new ArrayList<>();
        MusicEvents.add(new ItemData("MusicEvent0", "MusicEvent0 Description", R.mipmap.icon2,getMusicEvent0Data()));
        MusicEvents.add(new ItemData("MusicEvent1", "MusicEvent1 Description", R.mipmap.icon2,getMusicEvent0Data()));
        MusicEvents.add(new ItemData("MusicEvent2", "MusicEvent2 Description", R.mipmap.icon2,getMusicEvent0Data()));
        MusicEvents.add(new ItemData("MusicEvent3", "MusicEvent3 Description", R.mipmap.icon2,getMusicEvent0Data()));
        MusicEvents.add(new ItemData("MusicEvent4", "MusicEvent4 Description", R.mipmap.icon2,getMusicEvent0Data()));
        MusicEvents.add(new ItemData("MusicEvent5", "MusicEvent5 Description", R.mipmap.icon2,getMusicEvent0Data()));
        MusicEvents.add(new ItemData("MusicEvent6", "MusicEvent6 Description", R.mipmap.icon2,getMusicEvent0Data()));
        MusicEvents.add(new ItemData("MusicEvent7", "MusicEvent7 Description", R.mipmap.icon2,getMusicEvent0Data()));
        MusicEvents.add(new ItemData("MusicEvent8", "MusicEvent8 Description", R.mipmap.icon2,getMusicEvent0Data()));
        MusicEvents.add(new ItemData("MusicEvent9", "MusicEvent9 Description", R.mipmap.icon2,getMusicEvent0Data()));
        MusicEvents.add(new ItemData("MusicEvent10", "MusicEvent10 Description", R.mipmap.icon2,getMusicEvent0Data()));
        MusicEvents.add(new ItemData("MusicEvent11", "MusicEvent11 Description", R.mipmap.icon2,getMusicEvent0Data()));
        MusicEvents.add(new ItemData("MusicEvent12", "MusicEvent12 Description", R.mipmap.icon2,getMusicEvent0Data()));
        MusicEvents.add(new ItemData("MusicEvent13", "MusicEvent13 Description", R.mipmap.icon2,getMusicEvent0Data()));
        MusicEvents.add(new ItemData("MusicEvent14", "MusicEvent14 Description", R.mipmap.icon2,getMusicEvent0Data()));
        return MusicEvents;
    }


    public static ArrayList<ItemData> getTheatreEvents() {
        final ArrayList<ItemData> TheatreEvents = new ArrayList<>();
        TheatreEvents.add(new ItemData("TheatreEvent0", "TheatreEvent0 Description", R.mipmap.icon2,getTheatreEvent0Data()));
        TheatreEvents.add(new ItemData("TheatreEvent1", "TheatreEvent1 Description", R.mipmap.icon2,getTheatreEvent0Data()));
        TheatreEvents.add(new ItemData("TheatreEvent2", "TheatreEvent2 Description", R.mipmap.icon2,getTheatreEvent0Data()));
        TheatreEvents.add(new ItemData("TheatreEvent3", "TheatreEvent3 Description", R.mipmap.icon2,getTheatreEvent0Data()));
        TheatreEvents.add(new ItemData("TheatreEvent4", "TheatreEvent4 Description", R.mipmap.icon2,getTheatreEvent0Data()));
        TheatreEvents.add(new ItemData("TheatreEvent5", "TheatreEvent5 Description", R.mipmap.icon2,getTheatreEvent0Data()));
        TheatreEvents.add(new ItemData("TheatreEvent6", "TheatreEvent6 Description", R.mipmap.icon2,getTheatreEvent0Data()));
        TheatreEvents.add(new ItemData("TheatreEvent7", "TheatreEvent7 Description", R.mipmap.icon2,getTheatreEvent0Data()));
        TheatreEvents.add(new ItemData("TheatreEvent8", "TheatreEvent8 Description", R.mipmap.icon2,getTheatreEvent0Data()));
        TheatreEvents.add(new ItemData("TheatreEvent9", "TheatreEvent9 Description", R.mipmap.icon2,getTheatreEvent0Data()));
        TheatreEvents.add(new ItemData("TheatreEvent10", "TheatreEvent10 Description", R.mipmap.icon2,getTheatreEvent0Data()));
        TheatreEvents.add(new ItemData("TheatreEvent11", "TheatreEvent11 Description", R.mipmap.icon2,getTheatreEvent0Data()));
        TheatreEvents.add(new ItemData("TheatreEvent12", "TheatreEvent12 Description", R.mipmap.icon2,getTheatreEvent0Data()));
        TheatreEvents.add(new ItemData("TheatreEvent13", "TheatreEvent13 Description", R.mipmap.icon2,getTheatreEvent0Data()));
        TheatreEvents.add(new ItemData("TheatreEvent14", "TheatreEvent14 Description", R.mipmap.icon2,getTheatreEvent0Data()));
        return TheatreEvents;
    }

    public static ArrayList<ItemData> getDanceEvents() {
        final ArrayList<ItemData> DanceEvents = new ArrayList<>();
        DanceEvents.add(new ItemData("DanceEvent0", "DanceEvent0 Description", R.mipmap.icon2,getLitEvent0Data()));
        DanceEvents.add(new ItemData("DanceEvent1", "DanceEvent1 Description", R.mipmap.icon2,getLitEvent0Data()));
        DanceEvents.add(new ItemData("DanceEvent2", "DanceEvent2 Description", R.mipmap.icon2,getLitEvent0Data()));
        DanceEvents.add(new ItemData("DanceEvent3", "DanceEvent3 Description", R.mipmap.icon2,getLitEvent0Data()));
        DanceEvents.add(new ItemData("DanceEvent4", "DanceEvent4 Description", R.mipmap.icon2,getLitEvent0Data()));
        DanceEvents.add(new ItemData("DanceEvent5", "DanceEvent5 Description", R.mipmap.icon2,getLitEvent0Data()));
        DanceEvents.add(new ItemData("DanceEvent6", "DanceEvent6 Description", R.mipmap.icon2,getLitEvent0Data()));
        DanceEvents.add(new ItemData("DanceEvent7", "DanceEvent7 Description", R.mipmap.icon2,getLitEvent0Data()));
        DanceEvents.add(new ItemData("DanceEvent8", "DanceEvent8 Description", R.mipmap.icon2,getLitEvent0Data()));
        DanceEvents.add(new ItemData("DanceEvent9", "DanceEvent9 Description", R.mipmap.icon2,getLitEvent0Data()));
        DanceEvents.add(new ItemData("DanceEvent10", "DanceEvent10 Description", R.mipmap.icon2,getLitEvent0Data()));
        DanceEvents.add(new ItemData("DanceEvent11", "DanceEvent11 Description", R.mipmap.icon2,getLitEvent0Data()));
        DanceEvents.add(new ItemData("DanceEvent12", "DanceEvent12 Description", R.mipmap.icon2,getLitEvent0Data()));
        DanceEvents.add(new ItemData("DanceEvent13", "DanceEvent13 Description", R.mipmap.icon2,getLitEvent0Data()));
        DanceEvents.add(new ItemData("DanceEvent14", "DanceEvent14 Description", R.mipmap.icon2,getLitEvent0Data()));
        return DanceEvents;
    }

    public static ArrayList<ItemData> getUdbhavCupEvents() {
        final ArrayList<ItemData> UdbhavCupEvents = new ArrayList<>();
        UdbhavCupEvents.add(new ItemData("UdbhavCupEvent0", "UdbhavCupEvent0 Description", R.mipmap.icon2,getLitEvent0Data()));
        UdbhavCupEvents.add(new ItemData("UdbhavCupEvent1", "UdbhavCupEvent1 Description", R.mipmap.icon2,getLitEvent0Data()));
        UdbhavCupEvents.add(new ItemData("UdbhavCupEvent2", "UdbhavCupEvent2 Description", R.mipmap.icon2,getLitEvent0Data()));
        UdbhavCupEvents.add(new ItemData("UdbhavCupEvent3", "UdbhavCupEvent3 Description", R.mipmap.icon2,getLitEvent0Data()));
        UdbhavCupEvents.add(new ItemData("UdbhavCupEvent4", "UdbhavCupEvent4 Description", R.mipmap.icon2,getLitEvent0Data()));
        UdbhavCupEvents.add(new ItemData("UdbhavCupEvent5", "UdbhavCupEvent5 Description", R.mipmap.icon2,getLitEvent0Data()));
        UdbhavCupEvents.add(new ItemData("UdbhavCupEvent6", "UdbhavCupEvent6 Description", R.mipmap.icon2,getLitEvent0Data()));
        UdbhavCupEvents.add(new ItemData("UdbhavCupEvent7", "UdbhavCupEvent7 Description", R.mipmap.icon2,getLitEvent0Data()));
        UdbhavCupEvents.add(new ItemData("UdbhavCupEvent8", "UdbhavCupEvent8 Description", R.mipmap.icon2,getLitEvent0Data()));
        UdbhavCupEvents.add(new ItemData("UdbhavCupEvent9", "UdbhavCupEvent9 Description", R.mipmap.icon2,getLitEvent0Data()));
        UdbhavCupEvents.add(new ItemData("UdbhavCupEvent10", "UdbhavCupEvent10 Description", R.mipmap.icon2,getLitEvent0Data()));
        UdbhavCupEvents.add(new ItemData("UdbhavCupEvent11", "UdbhavCupEvent11 Description", R.mipmap.icon2,getLitEvent0Data()));
        UdbhavCupEvents.add(new ItemData("UdbhavCupEvent12", "UdbhavCupEvent12 Description", R.mipmap.icon2,getLitEvent0Data()));
        UdbhavCupEvents.add(new ItemData("UdbhavCupEvent13", "UdbhavCupEvent13 Description", R.mipmap.icon2,getLitEvent0Data()));
        UdbhavCupEvents.add(new ItemData("UdbhavCupEvent14", "UdbhavCupEvent14 Description", R.mipmap.icon2,getLitEvent0Data()));
        return UdbhavCupEvents;
    }

    public static ArrayList<ItemData> getMiscEvents() {
        final ArrayList<ItemData> MiscEvents = new ArrayList<>();
        MiscEvents.add(new ItemData("MiscEvent0", "MiscEvent0 Description", R.mipmap.icon2,getLitEvent0Data()));
        MiscEvents.add(new ItemData("MiscEvent1", "MiscEvent1 Description", R.mipmap.icon2,getLitEvent0Data()));
        MiscEvents.add(new ItemData("MiscEvent2", "MiscEvent2 Description", R.mipmap.icon2,getLitEvent0Data()));
        MiscEvents.add(new ItemData("MiscEvent3", "MiscEvent3 Description", R.mipmap.icon2,getLitEvent0Data()));
        MiscEvents.add(new ItemData("MiscEvent4", "MiscEvent4 Description", R.mipmap.icon2,getLitEvent0Data()));
        MiscEvents.add(new ItemData("MiscEvent5", "MiscEvent5 Description", R.mipmap.icon2,getLitEvent0Data()));
        MiscEvents.add(new ItemData("MiscEvent6", "MiscEvent6 Description", R.mipmap.icon2,getLitEvent0Data()));
        MiscEvents.add(new ItemData("MiscEvent7", "MiscEvent7 Description", R.mipmap.icon2,getLitEvent0Data()));
        MiscEvents.add(new ItemData("MiscEvent8", "MiscEvent8 Description", R.mipmap.icon2,getLitEvent0Data()));
        MiscEvents.add(new ItemData("MiscEvent9", "MiscEvent9 Description", R.mipmap.icon2,getLitEvent0Data()));
        MiscEvents.add(new ItemData("MiscEvent10", "MiscEvent10 Description", R.mipmap.icon2,getLitEvent0Data()));
        MiscEvents.add(new ItemData("MiscEvent11", "MiscEvent11 Description", R.mipmap.icon2,getLitEvent0Data()));
        MiscEvents.add(new ItemData("MiscEvent12", "MiscEvent12 Description", R.mipmap.icon2,getLitEvent0Data()));
        MiscEvents.add(new ItemData("MiscEvent13", "MiscEvent13 Description", R.mipmap.icon2,getLitEvent0Data()));
        MiscEvents.add(new ItemData("MiscEvent14", "MiscEvent14 Description", R.mipmap.icon2,getLitEvent0Data()));
        return MiscEvents;
    }

    public static EventData getLitEvent0Data()
    {
        EventData LitEvent0 = new EventData();
        LitEvent0.setEvent_name("LitEvent0");
        LitEvent0.setSize(1);
        LitEvent0.setDate("10/04/2015");
        LitEvent0.setTime("12:00 am");
        LitEvent0.setVenue("LHC Seminar hall");
        LitEvent0.setCoordinator("Who cares?");
        LitEvent0.setPhone("9988776655");
        LitEvent0.setRules("\n Hey \n \n • This the line1 of rules you've to follow for this event otherwise you will have to face the consequences" +
                " \n \n • This is line2 of rules you've to follow for this event. Otherwise, you know what!");
        return LitEvent0;
    }

    public static EventData getArtEvent0Data()
    {
        EventData LitEvent0 = new EventData();
        LitEvent0.setEvent_name("ArtEvent0");
        LitEvent0.setSize(1);
        LitEvent0.setDate("10/04/2015");
        LitEvent0.setTime("12:00 am");
        LitEvent0.setVenue("LHC Seminar hall");
        LitEvent0.setCoordinator("Who cares?");
        LitEvent0.setPhone("9988776655");
        LitEvent0.setRules("\n Hey \n \n • This the line1 of rules you've to follow for this event otherwise you will have to face the consequences" +
                " \n \n • This is line2 of rules you've to follow for this event. Otherwise, you know what!");
        return LitEvent0;
    }

    public static EventData getMusicEvent0Data()
    {
        EventData LitEvent0 = new EventData();
        LitEvent0.setEvent_name("MusicEvent0");
        LitEvent0.setSize(5);
        LitEvent0.setDate("10/04/2015");
        LitEvent0.setTime("12:00 am");
        LitEvent0.setVenue("LHC Seminar hall");
        LitEvent0.setCoordinator("Who cares?");
        LitEvent0.setPhone("9988776655");
        LitEvent0.setRules("\n Hey \n \n • This the line1 of rules you've to follow for this event otherwise you will have to face the consequences" +
                " \n \n • This is line2 of rules you've to follow for this event. Otherwise, you know what!");
        return LitEvent0;
    }

    public static EventData getTheatreEvent0Data()
    {
        EventData LitEvent0 = new EventData();
        LitEvent0.setEvent_name("TheatreEvent0");
        LitEvent0.setSize(8);
        LitEvent0.setDate("10/04/2015");
        LitEvent0.setTime("12:00 am");
        LitEvent0.setVenue("LHC Seminar hall");
        LitEvent0.setCoordinator("Who cares?");
        LitEvent0.setPhone("9988776655");
        LitEvent0.setRules("\n Hey \n \n • This the line1 of rules you've to follow for this event otherwise you will have to face the consequences" +
                " \n \n • This is line2 of rules you've to follow for this event. Otherwise, you know what!");
        return LitEvent0;
    }


}
