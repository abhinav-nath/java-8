package com.codecafe.java8.datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class NumberOfDaysUntil {

    public static void main(String[] args) {

        LocalDate from = LocalDate.now();

        LocalDate until = LocalDate.of(2021, Month.JUNE, 30);

        long daysUntil = from.until(until, ChronoUnit.DAYS);

        System.out.println("Days until " + until + " = " + daysUntil);
    }

}