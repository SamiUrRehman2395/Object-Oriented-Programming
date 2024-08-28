package com.advanced_java;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date_Time_Formatter {
    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.now();

        System.out.println(dt);

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String myDate = dt.format(f);

        System.out.println(myDate);
    }
}
