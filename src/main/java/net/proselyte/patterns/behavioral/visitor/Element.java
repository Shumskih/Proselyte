package main.java.net.proselyte.patterns.behavioral.visitor;

public interface Element {
    void accept(Visitor visitor);
}
