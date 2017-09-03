package main.java.net.proselyte.patterns.creational.builder;

public class BuildBuildingRunner {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new ApartmentBuildingBuilder());
        Building building = director.buildBuilding();

        System.out.println(building);
    }
}
