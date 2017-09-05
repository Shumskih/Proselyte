package main.java.net.proselyte.patterns.behavioral.visitor;

public class MechanicVisitor implements Visitor {
    @Override
    public void visit(EngineElement engine) {
        System.out.println("Have checked engine ");
    }

    @Override
    public void visit(CarElement car) {
        System.out.println("Have checked the appearance of a car");
    }

    @Override
    public void visit(WheelElement wheel) {
        System.out.println("Have pumped " + wheel.getName() + " wheel");
    }

    @Override
    public void visit(BodyElement body) {
        System.out.println("Have polished a body");
    }
}
