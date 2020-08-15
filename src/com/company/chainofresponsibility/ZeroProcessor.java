package com.company.chainofresponsibility;

public class ZeroProcessor extends Processor {

    public ZeroProcessor(Processor processor) {
        super(processor);
    }

    @Override
    public void process(int num) {
        if (num == 0) {
            System.out.println("Zero processor processing: " + num);
        } else {
            super.process(num);
        }
    }
}
