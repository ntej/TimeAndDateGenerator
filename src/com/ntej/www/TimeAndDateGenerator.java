package com.ntej.www;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by navatejareddy on 12/19/16.
 */
public class TimeAndDateGenerator {

    DateFormat timeFormatter = new SimpleDateFormat("hh:mm a");
    DateFormat offsetFormatter = new SimpleDateFormat("Z");

    ArrayList<String> allZonesTimeAndDateList = new ArrayList<>();

    StringBuilder sb = new StringBuilder();



    public static ArrayList<String> getAllZoneIdsWithTimeAndDate()
    {
        Date date = new Date();

        TimeAndDateGenerator tztg = new TimeAndDateGenerator();

        for(String zoneId : TimeZone.getAvailableIDs())
        {
            tztg.offsetFormatter.setTimeZone(TimeZone.getTimeZone(zoneId));
            tztg.timeFormatter.setTimeZone(TimeZone.getTimeZone(zoneId));

            tztg.sb.append(zoneId+"(UTC"+tztg.offsetFormatter.format(date)+")"+'\n');

            tztg.sb.append(tztg.timeFormatter.format(date));



            tztg.allZonesTimeAndDateList.add(tztg.sb.toString());

            tztg.sb.setLength(0);
        }


        return tztg.allZonesTimeAndDateList;
   }



}
