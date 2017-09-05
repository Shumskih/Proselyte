package main.java.net.proselyte.patterns.behavioral.visitor;

public class VisitorRunner {
    public static void main(String[] args) {
        Element car = new CarElement();
        car.accept(new HooliganVisitor());
        System.out.println();
        car.accept(new MechanicVisitor());
    }
}
