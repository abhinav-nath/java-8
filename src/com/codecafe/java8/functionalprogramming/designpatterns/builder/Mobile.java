package com.codecafe.java8.functionalprogramming.designpatterns.builder;

// All the fields are final in order to make 
// this class immutable.
// In order to create an object of this class,
// we will need to pass all the attributes to the constructor
// and if we need a Mobile with more or less fields then
// we need to create another constructor with those fields.
// This is a problem.
public class Mobile {

    final int ram;
    final int storage;
    final int battery;
    final int camera;
    final String processor;
    final double screenSize;

    public Mobile(int ram, int storage, int battery, int camera, String processor, double screenSize) {
        this.ram = ram;
        this.storage = storage;
        this.battery = battery;
        this.camera = camera;
        this.processor = processor;
        this.screenSize = screenSize;
    }

    // parameters to the constructors are reduced
    public Mobile(MobileBuilder mobileBuilder) {
        this.ram = mobileBuilder.ram;
        this.storage = mobileBuilder.storage;
        this.battery = mobileBuilder.battery;
        this.camera = mobileBuilder.camera;
        this.processor = mobileBuilder.processor;
        this.screenSize = mobileBuilder.screenSize;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public int getBattery() {
        return battery;
    }

    public int getCamera() {
        return camera;
    }

    public String getProcessor() {
        return processor;
    }

    public double getScreenSize() {
        return screenSize;
    }

    @Override
    public String toString() {
        return "Mobile [ram=" + ram + ", storage=" + storage + ", battery=" + battery + ", camera=" + camera
                + ", processor=" + processor + ", screenSize=" + screenSize + "]";
    }

}