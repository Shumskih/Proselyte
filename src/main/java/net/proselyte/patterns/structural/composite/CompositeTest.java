package main.java.net.proselyte.patterns.structural.composite;

public class CompositeTest {
    public static void main(String[] args) {
        Shape square = new Square();
        Shape triangle = new Triangle();
        Shape circle = new Circle();

        Composite composite = new Composite();

        composite.addComponent(square);
        composite.addComponent(triangle);
        composite.addComponent(circle);

        composite.draw();
    }
}
