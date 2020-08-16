package com.company.memento;

public class MementoPattern {
  public static void main(String[] args) {

    Originator originator = new Originator();
    CareTaker careTaker = new CareTaker();

    originator.setState("State #1");
    originator.setState("State #2");
    careTaker.add(originator.save());

    originator.setState("State #3");
    careTaker.add(originator.save());

    originator.setState("State #4");
    System.out.println("Current State: " + originator.getState());

    originator.restore(careTaker.get());
    System.out.println("First saved State: " + originator.getState());
    originator.restore(careTaker.get());
    System.out.println("Second saved State: " + originator.getState());
  }
}
