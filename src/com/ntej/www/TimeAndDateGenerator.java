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


    DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss a Z ");

    ArrayList<String> allZonesTimeAndDateList = new ArrayList<>();

    StringBuilder sb = new StringBuilder();


    protected static ArrayList<String> getAllZoneIdsWithTimeAndDate()
    {
//        TimeAndDateGenerator tztg = new TimeAndDateGenerator();
//
//        tztg.sb.append("String 1");
//        tztg.sb.append("String 2");
//
//                tztg.allZonesTimeAndDateList.add(tztg.sb.toString());
        TimeAndDateGenerator tztg = new TimeAndDateGenerator();

        for(String zoneId : TimeZone.getAvailableIDs())
        {

            tztg.sb.append(zoneId+'\n');

            tztg.formatter.setTimeZone(TimeZone.getTimeZone(zoneId));
            tztg.sb.append(tztg.formatter.format(new Date()));



            tztg.allZonesTimeAndDateList.add(tztg.sb.toString());

            tztg.sb.setLength(0);
        }


        return tztg.allZonesTimeAndDateList;
   }



}
