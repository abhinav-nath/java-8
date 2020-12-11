package com.codecafe.java8.functionalprogramming.designpatterns.decorator;

import java.util.function.Function;

// it will do the job of adding the decoration
public class BurgerShop {

    Function<Burger, Burger> decoration;

    public BurgerShop(Function<Burger, Burger> decoration) {
        this.decoration = decoration;
    }

    public Burger use(Burger baseBurger) {
        System.out.println("base burger :" + baseBurger);
        return decoration.apply(baseBurger);
    }

}