package com.codecafe.java8.functionalprogramming.designpatterns.strategy.example2;

import java.util.ArrayList;
import java.util.List;

public class StrategyPatternDemo {

    public static void main(String[] args) {

        List<Stock> stockList = new ArrayList<>();

        stockList.add(new Stock("AAPL", 318.65, 10));
        stockList.add(new Stock("MSFT", 166.86, 45));
        stockList.add(new Stock("Google", 99, 12.5));
        stockList.add(new Stock("AMZ", 1866.74, 45));
        stockList.add(new Stock("GOOGL", 1480.20, 3.5));
        stockList.add(new Stock("AAPL", 318.65, 8));
        stockList.add(new Stock("AMZ", 1866.74, 9));

        System.out.println("price > 1000");
        StockFilters.filter(stockList, stock -> stock.getPrice() > 1000).forEach(System.out::println);

        System.out.println("\nunits < 10");
        StockFilters.filter(stockList, stock -> stock.getUnits() < 10).forEach(System.out::println);

        System.out.println("\nsymbol = AMZ");
        StockFilters.filter(stockList, stock -> stock.getSymbol().equals("AMZ")).forEach(System.out::println);
    }

}