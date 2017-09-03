package main.java.net.proselyte.patterns.creational.abstract_factory.cottage;

import main.java.net.proselyte.patterns.creational.abstract_factory.Supplier;

public class BuildingMaterialsSupplier implements Supplier{
    public void supplies() {
        System.out.println("Supplier supplies construction materials for cottage");
    }
}
