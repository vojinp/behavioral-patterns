package com.company.visitor;

public interface Visitor {
    void visit(Foo foo);

    void visit(Bar foo);
}
