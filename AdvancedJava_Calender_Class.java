package com.advanced_java;

import java.util.Calendar;
import java.util.TimeZone;

public class Calender_Class {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());
        System.out.println(c.getTimeZone().getID());


        Calendar c1 = Calendar.getInstance(TimeZone.getTimeZone("Australia/Sydney"));

        System.out.println(c1.getCalendarType());
        System.out.println(c1.getTimeZone());
        System.out.println(c1.getTimeZone().getID());

    }
}

// Calendar class is a abstract class