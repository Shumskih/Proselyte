package main.java.net.proselyte.patterns.structural.flyweight;

public class Square implements Shape {
    @Override
    public void draw(int x, int y) {
        int a = 10;
        System.out.println("(" + x + ", " + y + "): drawing square with side " + a);
    }
}
