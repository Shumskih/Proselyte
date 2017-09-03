package main.java.net.proselyte.patterns.creational.factory_method;

public class Cheeseburger implements Burger{
    public void bake() {
        System.out.println("Baking ingredients for Cheeseburger");
    }

    public void prepare() {
        System.out.println("Preparing Cheeseburger");
    }

    public void box() {
        System.out.println("Boxing prepared Cheeseburger");
    }
}
