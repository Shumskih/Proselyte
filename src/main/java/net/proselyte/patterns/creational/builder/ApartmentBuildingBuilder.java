package main.java.net.proselyte.patterns.creational.builder;

public class ApartmentBuildingBuilder extends BuildingBuilder {
    @Override
    void buildType() {
        building.setType("Apartment building");
    }

    @Override
    void buildNumberOfFloors() {
        building.setNumberOfFloors(Floors.FIVE);
    }

    @Override
    void buildPrice() {
        building.setPrice(125_000_000);
    }
}
