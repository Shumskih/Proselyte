package main.java.net.proselyte.patterns.structural.flyweight;

public class Point implements Shape {
    @Override
    public void draw(int x, int y) {
        System.out.println("("+ x +", " + y + "): drawing point.");
    }
}
