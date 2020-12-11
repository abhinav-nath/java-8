package com.codecafe.java8.functionalprogramming.designpatterns.decorator;

/*
 * The Decorator design pattern is used to modify functionality of object at runtime
 * without affecting other instances of the same class.
 */
public class DecoratorPatternDemo {

    public static void main(String[] args) {

        Burger veggieCheeseBurger = new BurgerShop(burger -> burger.addCheese())
                .use(new BurgerShop(burger -> burger.addVeggies()).use(new Burger()));

        System.out.println("I get :" + veggieCheeseBurger);
    }

}