package com.codecafe.java8.functionalprogramming.designpatterns.builder;

/*
 * Builder pattern is all about providing flexibility in object creation.
 * The intent of this pattern is to isolate the construction of a complex object
 * from its representation.
 */
public class BuilderPatternDemo {

    public static void main(String[] args) {

        MobileBuilder builder = new MobileBuilder();
        Mobile iPhone = builder.with(myBuilder -> {
            myBuilder.ram = 4;
            myBuilder.battery = 4000;
            myBuilder.processor = "A12 Bionic";
        }).createMobile();

        System.out.println(iPhone);

        Mobile oneplus8 = builder.with(myBuilder -> {
            myBuilder.ram = 12;
            myBuilder.battery = 4000;
            myBuilder.processor = "Snapdragon 865";
            myBuilder.screenSize = 6.7;
            myBuilder.camera = 48;
        }).createMobile();

        System.out.println(oneplus8);
    }

}