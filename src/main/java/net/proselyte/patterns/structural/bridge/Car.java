package main.java.net.proselyte.patterns.structural.bridge;

public abstract class Car {
    Make make;

    public Car(Make m) {
        this.make = m;
    }

    abstract void showType();
    void showDetails() {
        showType();
        make.setMake();
    };
}
