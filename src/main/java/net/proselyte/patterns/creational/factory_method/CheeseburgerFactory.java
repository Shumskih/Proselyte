package main.java.net.proselyte.patterns.creational.factory_method;

public class CheeseburgerFactory implements BurgerFactory {
    @Override
    public Burger createBurger() {
        return new Cheeseburger();
    }
}
