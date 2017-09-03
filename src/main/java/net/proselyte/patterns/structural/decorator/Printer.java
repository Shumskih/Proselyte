package main.java.net.proselyte.patterns.structural.decorator;

public class Printer implements PrinterInterface {
    String value;

    public Printer (String value) {
        this.value = value;
    }

    @Override
    public void print() {
        System.out.print(value);
    }
}
