package main.java.net.proselyte.patterns.creational.builder;

public class Director {
    BuildingBuilder builder;

    public void setBuilder(BuildingBuilder builder) {
        this.builder = builder;
    }

    Building buildBuilding() {
        builder.constructBuilding();
        builder.buildType();
        builder.buildNumberOfFloors();
        builder.buildPrice();

        Building building = builder.getBuilding();

        return building;
    }


}
