package com.codecafe.java8.functionalprogramming.designpatterns.builder;

import java.util.function.Consumer;

// This class will have all the steps to create a Mobile
public class MobileBuilder {

    int ram, storage;
    int battery;
    int camera;
    String processor;
    double screenSize;

    public MobileBuilder with(Consumer<MobileBuilder> buildFields) {
        buildFields.accept(this);
        return this;
    }

    public Mobile createMobile() {
        return new Mobile(this);
    }
}