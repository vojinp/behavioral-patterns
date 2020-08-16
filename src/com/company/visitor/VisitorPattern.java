package com.company.visitor;

public class VisitorPattern {
    public static void main(String[] args) {
      Element foo = new Foo();
      Element bar = new Bar();

      UpVisitor upVisitor = new UpVisitor();

      foo.accept(upVisitor);
      bar.accept(upVisitor);
    }
}
