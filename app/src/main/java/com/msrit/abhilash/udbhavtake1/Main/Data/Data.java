package com.msrit.abhilash.udbhavtake1.Main.Data;

import com.msrit.abhilash.udbhavtake1.R;

import java.util.ArrayList;

/**
 * Created by Abhilash on 14/01/2016.
 */
public class Data {

    public static String day1="30/03/2016 (day 1)";
    public static String day2="31/03/2016 (day 2)";
    public static String day3="01/04/2016 (day 3)";

    public static ArrayList<ItemData> getCategories()
    {
        final ArrayList<ItemData> categories = new ArrayList<>();
        categories.add( new ItemData("Literature",R.mipmap.icon2,getLitEvents()));
        categories.add( new ItemData("Art",R.mipmap.icon2,getArtEvents()));
        categories.add(new ItemData("Music", R.mipmap.icon2,getMusicEvents()));
        categories.add( new ItemData("Theatre",R.mipmap.icon2,getTheatreEvents()));
        categories.add( new ItemData("Dance",R.mipmap.icon2,getDanceEvents()));
        categories.add(new ItemData("Udbhav Cup",R.mipmap.icon2,getUdbhavCupEvents()));
        categories.add(new ItemData("Misc",R.mipmap.icon2,getMiscEvents()));
        return categories;
    }
    public static ArrayList<ItemData> getLitEvents() {
        final ArrayList<ItemData> LitEvents = new ArrayList<>();
        LitEvents.add(new ItemData("Dumb Charades", R.mipmap.icon2,getLitEvent0Data(),true));
        LitEvents.add(new ItemData("Debate - English",R.mipmap.icon2,getLitEvent1Data(),true));
        LitEvents.add(new ItemData("General Quiz", R.mipmap.icon2,getLitEvent10Data(),true));
        LitEvents.add(new ItemData("Debate - Kannada", R.mipmap.icon2,getLitEvent2Data(),false));
        LitEvents.add(new ItemData("Potpourri",  R.mipmap.icon2,getLitEvent3Data(),false));
        LitEvents.add(new ItemData("Elocution", R.mipmap.icon2,getLitEvent4Data(),false));
        LitEvents.add(new ItemData("Jam-Kannada",  R.mipmap.icon2,getLitEvent5Data(),false));
        LitEvents.add(new ItemData("Jam-English",  R.mipmap.icon2,getLitEvent6Data(),false));
        LitEvents.add(new ItemData("Creative Writing", R.mipmap.icon2,getLitEvent7Data(),false));
        LitEvents.add(new ItemData("Spent Quiz", R.mipmap.icon2,getLitEvent8Data(),false));
        LitEvents.add(new ItemData("Movie Quiz", R.mipmap.icon2,getLitEvent9Data(),false));

        return LitEvents;
    }


    public static ArrayList<ItemData> getArtEvents() {
        final ArrayList<ItemData> ArtEvents = new ArrayList<>();
        ArtEvents.add(new ItemData("On Spot Painting", R.mipmap.icon2,getArtEvent1Data(),true));
        ArtEvents.add(new ItemData("Collage",R.mipmap.icon2,getArtEvent2Data(),true));
        ArtEvents.add(new ItemData("Face Painting", R.mipmap.icon2,getArtEvent6Data(),true));
        ArtEvents.add(new ItemData("Face Painting", R.mipmap.icon2,getArtEvent6Data(),true));
        ArtEvents.add(new ItemData("Cartooning", R.mipmap.icon2,getArtEvent0Data(),false));
        ArtEvents.add(new ItemData("By 2 Canvas", R.mipmap.icon2,getArtEvent3Data(),false));
        ArtEvents.add(new ItemData("Clay Modelling", R.mipmap.icon2,getArtEvent4Data(),false));
        ArtEvents.add(new ItemData("Rangoli", R.mipmap.icon2,getArtEvent5Data(),false));
        ArtEvents.add(new ItemData("Mehendi",  R.mipmap.icon2,getArtEvent7Data(),false));
        ArtEvents.add(new ItemData("Camouflage",  R.mipmap.icon2,getArtEvent8Data(),false));
        ArtEvents.add(new ItemData("Paper Couture",  R.mipmap.icon2,getArtEvent9Data(),false));
        ArtEvents.add(new ItemData("Poster Making", R.mipmap.icon2,getArtEvent10Data(),false));
        return ArtEvents;
    }


    public static ArrayList<ItemData> getMusicEvents() {
        final ArrayList<ItemData> MusicEvents = new ArrayList<>();
        MusicEvents.add(new ItemData("Western Group Music", R.mipmap.icon2,getMusicEvent0Data(),true));
        MusicEvents.add(new ItemData("Indian Group Music", R.mipmap.icon2,getMusicEvent1Data(),true));
        MusicEvents.add(new ItemData("Western Acoustics Solo",  R.mipmap.icon2,getMusicEvent2Data(),true));
        MusicEvents.add(new ItemData("Western Acoustics Group",  R.mipmap.icon2,getMusicEvent3Data(),true));
        MusicEvents.add(new ItemData("Indian Light Music Solo", R.mipmap.icon2,getMusicEvent4Data(),true));
        MusicEvents.add(new ItemData("Classical Vocal Solo", R.mipmap.icon2,getMusicEvent5Data(),true));
        MusicEvents.add(new ItemData("Semi - Classical Vocal Solo", R.mipmap.icon2,getMusicEvent6Data(),true));
        MusicEvents.add(new ItemData("Classical Instrumental Solo",  R.mipmap.icon2,getMusicEvent7Data(),true));
        MusicEvents.add(new ItemData("Beat Boxing",  R.mipmap.icon2,getMusicEvent8Data(),true));
        MusicEvents.add(new ItemData("Antaakshari",  R.mipmap.icon2,getMusicEvent9Data(),false));
        MusicEvents.add(new ItemData("Karaoke", R.mipmap.icon2,getMusicEvent10Data(),false));

        return MusicEvents;
    }


    public static ArrayList<ItemData> getTheatreEvents() {
        final ArrayList<ItemData> TheatreEvents = new ArrayList<>();
        TheatreEvents.add(new ItemData("One Act Play", R.mipmap.icon2,getTheatreEvent0Data(),true));
        TheatreEvents.add(new ItemData("Skit", R.mipmap.icon2,getTheatreEvent1Data(),true));
        TheatreEvents.add(new ItemData("Short Films", R.mipmap.icon2,getTheatreEvent2Data(),true));
        TheatreEvents.add(new ItemData("Short Ads",  R.mipmap.icon2,getTheatreEvent3Data(),true));
        TheatreEvents.add(new ItemData("Street Play", R.mipmap.icon2,getTheatreEvent4Data(),true));
        return TheatreEvents;
    }

    public static ArrayList<ItemData> getDanceEvents() {
        final ArrayList<ItemData> DanceEvents = new ArrayList<>();
        DanceEvents.add(new ItemData("Dance As You Like", R.mipmap.icon2,getDanceEvent1Data(),true));
        DanceEvents.add(new ItemData("Indian Contemporary Group Dance",R.mipmap.icon2,getDanceEvent2Data(),true));
        DanceEvents.add(new ItemData("Western Group Dance",R.mipmap.icon2,getDanceEvent3Data(),true));
        DanceEvents.add(new ItemData("Street Dance",  R.mipmap.icon2,getDanceEvent4Data(),true));
        DanceEvents.add(new ItemData("Classical Dance Solo", R.mipmap.icon2,getDanceEvent0Data(),false));
        return DanceEvents;
    }

    public static ArrayList<ItemData> getUdbhavCupEvents() {
        final ArrayList<ItemData> UdbhavCupEvents = new ArrayList<>();
        UdbhavCupEvents.add(new ItemData("Badminton", R.mipmap.icon2,getUdbCupEvent0Data(),false));
        UdbhavCupEvents.add(new ItemData("Basketball",  R.mipmap.icon2,getUdbCupEvent1Data(),false));
        UdbhavCupEvents.add(new ItemData("Cricket",  R.mipmap.icon2,getUdbCupEvent2Data(),false));
        UdbhavCupEvents.add(new ItemData("Football", R.mipmap.icon2,getUdbCupEvent3Data(),false));
        return UdbhavCupEvents;
    }

    public static ArrayList<ItemData> getMiscEvents() {
        final ArrayList<ItemData> MiscEvents = new ArrayList<>();
        MiscEvents.add(new ItemData("On The Spot Photography", R.mipmap.icon2, getMiscEvent4Data(),true));
        MiscEvents.add(new ItemData("Fifa 14",  R.mipmap.icon2, getMiscEvent5Data(),true));
        MiscEvents.add(new ItemData("Dota 2",  R.mipmap.icon2, getMiscEvent6Data(),true));
        MiscEvents.add(new ItemData("Counter Strike 1.6 ", R.mipmap.icon2, getMiscEvent7Data(),true));
        MiscEvents.add(new ItemData("Personality", R.mipmap.icon2, getMiscEvent0Data(),false));
        MiscEvents.add(new ItemData("Cooking",  R.mipmap.icon2, getMiscEvent1Data(),false));
        MiscEvents.add(new ItemData("Treasure Hunt",  R.mipmap.icon2, getMiscEvent2Data(),false));
        MiscEvents.add(new ItemData("Msrit’s Got Talent",  R.mipmap.icon2, getMiscEvent3Data(),false));

        return MiscEvents;
    }

    public static EventData getLitEvent0Data()
    {
        EventData Event = new EventData();
        Event.setEvent_name("Dumb Charades");
        Event.setInter(true);
        Event.setSize(1);
        Event.setDate("31/03/2016 (day 2)");
        Event.setTime("09:00 am");
        Event.setVenue("Class room 1");
        Event.setCoordinator("Alvin Mark");
        Event.setPhone("9880716414");
        Event.setRules("\n \n • There must be three contestants in a team." +
                "\n \n • Contestants may not change/shuffle teams after the prelims" +
                "\n \n • Number/nature of rounds is up to the DC master" +
                "\n \n • Contestants may not speak; they may use only established codes, no dropping. More rules can be specified by the DC master" +
                "\n \n • Contestants may not use vulgar forms of expressions in the event");
        return Event;
    }


    public static EventData getLitEvent1Data()
    {
        EventData Event0 = new EventData();
        Event0.setEvent_name("Debate - English");
        Event0.setInter(true);
        Event0.setSize(1);
        Event0.setDate("01/04/2016 (day 3)");
        Event0.setTime("09:00 am");
        Event0.setVenue("LHC Seminar Hall 2");
        Event0.setCoordinator("Nishank Kukrejha");
        Event0.setPhone("9742032756");
        Event0.setRules("\n \n • Contestants are to participate alone" +
                "\n \n • Medium of the debate will be in English"+
                "\n \n • There will be two rounds, Preliminary and Finals"+
                "\n \n \n \n Preliminary: "+
                "\n \n • Five topics will be given from which the debater will have to choose one"+
                "\n \n • The topics of the debate will be given 24 hours in advance"+
                "\n \n • The debater will be allowed to speak on the topic for a maximum of 3 minutes"+
                "\n \n • Five topics will be given from which the debater will have to choose one"+
                "\n \n • Five topics will be given from which the debater will have to choose one"+
                "\n \n \n \n Finals: "+
                "\n \n • The topic will be given on the spot"+
                "\n \n • Each debater will be given a preparation time of 10 minutes"+
                "\n \n • Usage of internet and mobile phones are not allowed"+
                "\n \n • The debater will be asked to speak either For or Against the topic"+
                "\n \n • Initially each debater will be allowed to speak on their topic for a maximum of 4 minutes"+
                "\n \n • Debaters will then be allowed to speak on a rebuttal round starting from the speaker who spoke last and ending with the speaker who spoke first."+
                "\n \n • The maximum time of speech allotted for rebuttal round is 2 minutes for each speaker"+
                "\n \n • This will then be followed by a Q/A round which is open to all"+
                "\n \n • Paper reading is not allowed"
        );
        return Event0;
    }

    public static EventData getLitEvent2Data()
    {
        EventData Event0 = new EventData();
        Event0.setEvent_name("Debate - Kannada");
        Event0.setSize(2);
        Event0.setDate("30/03/2016 (day 1)");
        Event0.setTime("09:00 am");
        Event0.setVenue("LHC Seminar Hall 1");
        Event0.setCoordinator("Neha M Nayak");
        Event0.setPhone("");
        Event0.setRules("\n \n • Each team will be represented by the 2 participants; one will speak FOR, while another will speak AGAINST The motion." +
                        "\n \n • Medium of the debate will be in Kannada."+
                        "\n \n • Topics of the debate will be announced 24 hours in advance."+
                        "\n \n • Each speaker will be allowed to speak for maximum five minutes."+
                        "\n \n • Each Speaker will be asked one question by the judges in the rebuttal round at the end of the speech."+
                        "\n \n • Paper reading is not allowed"
        );
        return Event0;
    }
    public static EventData getLitEvent3Data()
    {
        EventData Event0 = new EventData();
        Event0.setEvent_name("Pot Pourri");
        Event0.setSize(3);
        Event0.setDate("30/03/2016 (day 1)");
        Event0.setTime("09:00 am");
        Event0.setVenue("Apex Block Auditorium");
        Event0.setCoordinator("Shreya");
        Event0.setPhone("9980307321");
        Event0.setRules("\n \n • 3 contestants in a team" +
                        "\n \n • Contestants may not change/shuffle teams after prelims"+
                        "\n \n • Number/nature of rounds is up to the host/judge"+
                        "\n \n • Contestants may not use vulgar form of expression in the event"
        );
        return Event0;
    }

    public static EventData getLitEvent4Data()
    {
        EventData Event0 = new EventData();
        Event0.setEvent_name("Elocution");
        Event0.setSize(1);
        Event0.setDate("30/03/2016 (day 1)");
        Event0.setTime("12:00 pm");
        Event0.setVenue("LCH Seminar Hall 1");
        Event0.setCoordinator("");
        Event0.setPhone("");
        Event0.setRules("\n \n • Medium of expression will be English." +
                        "\n \n • Each speaker will be allowed to speak for maximum 5+2 minutes"+
                        "\n \n • Subject/Topic of elocution will be announced one day prior to the event"
        );
        return Event0;
    }

    public static EventData getLitEvent5Data()
    {
        EventData Event0 = new EventData();
        Event0.setEvent_name("Jam-Kannada");
        Event0.setSize(1);
        Event0.setDate("30/03/2016 (day 1)");
        Event0.setTime("09:00 am");
        Event0.setVenue("ESB Small Seminar Hall");
        Event0.setCoordinator("Supreeth");
        Event0.setPhone("8904430345");
        Event0.setRules("\n \n • Contestants are allowed to participate alone only" +
                        "\n \n • Medium of expression will be Kannada only"+
                        "\n \n • Number of rounds and number of contestants in each round is up to the jam master"+
                        "\n \n • Contestants may not use vulgar form of expression in the event"
        );
        return Event0;
    }
    public static EventData getLitEvent6Data()
    {
        EventData Event0 = new EventData();
        Event0.setEvent_name("Jam-English");
        Event0.setSize(1);
        Event0.setDate("30/03/2016 (day 1)");
        Event0.setTime("01:00 pm");
        Event0.setVenue("ESB Small Seminar Hall");
        Event0.setCoordinator("Vishvesh Sriram");
        Event0.setPhone("");
        Event0.setRules("\n \n • Contestants are allowed to participate alone only" +
                        "\n \n • Medium of expression will be English only"+
                        "\n \n • Number of rounds and number of contestants in each round is up to the jam master"+
                        "\n \n • Contestants may not use vulgar form of expression in the event"
        );
        return Event0;
    }

    public static EventData getLitEvent7Data()
    {
        EventData Event0 = new EventData();
        Event0.setEvent_name("Creative Writing");
        Event0.setSize(1);
        Event0.setDate("30/03/2016 (day 1)");
        Event0.setTime("09:00 am");
        Event0.setVenue("Class Room 1");
        Event0.setCoordinator("");
        Event0.setPhone("");
        Event0.setRules("\n \n • Contestants are allowed to participate alone only" +
                        "\n \n • Medium of expression will be English, Hindi or Kannada"+
                        "\n \n • The topic/ theme will be announced at the start of the event"+
                        "\n \n • Use of cell phone/computer/reading material will not be permitted once the event commences"+
                        "\n \n • There will be no limit on the number of words"+
                        "\n \n • Content can be in the form of essays, short stories or poetry"+
                        "\n \n • There will be a time limit of 3 hours"

        );
        return Event0;
    }

    public static EventData getLitEvent8Data()
    {
        EventData Event0 = new EventData();
        Event0.setEvent_name("Spent Quiz");
        Event0.setSize(3);
        Event0.setDate("30/03/2016 (day 1)");
        Event0.setTime("02:00 pm");
        Event0.setVenue("Hi-Tech Seminar Hall");
        Event0.setCoordinator("Micheal Albuquerque");
        Event0.setPhone("8095270184");
        Event0.setRules("\n \n • There will be written preliminary round and the teams will be selected for finals" +
                        "\n \n • A team should consist of 3 people"+
                        "\n \n • Finals will be conducted as per quizmaster’s choice"+
                        "\n \n • The specific rules regarding evaluation procedure, time to reply for a particular answer and the type of round will be given before the actual start of the competition"+
                        "\n \n • Questions will be pertaining to sports and entertainment only"
        );
        return Event0;
    }

    public static EventData getLitEvent9Data()
    {
        EventData Event0 = new EventData();
        Event0.setEvent_name("Movie Quiz");
        Event0.setSize(3);
        Event0.setDate("31/03/2016 (day 2)");
        Event0.setTime("09:00 am");
        Event0.setVenue("LHC Seminar Hall 2");
        Event0.setCoordinator("Tanoy Dutta");
        Event0.setPhone("9742031736");
        Event0.setRules("\n \n • There will be written preliminary round and the teams will be selected for finals" +
                "\n \n • A team should consist of 3 people"+
                "\n \n • Finals will be conducted as per quizmaster’s choice"+
                "\n \n • The specific rules regarding evaluation procedure, time to reply for a particular answer and the type of round will be given before the actual start of the competition");
        return Event0;
    }

    public static EventData getLitEvent10Data()
    {
        EventData Event0 = new EventData();
        Event0.setEvent_name("General Quiz");
        Event0.setInter(true);
        Event0.setSize(3);
        Event0.setDate("01/04/2016 (day 3)");
        Event0.setTime("09:00 am");
        Event0.setVenue("Apex Auditorium");
        Event0.setCoordinator("Vasant Menon");
        Event0.setPhone("9986145477");
        Event0.setRules("\n \n • There will be written preliminary round and the teams will be selected for finals" +
                "\n \n • A team should consist of 3 people"+
                "\n \n • Finals will be conducted as per quizmaster’s choice"+
                "\n \n • The specific rules regarding evaluation procedure, time to reply for a particular answer and the type of round will be given before the actual start of the competition");
        return Event0;
    }


    public static EventData getArtEvent0Data()
    {
        EventData Event0 = new EventData();
        Event0.setEvent_name("Cartooning");
        Event0.setSize(1);
        Event0.setDate("01/04/2016 (day 3)");
        Event0.setTime("12:00 pm");
        Event0.setVenue("LHC Seminar Hall 1");
        Event0.setCoordinator("Monisha");
        Event0.setPhone("9880850665");
        Event0.setRules("\n \n • Topic will be given on the spot" +
                "\n \n • Duration will not be more than 2 hours"+
                "\n \n • Participants shall bring their own material"+
                "\n \n • Drawing paper will be provided. (Size of paper : 22inches x 15 inches)");
        return Event0;
    }

    public static EventData getArtEvent1Data()
    {
        EventData Event0 = new EventData();
        Event0.setEvent_name("On Spot Painting");
        Event0.setInter(true);
        Event0.setSize(1);
        Event0.setDate("01/04/2016 (day 3)");
        Event0.setTime("09:00 am");
        Event0.setVenue("ESB II stage");
        Event0.setCoordinator("Thressia");
        Event0.setPhone("9886495776");
        Event0.setRules("\n \n • Theme will be given on the spot" +
                "\n \n • Duration will not be more than 2 hours 30 minutes"+
                "\n \n • Size of the painting will be half imperial size drawing paper, i.e., 22 inches x 15 inches"+
                "\n \n • Painting can be done in oil,water,poster or pastel colours"+
                "\n \n • Candidate shall bring their own material like brushes,paints etc. Only the paper/sheet will be provided");
        return Event0;
    }

    public static EventData getArtEvent2Data()
    {
        EventData Event0 = new EventData();
        Event0.setEvent_name("Collage");
        Event0.setInter(true);
        Event0.setSize(1);
        Event0.setDate("31/03/2016 (day 2)");
        Event0.setTime("01:00 pm");
        Event0.setVenue("LHC stage");
        Event0.setCoordinator("Monisha");
        Event0.setPhone("9880850665");
        Event0.setRules("\n \n • Topic will be given on the spot." +
                "\n \n • Duration will not be more than 2 hours"+
                "\n \n •Participants shall bring their own scissors, pastes and other material required for the contest. "+
                "\n \n •Drawing paper will be provided. Size of drawing paper: 22inches X 15inches"+
                "\n \n •Collage has to be prepared from old magazines or newspapers"+
                "\n \n •Participants are requested to carry their own newspapers, magazines and other decorating material.");
        return Event0;
    }

    public static EventData getArtEvent3Data()
    {
        EventData Event0 = new EventData();
        Event0.setEvent_name("By 2 Canvas");
        Event0.setSize(2);
        Event0.setDate("30/03/2016 (day 1)");
        Event0.setTime("12:00 pm");
        Event0.setVenue("ESB 2 basement");
        Event0.setCoordinator("Srivastav");
        Event0.setPhone("9483466019");
        Event0.setRules("\n \n • There must be 2 members in a team." +
                "\n \n • The theme for the event will be given on the spot"+
                "\n \n • The duration of the event will be not more than 1 hour 30 minutes"+
                "\n \n • Each team will be given two A4 sheets of paper + 1 A5 Sheet of paper"+
                "\n \n • For the first 45 minutes, the team members are seated separately and work on one A4 sheet each"+
                "\n \n • No discussion is allowed between the team members during the first 45 minutes"+
                "\n \n • The next 45 minutes, they are seated together and need to combine both their A4 sheets with the extra A5 sheet given to make a cohesive art piece"+
                "\n \n • Participants are requested to carry their own material like paints, brushes, markers etc."
        );
        return Event0;
    }

    public static EventData getArtEvent4Data()
    {
        EventData Event0 = new EventData();
        Event0.setEvent_name("Clay Modelling");
        Event0.setSize(1);
        Event0.setDate("01/04/2016 (day 3)");
        Event0.setTime("12:00 pm");
        Event0.setVenue("ESB 2 stage");
        Event0.setCoordinator("Greeshma");
        Event0.setPhone("");
        Event0.setRules("\n \n • Event will be conducted on the spot." +
                "\n \n • Duration will not be more than 2 hours 30 minutes"+
                "\n \n • Topics or size and other specific rules shall be announced on the spot"+
                "\n \n • Clay shall be provided by the organizers");
        return Event0;
    }

    public static EventData getArtEvent5Data()
    {
        EventData Event0 = new EventData();
        Event0.setEvent_name("Rangoli");
        Event0.setSize(1);
        Event0.setDate("31/03/2016 (day 2)");
        Event0.setTime("09:00 am");
        Event0.setVenue("ESB 2 basement");
        Event0.setCoordinator("Attreyee");
        Event0.setPhone("9731760093");
        Event0.setRules("\n \n • Duration will not be more than 2 hours" +
                "\n \n • Participants shall bring their own material. This art is known differently in various regions such as Mandna, Alpana, Alekhan, kolam, rangoli etc. For this the medium and form for expression can be freehand, pictorial and descriptive"+
                "\n \n • Only one medium shall be used – Poster colors, or flower petals, or sawdust, or pulses, or rice without pasting"+
                "\n \n • The participants shall have to prepare a rangoli within the space provided");
        return Event0;
    }

    public static EventData getArtEvent6Data()
    {
        EventData Event0 = new EventData();
        Event0.setEvent_name("Face Painting");
        Event0.setInter(true);
        Event0.setSize(1);
        Event0.setDate("31/03/2016 (day 2)");
        Event0.setTime("09:00 am");
        Event0.setVenue("Amphi Theatre");
        Event0.setCoordinator("Anju Balakrishnan");
        Event0.setPhone("8197787574");
        Event0.setRules("\n \n • Duration will not be more than 2 hours" +
                "\n \n • Participants shall bring their own material"+
                "\n \n • The participants have to bring their partners to paint on their respective partner’s face"+
                "\n \n • Theme will be provided on the spot");
        return Event0;
    }

    public static EventData getArtEvent7Data()
    {
        EventData Event0 = new EventData();
        Event0.setEvent_name("Mehendi");
        Event0.setSize(1);
        Event0.setDate("30/03/2016 (day 1)");
        Event0.setTime("03:00 pm");
        Event0.setVenue("LHC Stage");
        Event0.setCoordinator("Thressia");
        Event0.setPhone("9886495776");
        Event0.setRules("\n \n • Duration will not be more than 2 hours" +
                "\n \n • The participants have to bring their partners to paint on their respective partner’s hands"+
                "\n \n • The participants have to draw mehendi on both the hands of the partner"+
                "\n \n • Mehendi cones will be provided");
        return Event0;
    }

    public static EventData getArtEvent8Data()
    {
        EventData Event0 = new EventData();
        Event0.setEvent_name("Camouflage");
        Event0.setSize(2);
        Event0.setDate("30/03/2016 (day 1)");
        Event0.setTime("09:00 am");
        Event0.setVenue("LHC Stage");
        Event0.setCoordinator("Attreyee");
        Event0.setPhone("9731760093");
        Event0.setRules("\n \n • There must be 2 members in a team" +
                "\n \n • The theme for the event will be given on the spot"+
                "\n \n • The duration of the event will be not more than 1 hour 30 minutes"+
                "\n \n • Participants are requested to carry their own material like paints, brushes, markers, etc");
        return Event0;
    }

    public static EventData getArtEvent9Data()
    {
        EventData Event0 = new EventData();
        Event0.setEvent_name("Paper Couture");
        Event0.setSize(2);
        Event0.setDate("01/04/2016 (day 3)");
        Event0.setTime("12:00 pm");
        Event0.setVenue("LHC Stage");
        Event0.setCoordinator("Anju");
        Event0.setPhone("8197787574");
        Event0.setRules("\n \n • There must be 2 members in a team" +
                "\n \n • Theme will be given on the spot"+
                "\n \n • The duration of the event will be not more than 2 hours"+
                "\n \n • The materials for the event will be provided by the organizers");
        return Event0;
    }

    public static EventData getArtEvent10Data()
    {
        EventData Event0 = new EventData();
        Event0.setEvent_name("Poster Making");
        Event0.setSize(1);
        Event0.setDate("30/03/2016 (day 1)");
        Event0.setTime("10:00 am");
        Event0.setVenue("ESB 2 Stage");
        Event0.setCoordinator("Anju");
        Event0.setPhone("8197787574");
        Event0.setRules("\n \n • Event will be conducted on the spot and participants will be requested to do poster making on the subject or topic / theme giving by the judges/event coordinator" +
                "\n \n • Duration will not be more than 2 hours 30 minutes"+
                "\n \n • Participants shall bring their own material. Only the drawing paper of size 22” x 15” will be provided by the organizers"
        );
        return Event0;
    }

    public static EventData getMusicEvent0Data()
    {
        EventData Event0 = new EventData();
        Event0.setEvent_name("Western Group Music");
        Event0.setInter(true);
        Event0.setSize(12);
        Event0.setDate(day3);
        Event0.setTime("12:00 pm");
        Event0.setVenue("Main Stage");
        Event0.setCoordinator("Harish Jayanth");
        Event0.setPhone("9986667984");
        Event0.setRules("\n \n • Maximum 6 singers in a group. Maximum number of accompanists playing shall be 6." +
                "\n \n • Maximum time allowed for group song is 10+5 minutes which does not include setting time"+
                "\n \n • The setting time for a group shall not exceed 5 minutes"+
                "\n \n • The prelims for the MSRIT bands will be held on the same day"+
                "\n \n • Judgment will be based on qualities like composition, rhythm, difficulty and general impression"+
                "\n \n • Any number of instruments allowed"+
                "\n \n • Language must be English only"+
                "\n \n • In case of number of registered bands exceeding the number of slots, a screening process will take place, details of which will be given to the teams"
        );
        return Event0;
    }

    public static EventData getMusicEvent1Data()
    {
        EventData Event0 = new EventData();
        Event0.setEvent_name("Indian Group Music");
        Event0.setInter(true);
        Event0.setSize(6);  //todo findout 6 or 12
        Event0.setDate(day1);
        Event0.setTime("03:00 pm");
        Event0.setVenue("Main Stage");
        Event0.setCoordinator("Raghav");
        Event0.setPhone("9611745137");
        Event0.setRules("\n \n • A team has to present two songs" +
                        "\n \n • "+ //todo whattt???????
                        "\n \n • The songs will be taken from Indian Songs which can be in regional languages"+
                        "\n \n • No film songs"+
                        "\n \n • Maximum time allotted is 10 mins, without setting time"+
                        "\n \n • Setting time not more than 4 mins"+
                        "\n \n • Judging will be based on quality of singing only"
        );
        return Event0;
    }

    public static EventData getMusicEvent2Data()
    {
        EventData Event0 = new EventData();
        Event0.setEvent_name("Western Acoustics Solo");
        Event0.setInter(true);
        Event0.setSize(1); //todo rules missing
        Event0.setDate(day2);
        Event0.setTime("09:00 am");
        Event0.setVenue("Hi Tech Semminar Hall");
        Event0.setCoordinator("Samarth Mamadapur");
        Event0.setPhone("9902500902");
        Event0.setRules("\n \n • Maximum time for stage/instrument setup is 2 minutes" +
                        "\n \n • The prelims for the MSRIT participants will be held on the 8th. The winners of the prelims will represent MSRIT in the inter event"+
                        "\n \n • Maximum number of accompanists is two"+
                        "\n \n • Duration of the performance shall be between 4-6 minutes"+
                        "\n \n • Judgment will be based on qualities like composition, rhythm, style, difficulty, fluency and general impression"
        );
        return Event0;
    }

    public static EventData getMusicEvent3Data()
    {
        EventData Event0 = new EventData();
        Event0.setEvent_name("Western Acoustics Group");
        Event0.setInter(true);
        Event0.setSize(3);  //todo rules missing
        Event0.setDate(day2);
        Event0.setTime("01:00 pm");
        Event0.setVenue("Hi Tech Semminar Hall");
        Event0.setCoordinator("Samarth Mamadapur");
        Event0.setPhone("9902500902");
        Event0.setRules("\n \n • Maximum time for stage/instrument setup is 2 minutes" +
                        "\n \n • The prelims for the MSRIT participants will be held on the 8th. The winners of the prelims will represent MSRIT in the inter event"+
                        "\n \n • Maximum number of accompanists is two"+
                        "\n \n • Duration of the performance shall be between 4-6 minutes"+
                        "\n \n • Judgment will be based on qualities like composition, rhythm, style, difficulty, fluency and general impression"
        );
        return Event0;
    }

    public static EventData getMusicEvent4Data()
    {
        EventData Event0 = new EventData();
        Event0.setEvent_name("Indian Light Music Solo");
        Event0.setInter(true);
        Event0.setSize(1);
        Event0.setDate(day1);
        Event0.setTime("09:00 am");
        Event0.setVenue("Amphi Theatre");
        Event0.setCoordinator("Shriya");
        Event0.setPhone("9632413752");
        Event0.setRules("\n \n • Time for stage or instruments setting is maximum 2 minutes duration " +
                        "\n \n • Event will consist of two separate rounds – Qualifying round and Finals – which will be held on two separate days"+
                        "\n \n • Qualifying round will have a time limit of 3 minutes"+
                        "\n \n • Final round will consist of three individual rounds which will be decided by the judges. Finalists should be ready with 5 songs of preferably different genres"+
                        "\n \n • Only film songs are allowed"+
                        "\n \n • Karaoke is not allowed for prelims as well as finals. The final rounds will be accompanied by a professional orchestra which shall be arranged"
        );
        return Event0;
    }

    public static EventData getMusicEvent5Data()
    {
        EventData Event0 = new EventData();
        Event0.setEvent_name("Classical Vocal Solo");
        Event0.setInter(true);
        Event0.setSize(1);
        Event0.setDate(day2);
        Event0.setTime("12:00 pm");
        Event0.setVenue("LHC Seminar Hall 1");
        Event0.setCoordinator("Pramod Gabbur");
        Event0.setPhone("8147650695");
        Event0.setRules("\n \n • Duration of performance-12-15 mins" +
                        "\n \n • Maximum number of accompanists is two"+
                        "\n \n • Time for stage or instruments setting is maximum 5 mins"+
                        "\n \n • Item can be presented in either Hindustani or Carnatic style"+
                        "\n \n • Film songs are not allowed under this event"+
                        "\n \n • Sufficient thought and care must be exercised in the choice of raga and composition"+
                        "\n \n • Judgment will be based on qualities like taal, selection of raga, composition and general impression."
        );
        return Event0;
    }

    public static EventData getMusicEvent6Data()
    {
        EventData Event0 = new EventData();
        Event0.setEvent_name("Semi - Classical Vocal Solo");
        Event0.setInter(true);
        Event0.setSize(1);
        Event0.setDate(day2);
        Event0.setTime("02:00 pm");
        Event0.setVenue("LHC Seminar Hall 1");
        Event0.setCoordinator("Pramod Gabbur");
        Event0.setPhone("8147650695");
        Event0.setRules("\n \n • Time limit- 4 to 6 minutes" +
                        "\n \n • Time for stage or instruments setting is maximum 2 mins"+
                        "\n \n • Only non filmy songs /geeth/ghazal/bhajan/shabad and abhanges can be presented"+
                        "\n \n • A maximum of two accompanists allowed"+
                        "\n \n • Film songs not allowed"+
                        "\n \n • Judgment will be based on qualities like swara, taal, selection of raga, composition and overall presentation"+
                        "\n \n • Judges decision is final and binding"
        );
        return Event0;
    }

    public static EventData getMusicEvent7Data()
    {
        EventData Event0 = new EventData();
        Event0.setEvent_name("Classical Instrumental Solo");
        Event0.setInter(true);
        Event0.setSize(1);
        Event0.setDate(day2);
        Event0.setTime("09:00 am");
        Event0.setVenue("LHC Seminar Hall 1");
        Event0.setCoordinator("Ankit Verma");
        Event0.setPhone("8867831648");
        Event0.setRules("\n \n • Instrument can be percussion or non percussion" +
                        "\n \n • Duration of performance-12-15 min"+
                        "\n \n • Maximum time for stage/instrument setup is 5 minutes"+
                        "\n \n • Maximum number of accompanists is two"+
                        "\n \n • Participants must bring their own instruments"+
                        "\n \n • Item can be presented in either Hindustani or Carnatic style"+
                        "\n \n • Judgment will be based on qualities like taal, selection of raga, composition and general impression"
        );
        return Event0;
    }

    public static EventData getMusicEvent8Data()
    {
        EventData Event0 = new EventData();
        Event0.setEvent_name("Beat Boxing");
        Event0.setInter(true);
        Event0.setSize(1); //todo rules missing
        Event0.setDate(day2);
        Event0.setTime("12:00 pm");
        Event0.setVenue("ESB 2 stage");
        Event0.setCoordinator("Suraj Suresh");
        Event0.setPhone("9035120278");
        Event0.setRules("\n \n • Instrument can be percussion or non percussion" +
                        "\n \n • Duration of performance-12-15 min"+
                        "\n \n • Maximum time for stage/instrument setup is 5 minutes"+
                        "\n \n • Maximum number of accompanists is two"+
                        "\n \n • Participants must bring their own instruments"+
                        "\n \n • Item can be presented in either Hindustani or Carnatic style"+
                        "\n \n • Judgment will be based on qualities like taal, selection of raga, composition and general impression"
        );
        return Event0;
    }

    public static EventData getMusicEvent9Data()
    {
        EventData Event0 = new EventData();
        Event0.setEvent_name("Antaakshari");
        Event0.setSize(2);
        Event0.setDate(day1);
        Event0.setTime("01:00 pm");
        Event0.setVenue("ESB 2 stage");
        Event0.setCoordinator("Nandita");
        Event0.setPhone("9945045100");
        Event0.setRules("\n \n • A team would consist of two members " +
                        "\n \n • There would be four rounds having different modes"+
                        "\n \n • These rounds would be declared only at the time of the game"+
                        "\n \n • The decision of the judges would be final"
        );
        return Event0;
    }

    public static EventData getMusicEvent10Data()
    {
        EventData Event0 = new EventData();
        Event0.setEvent_name("Karaoke");
        Event0.setSize(1);
        Event0.setDate(day1);
        Event0.setTime("02:00 pm");
        Event0.setVenue("ESB Big Seminar Hall");
        Event0.setCoordinator("Niranjan");
        Event0.setPhone("9741639796");
        Event0.setRules("\n \n • Individual Event" +
                        "\n \n • Duration not more than 5 mins"+
                        "\n \n • Allowed to sing only one song"+
                        "\n \n • Judgment will be left to the discretion of the judges"+
                        "\n \n • Karaoke track has to be submitted to the event coordinator before 11 am on the event  day (Mp4 or Mp3)"
        );
        return Event0;
    }


    public static EventData getTheatreEvent0Data()
    {
        EventData Event0 = new EventData();
        Event0.setEvent_name("One Act Play");
        Event0.setInter(true);
        Event0.setSize(3);
        Event0.setDate(day2);
        Event0.setTime("09:00 am");
        Event0.setVenue("Apex Block Auditorium");
        Event0.setCoordinator("Pavan Kamat");
        Event0.setPhone("");
        Event0.setRules("\n \n • The duration of the play shall not exceed 30 minutes" +
                        "\n \n • The time will be counted as soon as the signal is given to start the play or to start the introduction, whichever is early. Empty stage to empty stage shall be followed strictly. For stage setting and removal of set and properties, up to 5 minutes will be given after taking charge of the stage"+
                        "\n \n • The number of participants should not exceed 9 and the maximum number of accompanists should not exceed 3. The participating team shall bring their own set/ stage paraphernalia, make-up materials, etc, light and general paraphernalia such as ordinary furniture which may be provided on advance information"+
                        "\n \n • Participants may speak in Hindi or English or any regional language of India. In case the language is regional one, synopsis of the play with translation in English or Hindi must be submitted to the in charge of the competition on the day registration"+
                        "\n \n • The participating team must report to the in charge of the competition at least 1 hour before the presentation of the play"+
                        "\n \n • Judgment will be based on the qualities of the play like theme, work of acting, stage craft, design and general impression, etc."+
                        "\n \n • Decision of the panel of judges will be final and binding upon all"+
                        "\n \n • Accompanists will either speak from the background or will play upon musical instruments for background music."
        );
        return Event0;
    }

    public static EventData getTheatreEvent1Data()
    {
        EventData Event0 = new EventData();
        Event0.setEvent_name("Skit");
        Event0.setInter(true);
        Event0.setSize(3);
        Event0.setDate(day3);
        Event0.setTime("10:00 am");
        Event0.setVenue("ESB Small Seminar Hall");
        Event0.setCoordinator("Supreeth HS");
        Event0.setPhone("8904430345");
        Event0.setRules("\n \n • Maximum Number of participants allowed is 6, with 3 accompanists" +
                "\n \n • Maximum time allotted for each team is 10 minutes (+2 minutes for stage setup and scene changes)."+
                "\n \n • Use of make-up, drapery and background music is allowed. No personal remarks, aspersions, character assassination etc is allowed."+
                "\n \n • Participating team should submit copies of the synopsis of the theme of the skit along with language of presentation (English, Hindi or Kannada) on the day of registration"+
                "\n \n • The presentation will be judged basically on the qualities like theme, work on acting, stage craft, design and general impression"+
                "\n \n • Vulgarity or bitter insinuation in presentation should be avoided. Only innocent satire or humour is expected."
        );
        return Event0;
    }

    public static EventData getTheatreEvent2Data()
    {
        EventData Event0 = new EventData();
        Event0.setEvent_name("Short Films");
        Event0.setInter(true);
        Event0.setSize(3);
        Event0.setDate(day2);
        Event0.setTime("09:00 am");
        Event0.setVenue("ESB Small Seminar Hall");
        Event0.setCoordinator("Mani Bharathi");
        Event0.setPhone("");
        Event0.setRules("\n \n • Time limit is 15 minutes from title to credits" +
                "\n \n • The participant must submit their movie in CD/ USB drive before 9 a.m. on the day of the event"+
                "\n \n • There should be no objectionable content; portrayal of illicit substances, tobacco products, or alcoholic beverages is not advised. Any such portrayal must be accompanies with a statutory warning in readable text at the bottom of the screen. Participants who do not adhere to this rule will be disqualified"+
                "\n \n • Documentaries are allowed, but must adhere to time limit and content restrictions as stated above"+
                "\n \n • Names, phone numbers and USN of the students are to be collected at the time of submission along with a synopsis of the film"
        );
        return Event0;
    }

    public static EventData getTheatreEvent3Data()
    {
        EventData Event0 = new EventData();
        Event0.setEvent_name("Short Ads");
        Event0.setInter(true);
        Event0.setSize(3);
        Event0.setDate(day2);
        Event0.setTime("04:00 pm");
        Event0.setVenue("ESB Small Seminar Hall");
        Event0.setCoordinator("Mani Bharathi");
        Event0.setPhone("");
        Event0.setRules("\n \n • Time limit is 3 minutes from the start to the end" +
                "\n \n • The ad can be made on any topic or subject that is not objectionable"+
                "\n \n • The participant must submit their movie in CD/ USB drive before 9 a.m. on the day of the event"+
                "\n \n • There should be no objectionable content; portrayal of illicit substances, tobacco products, or alcoholic beverages is not advised. Any such portrayal must be accompanies with a statutory warning in readable text at the bottom of the screen. Participants who do not adhere to this rule will be disqualified"+
                "\n \n • Names, phone numbers and USN of the students are to be collected at the time of submission of the ad"
        );
        return Event0;
    }

    public static EventData getTheatreEvent4Data()
    {
        EventData Event0 = new EventData();
        Event0.setEvent_name("Street Play");
        Event0.setInter(true);
        Event0.setSize(3); //todo rules missing
        Event0.setDate(day3);
        Event0.setTime("03:00 pm");
        Event0.setVenue("Parking lot stage");
        Event0.setCoordinator("Muhammed Sufail");
        Event0.setPhone("9036049324");
        Event0.setRules("\n \n • There will be written preliminary round and the teams will be selected for finals" +
                "\n \n • A team should consist of 3 people"+
                "\n \n • Finals will be conducted as per quizmaster’s choice"+
                "\n \n • The specific rules regarding evaluation procedure, time to reply for a particular answer and the type of round will be given before the actual start of the competition");
        return Event0;
    }


    public static EventData getDanceEvent0Data()
    {
        EventData Event0 = new EventData();
        Event0.setEvent_name("Classical Dance Solo");
        Event0.setSize(3);
        Event0.setDate(day3);
        Event0.setTime("10:00 am");
        Event0.setVenue("Hi-Tech Seminar Hall");
        Event0.setCoordinator("Nidhi Madhusudhan");
        Event0.setPhone("9740077479");
        Event0.setRules("\n \n • The classical dance can be from any of the approved schools of dance such as Kathak, Kathakali, Bharath Natyam, Xatriya, Manipuri, Kuchipudi, Mohiniattam, Odissi etc" +
                "\n \n • Participant will be allowed up to 15 minutes including time for preparation. Maximum three accompanists are permissible."+
                "\n \n • Judgment will be based on the qualities like taal, technique, rhythm, abhinaya or expression, costumes, footwork and general impression, etc"+
                "\n \n • Three copies of a brief note on the description of dance story involved in it, if any, and of the accompanying song with its meaning in Hindi or English must be submitted at the time of the event at the venue"
        );
        return Event0;
    }

    public static EventData getDanceEvent1Data()
    {
        EventData Event0 = new EventData();
        Event0.setEvent_name("Dance As You Like");
        Event0.setInter(true);
        Event0.setSize(1);
        Event0.setDate(day2);
        Event0.setTime("12:00 pm");
        Event0.setVenue("Law Canteen");
        Event0.setCoordinator("Aishwarya Rajan");
        Event0.setPhone("9845597663");
        Event0.setRules("\n \n • It is an individual event" +
                "\n \n • Style of dance should be purely western (freestyle, street, hip hop)."+
                "\n \n • Prelims consist of 1 round, in which the participant has to perform for a maximum of 2+1 minutes"+
                "\n \n • Participants must get their own music. It should be provided in a CD/pen drive and should be submitted 1 hour prior to the event."+
                "\n \n • Finals consist of 2 rounds. Rules will be announced on the spot."+
                "\n \n • Judgment will be based on technique and style of dance"+
                "\n \n • Obscenity in dress code will result in disqualification"+
                "\n \n • Any form of vulgarity or indecent behavior will lead to immediate disqualification and a possible ban from further MSRIT competitions"
        );
        return Event0;
    }

    public static EventData getDanceEvent2Data()
    {
        EventData Event0 = new EventData();
        Event0.setEvent_name("Indian Contemporary Group Dance");
        Event0.setInter(true);
        Event0.setSize(12);
        Event0.setDate(day2);
        Event0.setTime("10:00 am");
        Event0.setVenue("Main Stage");
        Event0.setCoordinator("Shreya Nair");
        Event0.setPhone("8861862967");
        Event0.setRules("\n \n • Maximum 12 participants allowed per team" +
                        "\n \n • The number of accompanists permissible is 2"+
                        "\n \n • The dance can be either Indian Style (Tribal/Folk) or Contemporary. (No Classical or Bollywood)"+
                        "\n \n • Duration of a dance should not be more than 6+2 minutes"+
                        "\n \n • Participating teams will be responsible for removal of their sets/properties etc. immediately after the completion of performance"+
                        "\n \n • Judgment will be based on rhythm, formation, expression, costumes, make-up, sets, and on overall effect"+
                        "\n \n • Use of fire, explosives, dust etc. is strictly prohibited"+
                        "\n \n • Any form of vulgarity or indecent behaviour will lead to immediate disqualification and a possible ban from further MSRIT competitions"
        );        return Event0;
    }

    public static EventData getDanceEvent3Data()
    {
        EventData Event0 = new EventData();
        Event0.setEvent_name("Western Group Dance");
        Event0.setInter(true);
        Event0.setSize(15);
        Event0.setDate(day2);
        Event0.setTime("02:00 pm");
        Event0.setVenue("Main Stage");
        Event0.setCoordinator("Vivek Chandru");
        Event0.setPhone("8553717447");
        Event0.setRules("\n \n • Team shall consist up to 15 participants." +
                        "\n \n • Time duration is 6+2 minutes"+
                        "\n \n • The participating team will be responsible for the removal of their sets/properties etc. immediately after the completion of the performance"+
                        "\n \n • Judgment will be based on choreography, costumes and overall presentation"+
                        "\n \n • A minimum of 4 dancers and a maximum of 12 dancers on stage at any particular time"+
                        "\n \n • Songs should be provided on a CD or pen drive containing only songs required by that performance"+
                        "\n \n • Props are allowed. Use of fire or other explosives strictly not allowed"+
                        "\n \n • Same person cannot dance in more than one dance of the same category"+
                        "\n \n • At no point of the sequence should the stage be left completely empty"+
                        "\n \n • No profanity is to be displayed"+
                        "\n \n • Any form of vulgarity or indecent behavior will lead to immediate disqualification and a possible ban from further MSRIT competitions"+
                        "\n \n • In case of number of registered teams exceeding the number of slots a screening process will take place, details of which will be given to the teams"
        );        return Event0;
    }

    public static EventData getDanceEvent4Data()
    {
        EventData Event0 = new EventData();
        Event0.setEvent_name("Street Dance");
        Event0.setInter(true);
        Event0.setSize(10);
        Event0.setDate(day3);
        Event0.setTime("11:00 am");
        Event0.setVenue("Law canteen");
        Event0.setCoordinator("Ankush Shetty");
        Event0.setPhone("9686487110");
        Event0.setRules("\n \n • A minimum of 4 and maximum of 10 participants per team, for the crew v/s crew event, and 2 participants per team for the 2 v/s 2 event (Non - Engineering crews are permitted to take part)" +
                        "\n \n • The first round is the 'SHOWCASE' round. Here crews have to get their own music and perform an already choreographed dance. Minimum -1 min, Maximum-5 minutes"+
                        "\n \n • The crews will be eliminated based on this round"+
                        "\n \n • In the next round, random music will be played and the crews have to battle with each other. Two crews battling at once, which will be picked on a random basis"+
                        "\n \n • If the scores are tied in the final round and judges are unable to decide, then there will be another tie breaker 'SHOWCASE' round for 1 min and the winner will be decided based on that"
        );        return Event0;
    }


    public static EventData getUdbCupEvent0Data()
    {
        EventData Event0 = new EventData();
        Event0.setEvent_name("Movie Quiz");
        Event0.setSize(3);
        Event0.setDate("31/03/2016");
        Event0.setTime("09:00 am");
        Event0.setVenue("LHC Seminar Hall 2");
        Event0.setCoordinator("Tanoy Dutta");
        Event0.setPhone("9742031736");
        Event0.setRules("\n \n • " +
                        "\n \n • "+
                        "\n \n • "+
                        "\n \n • "+
                        "\n \n • "
        );        return Event0;
    }

    public static EventData getUdbCupEvent1Data()
    {
        EventData Event0 = new EventData();
        Event0.setEvent_name("Movie Quiz");
        Event0.setSize(3);
        Event0.setDate("31/03/2016");
        Event0.setTime("09:00 am");
        Event0.setVenue("LHC Seminar Hall 2");
        Event0.setCoordinator("Tanoy Dutta");
        Event0.setPhone("9742031736");
        Event0.setRules("\n \n • " +
                        "\n \n • "+
                        "\n \n • "+
                        "\n \n • "+
                        "\n \n • "
        );        return Event0;
    }

    public static EventData getUdbCupEvent2Data()
    {
        EventData Event0 = new EventData();
        Event0.setEvent_name("Movie Quiz");
        Event0.setSize(3);
        Event0.setDate("31/03/2016");
        Event0.setTime("09:00 am");
        Event0.setVenue("LHC Seminar Hall 2");
        Event0.setCoordinator("Tanoy Dutta");
        Event0.setPhone("9742031736");
        Event0.setRules("\n \n • " +
                        "\n \n • "+
                        "\n \n • "+
                        "\n \n • "+
                        "\n \n • "
        );        return Event0;
    }

    public static EventData getUdbCupEvent3Data()
    {
        EventData Event0 = new EventData();
        Event0.setEvent_name("Movie Quiz");
        Event0.setSize(3);
        Event0.setDate("31/03/2016");
        Event0.setTime("09:00 am");
        Event0.setVenue("LHC Seminar Hall 2");
        Event0.setCoordinator("Tanoy Dutta");
        Event0.setPhone("9742031736");
        Event0.setRules("\n \n • " +
                        "\n \n • "+
                        "\n \n • "+
                        "\n \n • "+
                        "\n \n • "
        );        return Event0;
    }


    public static EventData getMiscEvent0Data()
    {
        EventData Event0 = new EventData();
        Event0.setEvent_name("Personality");
        Event0.setSize(3);
        Event0.setDate(day1);
        Event0.setTime("10:00 am");
        Event0.setVenue("Pit Stop");
        Event0.setCoordinator("Utsav");
        Event0.setPhone("9620479454");
        Event0.setRules(
                        "\n \n \n \n Preliminary: "+
                        "\n \n • Questionnaire to be collected from Pit Stop"+
                        "\n \n • Form has to be submitted by the specified date and time"+
                        "\n \n • You have to be creative, humorous and make sense"+
                        "\n \n • No profanity is allowed"+
                        "\n \n \n \n Finals: "+
                        "\n \n • Finalists will be announced on the morning of the day of the event"+
                        "\n \n • All rounds will be announced by the coordinators/judges during the course of the finals"+
                        "\n \n • Decision of the judges is final and binding"+
                        "\n \n • No profanity is allowed"
        );
        return Event0;
    }

    public static EventData getMiscEvent1Data()
    {
        EventData Event0 = new EventData();
        Event0.setEvent_name("Cooking");
        Event0.setSize(3);
        Event0.setDate(day3);
        Event0.setTime("09:00 am");
        Event0.setVenue("ESB 2 basement");
        Event0.setCoordinator("Moheez Mushtaq");
        Event0.setPhone("9591212477");
        Event0.setRules("\n \n • No fire cooking" +
                        "\n \n • Participants must carry their own materials"+
                        "\n \n • Maximum duration and other guidelines will be announced on the spot"+
                        "\n \n • Maximum number of participants is 3 per team"
        );        return Event0;
    }

    public static EventData getMiscEvent2Data()
    {
        EventData Event0 = new EventData();
        Event0.setEvent_name("Treasure Hunt");
        Event0.setSize(3);
        Event0.setDate(day2);
        Event0.setTime("11:00 am");
        Event0.setVenue("Pit Stop");
        Event0.setCoordinator("Aditi Hudli");
        Event0.setPhone("");
        Event0.setRules("\n \n • Event will be conducted within college premises" +
                        "\n \n • All participants must assemble at the venue 30 minutes before the start of the event"+
                        "\n \n • Maximum number of participants is 3 per team"
        );        return Event0;
    }

    public static EventData getMiscEvent3Data()
    {
        EventData Event0 = new EventData();
        Event0.setEvent_name("Msrit’s Got Talent");
        Event0.setSize(5);
        Event0.setDate(day1);
        Event0.setTime("12:00 pm");
        Event0.setVenue("Main Stage");
        Event0.setCoordinator("");
        Event0.setPhone("");
        Event0.setRules("\n \n • It is an individual or a group of participants of maximum 5 people event, which showcases the talents of performers in music, dance, acting, art, or any other creative performance. (In case of more than one participant for an act the participants need to inform the event coordinator during registration)." +
                        "\n \n • It is strongly recommended that an act runs no more than 3 minutes. Under no circumstances may an act run more than 3 minutes 15 seconds. Acts exceeding time limit will be disqualified"+
                        "\n \n • The act is timed from the first initiation of the act"+
                        "\n \n • The participants must report at least an hour before the start of the event at the venue"+
                        "\n \n • CD player will be provided. Events where music is required the participants need to submit the CD’s by the specified date at the PITSTOP. Please label your CD’s with name and USN for identification."+
                        "\n \n • No dangerous props like fire, glass, etc can be used during any of the performances"+
                        "\n \n • No props will be provided"+
                        "\n \n • There will be two rounds in the event. All contestants must perform a different piece for finals than the one they performed for the preliminary show"+
                        "\n \n • No vulgarity is allowed."
        );        return Event0;
    }

    public static EventData getMiscEvent4Data()
    {
        EventData Event0 = new EventData();
        Event0.setEvent_name("On The Spot Photography");
        Event0.setInter(true);
        Event0.setSize(3);
        Event0.setDate(day2);
        Event0.setTime("09:00 am");
        Event0.setVenue("Pit Stop");
        Event0.setCoordinator("Rahul Ravindran");
        Event0.setPhone("");
        Event0.setRules("\n \n • The participant has to bring his/her own camera" +
                        "\n \n • The camera should have a memory card which will be formatted before the commencement of the contest."+
                        "\n \n • The participant has to submit 5 photographs on the theme announced on the spot"+
                        "\n \n • No mixing/matching/morphing of photographs will be permitted"+
                        "\n \n • Software such as Photoshop etc for enhancing images will not be permitted"+
                        "\n \n • Digital images are evaluated on the basis of Impact, Composition, Technical quality, Suitability for the specific theme"+
                        "\n \n • Additional rules and theme will be announced on the spot"+
                        "\n \n • Vulgar, obscene or questionable photographs will be dealt with seriously"+
                        "\n \n • Time of submission will be announced on the spot"
        );        return Event0;
    }

    public static EventData getMiscEvent5Data()
    {
        EventData Event0 = new EventData();
        Event0.setEvent_name("Fifa 14");
        Event0.setInter(true);
        Event0.setSize(3);
        Event0.setDate(day2);
        Event0.setTime("11:00 am");
        Event0.setVenue("Lab1, DES Block"); //todo lab 1 or 2
        Event0.setCoordinator("Saksham");
        Event0.setPhone("");
        Event0.setRules("\n \n •Game type: Friendlies. \n" +
                        "Half length: 5 minutes. \n" +
                        "Choice of controller: Any. \n" +
                        "Controls: Tactical. \n" +
                        "Squads: Offline. \n"+
                        "Game speed: Normal. \n" +
                        "Playing conditions: Normal, Night\n \n" +
                        "\n \n • Choice of team: League clubs for initial rounds. International for quarter and semi finals."+
                        "\n \n • No use of tactics allowed. In case of a draw, game proceeds with a penalty shootout"
        );        return Event0;
    }

    public static EventData getMiscEvent6Data()
    {
        EventData Event0 = new EventData();
        Event0.setEvent_name("Dota 2");
        Event0.setInter(true);
        Event0.setSize(5);
        Event0.setDate(day2);
        Event0.setTime("11:00 am");
        Event0.setVenue("Lab1, DES Block");
        Event0.setCoordinator("");
        Event0.setPhone("");
        Event0.setRules("\n \n • Each team will consist of 5 members"+
                        "\n \n • Each game will end in Elimination of losing team, Except for the final, which will be best of three matches."+
                        "\n \n • Standard \"Captain's mode\" drafting for each game (Unavailable heroes will be Terror Blade and Phantom Lancer)"+
                        "\n \n • There is no time constraint on any matches, and will be played for the entire duration, However GG can be called any time and the match may be forfeited. "+
                        "\n \n • Fixtures will be decided beforehand and time slots will be provided. Each team is expected to be present 1 hour before their match or else it may lead to disqualification. "+
                        "\n \n • All 3rd party softwares, hacks and scripts are banned. The match will be monitored closely by the host server and umpires to ensure that the games are fair."+
                        "\n \n • There will be a coin toss to decide which team is on the Radiant and the Dire and most importantly, come up with a cool team name and have fun"+
                        "\n \n • Maximum of 2 tactical pauses of 1 minute each per team"+
                        "\n \n • No substitutions of team mates can take place without a valid explanation and the consent of the event organizer "
        );        return Event0;
    }

    public static EventData getMiscEvent7Data()
    {
        EventData Event0 = new EventData();
        Event0.setEvent_name("Counter Strike 1.6");
        Event0.setInter(true);
        Event0.setSize(5);
        Event0.setDate(day3);
        Event0.setTime("10:00 am");
        Event0.setVenue("Lab1, DES Block");
        Event0.setCoordinator("Krunal Bhatt");
        Event0.setPhone("9535114490");
        Event0.setRules("\n \n • Each team will consists of 5 members"+
                        "\n \n • There will be Elimination rounds followed by Quarter finals, Semi-finals and then the Finals. Elimination rounds will be played on the aa_dima2 map , Quarterfinals in de_train and Semifinals in de_dust2 and Finals in de_inferno"+
                        "\n \n • A game will consist of two periods, consisting of five rounds each, each round will last 2.00 minutes, one period as terrorists and the other as counter- terrorists for each team"+
                        "\n \n • Deciding of which team plays Terrorists or Counter Terrorists will be based on a 1v1 knife round."+
                        "\n \n • Organizers’ decision will be final in case of a discrepancy, banning or any such problem."+
                        "\n \n • Matches will be watched closely by the host server and a few other umpires, make sure you follow the rules and play to win."+
                        "\n \n • Substitution is allowed only once per team."+
                        "\n \n • Cheating or using of any hacks will lead to disqualification"+
                        "\n \n • Further rule changes, if any, will be conveyed to participants"
        );        return Event0;
    }

}
