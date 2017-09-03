package main.java.net.proselyte.patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FlyweightTest {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        List<Shape> shapes = new ArrayList<>();

        shapes.add(shapeFactory.getShape("square"));
        shapes.add(shapeFactory.getShape("circle"));
        shapes.add(shapeFactory.getShape("circle"));
        shapes.add(shapeFactory.getShape("point"));
        shapes.add(shapeFactory.getShape("square"));
        shapes.add(shapeFactory.getShape("circle"));

        Random rand = new Random();
        for (Shape shape : shapes) {
            int x = rand.nextInt(100);
            int y = rand.nextInt(100);
            shape.draw(x, y);
        }
    }
}
