package com.company.chainofresponsibility;

public class ChainOfResponsibility {
    public static void main(String[] args) {
        Processor numProcessor =
                new PositiveProcessor(new ZeroProcessor(new NegativeProcessor(null)));

        numProcessor.process(1);
        numProcessor.process(2);
        numProcessor.process(0);
        numProcessor.process(-4);
        numProcessor.process(-5);
    }
}
