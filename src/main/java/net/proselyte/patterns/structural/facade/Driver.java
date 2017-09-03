package main.java.net.proselyte.patterns.structural.facade;

public class Driver {
    public void driving(GasolineTank gasolineTank) {
        if(gasolineTank.isFull()) {
            System.out.println("Driver driving");
        } else {
            System.out.println("Driver is trying to find gasoline");
        }
    }
}
