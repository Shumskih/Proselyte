package main.java.net.proselyte.patterns.structural.decorator;

public class LeftBracketDecorator extends Decorator {
    public LeftBracketDecorator(PrinterInterface component) {
        super(component);
    }

    @Override
    public void print() {
        System.out.print("[");
        component.print();
    }
}
