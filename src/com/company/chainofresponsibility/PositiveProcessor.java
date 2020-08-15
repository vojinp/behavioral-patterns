package com.company.chainofresponsibility;

public class PositiveProcessor extends Processor {

    public PositiveProcessor(Processor processor) {
        super(processor);
    }

    @Override
    public void process(int num) {
        if (num > 0) {
            System.out.println("Positive processor processing: " + num);
        } else {
            super.process(num);
        }
    }
}
