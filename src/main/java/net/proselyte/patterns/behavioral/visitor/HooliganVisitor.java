package main.java.net.proselyte.patterns.behavioral.visitor;

public class HooliganVisitor implements Visitor {
    @Override
    public void visit(EngineElement engine) {
        System.out.println("Have started engine");
    }

    @Override
    public void visit(BodyElement body) {
        System.out.println("Knock on the body");
    }

    @Override
    public void visit(CarElement car) {
        System.out.println("Have smoked inside a car");
    }

    @Override
    public void visit(WheelElement wheel) {
        System.out.println("Have kicked " + wheel.getName() + " wheel");
    }
}
