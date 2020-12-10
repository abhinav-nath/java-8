package com.codecafe.java8.functionalprogramming.compostion;

public class CompositionDemo {

    public static void main(String[] args) {

        Function<Square, Integer> fun1 = s -> s.getArea();
        Function<Integer, Double> fun2 = area -> Math.sqrt(area);

        Function<Square, Double> getSide = fun2.compose(fun1);

        Square square = new Square();
        square.setArea(100);

        Double side = getSide.apply(square);

        System.out.println(side);
    }

}