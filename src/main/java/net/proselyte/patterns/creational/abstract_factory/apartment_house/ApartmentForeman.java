package main.java.net.proselyte.patterns.creational.abstract_factory.apartment_house;

import main.java.net.proselyte.patterns.creational.abstract_factory.Foreman;

public class ApartmentForeman implements Foreman {
    @Override
    public void manageTheConstruction() {
        System.out.println("Foreman manages the construction of apartment house");
    }
}
