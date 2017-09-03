package main.java.net.proselyte.patterns.creational.abstract_factory.apartment_house;

import main.java.net.proselyte.patterns.creational.abstract_factory.Supplier;

public class BuildingMaterialsSupplier implements Supplier {
    @Override
    public void supplies() {
        System.out.println("Supplier supplies construction materials for apartment house");
    }
}
