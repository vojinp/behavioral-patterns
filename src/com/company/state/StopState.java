package com.company.state;

public class StopState extends State {

    public StopState(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    void handle() {
        System.out.println("Stoping the vehicle");
        this.vehicle.setState(this.vehicle.getStartState());
    }
}
