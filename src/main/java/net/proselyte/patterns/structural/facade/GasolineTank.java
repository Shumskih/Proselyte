package main.java.net.proselyte.patterns.structural.facade;

public class GasolineTank {
    private boolean full;

    public boolean isFull() {
        return full;
    }

    public void fill() {
        System.out.println("Gasoline tank is full");
        full = true;
    }

    public void empty() {
        System.out.println("Gasoline tank is empty");
        full = false;
    }
}
