package com.company.template;

public abstract class FlyingObject {
    public void fly() {
        turnOnEngine();
        takeOff();
    }

    protected abstract void takeOff();

    protected abstract void turnOnEngine();
}
