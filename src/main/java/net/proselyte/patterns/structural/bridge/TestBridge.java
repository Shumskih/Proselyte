package main.java.net.proselyte.patterns.structural.bridge;

public class TestBridge {
    public static void main(String[] args) {
        Car car = new Hatchback(new Skoda());
        car.showDetails();
    }
}
