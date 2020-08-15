package com.company.mediator;

public class Flight implements Command {
    private ATCMediator mediator;

    public Flight(ATCMediator mediator) {
        this.mediator = mediator;
    }

    public void land() {
        if (mediator.isLandingOk()) {
            System.out.println("Successfully landed.");
            mediator.setLandingStatus(true);
        } else {
            System.out.println("Waiting for landing");
        }
    }

    public void getReady() {
        System.out.println("Ready for landing.");
    }
}
