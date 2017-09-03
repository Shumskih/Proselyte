package main.java.net.proselyte.patterns.creational.factory_method;

public class BigMacFactory implements BurgerFactory {
    @Override
    public Burger createBurger() {
        return new BigMac();
    }
}
