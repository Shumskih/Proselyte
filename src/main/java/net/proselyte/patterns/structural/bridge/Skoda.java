package main.java.net.proselyte.patterns.structural.bridge;

public class Skoda implements Make {
    @Override
    public void setMake() {
        System.out.println("Make: Skoda");
    }
}
