package main.java.net.proselyte.patterns.creational.abstract_factory.apartment_house;

import main.java.net.proselyte.patterns.creational.abstract_factory.Builder;

public class ProfessionalBuilder implements Builder {
    @Override
    public void buildABuilding() {
        System.out.println("Professional builder construct an apartment house");
    }
}
