package com.codecafe.java8.functionalprogramming.designpatterns.strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StockFilters {

    public static List<Stock> filter(List<Stock> list, Predicate<Stock> p) {
        List<Stock> filteredData = new ArrayList<>();

        for (Stock stock : list) {

            if (p.test(stock))
                filteredData.add(stock);
        }

        return filteredData;
    }

}