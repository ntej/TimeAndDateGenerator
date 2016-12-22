package com.ntej.www;


import java.util.ArrayList;

public class Main {

ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {
	// write your code here
        Main main = new Main();
        main.list = TimeZonesProcessor.getAllZoneIdsWithTimeAndDate();

        for(String list : main.list )
        {
            System.out.println(list);
            System.out.println("-------");
        }

    }
}
