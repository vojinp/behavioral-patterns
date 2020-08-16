package com.company.template;

public class TemplateMethodPattern {
  public static void main(String[] args) {
    FlyingObject flyingObject = new Helicopter();

    flyingObject.fly();
  }
}
