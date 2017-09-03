package main.java.net.proselyte.patterns.structural.decorator;

abstract class Decorator implements PrinterInterface {
    PrinterInterface component;

    public Decorator (PrinterInterface component) {
        this.component = component;
    }
}
