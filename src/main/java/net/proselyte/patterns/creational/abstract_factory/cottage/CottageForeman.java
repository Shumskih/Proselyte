package main.java.net.proselyte.patterns.creational.abstract_factory.cottage;

import main.java.net.proselyte.patterns.creational.abstract_factory.Foreman;

public class CottageForeman implements Foreman{
    public void manageTheConstruction() {
        System.out.println("Foreman Manages the construction of cottage");
    }
}
