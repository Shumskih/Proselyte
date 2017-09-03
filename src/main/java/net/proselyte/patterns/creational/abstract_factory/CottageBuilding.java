package main.java.net.proselyte.patterns.creational.abstract_factory;

import main.java.net.proselyte.patterns.creational.abstract_factory.cottage.CottageTeamFactory;

public class CottageBuilding {
    public static void main(String[] args) {
        BuildingTeamFactory buildingTeamFactory = new CottageTeamFactory();
        Builder builder = buildingTeamFactory.getBuilder();
        Supplier supplier = buildingTeamFactory.getSupplier();
        Foreman foreman = buildingTeamFactory.getForeman();

        System.out.println("Constructing a building...");
        builder.buildABuilding();
        supplier.supplies();
        foreman.manageTheConstruction();
    }
}
