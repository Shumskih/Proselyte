package main.java.net.proselyte.patterns.creational.abstract_factory;

import main.java.net.proselyte.patterns.creational.abstract_factory.apartment_house.ApartmentHouseTeamFactory;

public class NineStoryBuilding {
    public static void main(String[] args) {
        BuildingTeamFactory buildingTeamFactory = new ApartmentHouseTeamFactory();
        Builder builder = buildingTeamFactory.getBuilder();
        Supplier supplier = buildingTeamFactory.getSupplier();
        Foreman foreman = buildingTeamFactory.getForeman();

        System.out.println("Constructing a building...");
        builder.buildABuilding();
        supplier.supplies();
        foreman.manageTheConstruction();
    }
}
