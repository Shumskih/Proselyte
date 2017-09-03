package main.java.net.proselyte.patterns.creational.abstract_factory;

public interface BuildingTeamFactory {
    Builder getBuilder();
    Supplier getSupplier();
    Foreman getForeman();
}
