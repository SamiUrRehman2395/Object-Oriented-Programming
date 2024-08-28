package com.advanced_java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Java_Time_API {
    public static void main(String[] args) {

        LocalDate d = LocalDate.now();
        LocalTime t = LocalTime.now();
        LocalDateTime dt = LocalDateTime.now();

        System.out.println(d);
        System.out.println(t);
        System.out.println(dt);
    }
}
