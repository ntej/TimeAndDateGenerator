package com.ntej.www;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by navatejareddy on 12/19/16.
 */
public class TimeZonesProcessor {


    DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss a Z ");

    ArrayList<String> allZonesTimeAndDateList = new ArrayList<>();

    StringBuilder sb = new StringBuilder();


    protected static ArrayList<String> getAllZoneIdsWithTimeAndDate()
    {
        TimeZonesProcessor tztg = new TimeZonesProcessor();

        for(String zoneId : TimeZone.getAvailableIDs())
        {

            tztg.sb.append(zoneId+'\n');

            tztg.formatter.setTimeZone(TimeZone.getTimeZone(zoneId));
            tztg.sb.append(tztg.formatter.format(new Date()));



            tztg.allZonesTimeAndDateList.add(tztg.sb.toString());
        }


        return tztg.allZonesTimeAndDateList;
    }



}
