package main.java.net.proselyte.patterns.structural.bridge;

public class Sedan extends Car {
    public Sedan(Make m) {
        super(m);
    }

    @Override
    void showType() {
        System.out.println("Type: sedan");
    }
}
