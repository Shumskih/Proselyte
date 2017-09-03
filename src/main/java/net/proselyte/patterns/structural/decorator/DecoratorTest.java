package main.java.net.proselyte.patterns.structural.decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        PrinterInterface printer = new QuotesDecorator(new LeftBracketDecorator(new RightBracketDecorator(new Printer("Привет"))));
        printer.print();
    }
}
