package main.java.net.proselyte.patterns.structural.flyweight;

public class Circle implements Shape {
    @Override
    public void draw(int x, int y) {
        int r = 5;
        System.out.println("(" + x + ", " + y + "): drawing circle with radius " + r);
    }
}
