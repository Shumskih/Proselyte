package main.java.net.proselyte.patterns.structural.facade;

public class Facade {
    Driver driver = new Driver();
    Car car = new Car();
    GasolineTank gasolineTank = new GasolineTank();

    public void doProcess() {
        car.startCar();
        gasolineTank.fill();
        driver.driving(gasolineTank);
    }
}
