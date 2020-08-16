package com.company.template;

public class Helicopter extends FlyingObject {

    @Override
    protected void takeOff() {
        System.out.println("Helicopter taking off.");
    }

    @Override
    protected void turnOnEngine() {
        System.out.println("Helicopter turning on the engine.");
    }
}
