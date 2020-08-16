package com.company.visitor;

public class UpVisitor implements Visitor {

    @Override
    public void visit(Foo foo) {
        System.out.println("Visiting foo");
    }

    @Override
    public void visit(Bar foo) {
        System.out.println("Visiting bar");
    }
}
