package main.java.net.proselyte.patterns.structural.bridge;

public class Kia implements Make {
    @Override
    public void setMake() {
        System.out.println("Make: Kia");
    }
}
