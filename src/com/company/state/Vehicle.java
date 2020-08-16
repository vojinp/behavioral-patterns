package com.company.state;

public class Vehicle {
  private State state;
  private StartState startState;
  private StopState stopState;

  public Vehicle() {
    this.startState = new StartState(this);
    this.stopState = new StopState(this);
    this.state = startState;

  }

  public StartState getStartState() {
    return startState;
  }

  public StopState getStopState() {
    return stopState;
  }

  public State getState() {
    return state;
  }

  public void setState(State state) {
    this.state = state;
  }
}
