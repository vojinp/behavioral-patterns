package com.company.chainofresponsibility;

public class NegativeProcessor extends Processor {

    public NegativeProcessor(Processor processor) {
        super(processor);
    }

    @Override
    public void process(int num) {
        if (num < 0) {
            System.out.println("Negative processor processing: " + num);
        } else {
            super.process(num);
        }
    }
}
