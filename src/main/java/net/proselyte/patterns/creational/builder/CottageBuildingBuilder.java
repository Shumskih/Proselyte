package main.java.net.proselyte.patterns.creational.builder;

public class CottageBuildingBuilder extends BuildingBuilder {
    @Override
    void buildType() {
        building.setType("Cottage");
    }

    @Override
    void buildNumberOfFloors() {
        building.setNumberOfFloors(Floors.ONE);
    }

    @Override
    void buildPrice() {
        building.setPrice(1_000_000);
    }
}
