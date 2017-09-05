package main.java.net.proselyte.patterns.behavioral.visitor;

public class CarElement implements Element {
    Element[] elements;

    public CarElement() {
        this.elements = new Element[] {
                new WheelElement("front left"),
                new WheelElement("front right"),
                new WheelElement("back left"),
                new WheelElement("back right"),
                new BodyElement(),
                new EngineElement()
        };
    }

    @Override
    public void accept(Visitor visitor) {
        for(Element elem : elements) {
            elem.accept(visitor);
        }
        visitor.visit(this);
    }
}
