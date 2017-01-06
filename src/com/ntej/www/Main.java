package com.ntej.www;

import java.util.Enumeration;
import java.util.Hashtable;

public class Main {

    Hashtable time_offset_zone = new Hashtable();
    Hashtable date_offset_zone = new Hashtable();

    public static void main(String[] args) {
	// write your code here
        Main main = new Main();

        main.time_offset_zone = TimeZonesProcessor.getZonesWithTime();
        main.date_offset_zone = TimeZonesProcessor.getZonesWIthDate();



        Enumeration e = main.time_offset_zone.keys(); //same key for date_offset_zone

        while(e.hasMoreElements())
        {
            String zone_key = (String) e.nextElement();
            System.out.println(zone_key + " : " + main.time_offset_zone.get(zone_key));
            System.out.println(zone_key + " : " + main.date_offset_zone.get(zone_key));

        }

    }
}
