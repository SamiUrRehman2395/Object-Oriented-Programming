package com.advanced_java;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Gregorian_Calendar {
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();

        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get((Calendar.MINUTE)));

        GregorianCalendar cal = new GregorianCalendar();

        System.out.println(cal.isLeapYear(2024));

        for (int i=0; i<=630; i++){
            System.out.println(TimeZone.getAvailableIDs()[i]);
        }
    }
}
