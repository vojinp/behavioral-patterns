package com.company.memento;

import java.util.Stack;

public class CareTaker {
    private Stack<Memento> mementos = new Stack<>();

    public void add(Memento memento) {
        mementos.push(memento);
    }

    public Memento get() {
        return mementos.pop();
    }
}
