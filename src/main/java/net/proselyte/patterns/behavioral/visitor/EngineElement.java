package main.java.net.proselyte.patterns.behavioral.visitor;

public class EngineElement implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
