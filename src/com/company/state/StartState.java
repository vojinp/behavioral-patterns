package com.company.state;

public class StartState extends State {

    public StartState(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public void handle() {
        System.out.println("Starting the vehicle.");
        this.vehicle.setState(this.vehicle.getStopState());
    }
}
