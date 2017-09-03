package main.java.net.proselyte.patterns.creational.factory_method;

public class BigMac implements Burger {
    public void bake() {
        System.out.println("Baking ingredients for BigMac");
    }

    public void prepare() {
        System.out.println("Preparing BigMac");
    }

    public void box() {
        System.out.println("Boxing prepared BigMac");
    }
}
