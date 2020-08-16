package com.company.visitor;

public class Foo implements Element {

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
