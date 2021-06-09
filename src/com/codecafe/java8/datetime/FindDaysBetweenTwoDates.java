package com.codecafe.java8.datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class FindDaysBetweenTwoDates {

    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(1990, Month.AUGUST, 26);

        LocalDate date2 = LocalDate.now();

        long numberOfDaysBetween = ChronoUnit.DAYS.between(date1, date2);

        System.out.println("Number of days between " + date1 + " and " + date2 + " = " + numberOfDaysBetween);
    }

}