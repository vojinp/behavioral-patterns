package com.company.chainofresponsibility;

public abstract class Processor {
    private Processor processor;

    public Processor(Processor processor) {
        this.processor = processor;
    }

    public void process(int num) {
        if (processor != null) {
            processor.process(num);
        }
    }
}
