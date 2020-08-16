package com.company.state;

public abstract class State {
  protected Vehicle vehicle;

  public State(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  abstract void handle();
}
