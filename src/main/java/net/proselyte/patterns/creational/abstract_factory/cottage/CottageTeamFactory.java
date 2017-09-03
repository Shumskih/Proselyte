package main.java.net.proselyte.patterns.creational.abstract_factory.cottage;

import main.java.net.proselyte.patterns.creational.abstract_factory.Builder;
import main.java.net.proselyte.patterns.creational.abstract_factory.BuildingTeamFactory;
import main.java.net.proselyte.patterns.creational.abstract_factory.Foreman;
import main.java.net.proselyte.patterns.creational.abstract_factory.Supplier;

public class CottageTeamFactory implements BuildingTeamFactory {
    public Builder getBuilder() {
        return new TajikistanBuilder();
    }

    public Supplier getSupplier() {
        return new BuildingMaterialsSupplier();
    }

    public Foreman getForeman() {
        return new CottageForeman();
    }
}
