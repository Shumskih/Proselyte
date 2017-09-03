package main.java.net.proselyte.patterns.structural.decorator;

import com.sun.org.apache.xpath.internal.operations.Quo;

public class QuotesDecorator extends Decorator {
    public QuotesDecorator (PrinterInterface component) {
        super(component);
    }

    @Override
    public void print() {
        System.out.print("\"");
        component.print();
        System.out.print("\"");
    }
}
