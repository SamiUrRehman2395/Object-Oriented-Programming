package com.advanced_java;

public class Date_and_Time {
    public static void main(String[] args) {

        //Time since 1 January 1970
        System.out.println(System.currentTimeMillis()); //milliseconds
        System.out.println(System.currentTimeMillis()/1000); //seconds
        System.out.println(System.currentTimeMillis()/1000/3600); //minutes
        System.out.println(System.currentTimeMillis()/1000/3600/24); //hours
        System.out.println(System.currentTimeMillis()/1000/3600/24/365); //days
        System.out.println((System.currentTimeMillis()/1000/3600/24/365)+1970); //current year

    }
}
