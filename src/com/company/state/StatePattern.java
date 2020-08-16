package com.company.state;

public class StatePattern {
  public static void main(String[] args) {
    Vehicle vehicle = new Vehicle();

    vehicle.getState().handle();
    vehicle.getState().handle();
  }

}
