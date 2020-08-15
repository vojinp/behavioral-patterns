package com.company.interpreter;

public class Interpreter {

    public static void main(String[] args) {
        Expression lion = new TerminalExpression("lion");

        System.out.println(lion.interpreter("lion"));

        Expression tiger = new TerminalExpression("tiger");
        Expression lionOrTiger = new OrExpression(lion, tiger);

        System.out.println(lionOrTiger.interpreter("tiger"));
    }
}
