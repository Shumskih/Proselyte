package main.java.net.proselyte.patterns.creational.abstract_factory.apartment_house;

import main.java.net.proselyte.patterns.creational.abstract_factory.Builder;
import main.java.net.proselyte.patterns.creational.abstract_factory.BuildingTeamFactory;
import main.java.net.proselyte.patterns.creational.abstract_factory.Foreman;
import main.java.net.proselyte.patterns.creational.abstract_factory.Supplier;

public class ApartmentHouseTeamFactory implements BuildingTeamFactory {
    @Override
    public Builder getBuilder() {
        return new ProfessionalBuilder();
    }

    @Override
    public Foreman getForeman() {
        return new ApartmentForeman();
    }

    @Override
    public Supplier getSupplier() {
        return new BuildingMaterialsSupplier();
    }
}
