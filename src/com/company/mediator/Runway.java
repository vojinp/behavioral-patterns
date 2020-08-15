package com.company.mediator;

public class Runway implements Command {
    ATCMediator mediator;

    public Runway(ATCMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void land() {
        System.out.println("Landing permission granted.");
        mediator.setLandingStatus(true);
    }
}
