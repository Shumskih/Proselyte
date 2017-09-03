package main.java.net.proselyte.patterns.creational.builder;

public abstract class BuildingBuilder {
    Building building;

    void constructBuilding() {
        building = new Building();
    }

    abstract void buildType();
    abstract void buildNumberOfFloors();
    abstract void buildPrice();

    Building getBuilding() {
        return building;
    }


}
