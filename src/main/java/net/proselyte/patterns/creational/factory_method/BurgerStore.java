package main.java.net.proselyte.patterns.creational.factory_method;

public class BurgerStore {
    public static void main(String[] args) {
        BurgerFactory factory = createBurgerBySpecialty("BigMac");
        Burger burger = factory.createBurger();

        burger.bake();
        burger.prepare();
        burger.box();
    }

    static BurgerFactory createBurgerBySpecialty(String sortOfBurger) {
        if(sortOfBurger.equalsIgnoreCase("bigmac")) {
            return new BigMacFactory();
        }
        else if (sortOfBurger.equalsIgnoreCase("cheeseburger")) {
            return new CheeseburgerFactory();
        }
        else {
            throw new RuntimeException(sortOfBurger + "not found");
        }
    }
}
