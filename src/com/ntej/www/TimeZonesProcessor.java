package com.ntej.www;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.TimeZone;

/**
 * Created by navatejareddy on 12/19/16.
 */
public class TimeZonesProcessor {


    Hashtable Zone_offset_time = new Hashtable();
    Hashtable Zone_offset_date = new Hashtable();

 //   DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss a ");

    DateFormat offset = new SimpleDateFormat("Z");
    DateFormat date = new SimpleDateFormat("MM/dd/yyy");
    DateFormat time = new SimpleDateFormat("HH:mm:ss a");

  //  ArrayList<String> allZonesTimeAndDateList = new ArrayList<>();

  //  StringBuilder sb = new StringBuilder();


    protected static Hashtable getZonesWithTime()
    {

        TimeZonesProcessor tztg = new TimeZonesProcessor();

        Date date = new Date();

        for(String zoneId : TimeZone.getAvailableIDs())
        {

            tztg.offset.setTimeZone(TimeZone.getTimeZone(zoneId));
            tztg.time.setTimeZone(TimeZone.getTimeZone(zoneId));

           // tztg.formatter.setTimeZone(TimeZone.getTimeZone(zoneId));

            tztg.Zone_offset_time.put(zoneId+"(UTC "+tztg.offset.format(date)+")",
                    tztg.time.format(date) );
        }


        return tztg.Zone_offset_time;
   }


   protected static Hashtable getZonesWIthDate()
   {
       TimeZonesProcessor tztg = new TimeZonesProcessor();
       Date date = new Date();

       for(String zoneId : TimeZone.getAvailableIDs())
       {
           tztg.offset.setTimeZone(TimeZone.getTimeZone(zoneId));
           tztg.date.setTimeZone(TimeZone.getTimeZone(zoneId));

           tztg.Zone_offset_date.put(zoneId+"(UTC "+tztg.offset.format(date)+")",tztg.date.format(date));
       }

       return tztg.Zone_offset_date;
   }

}
