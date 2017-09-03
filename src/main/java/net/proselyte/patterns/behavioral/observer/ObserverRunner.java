package main.java.net.proselyte.patterns.behavioral.observer;

public class ObserverRunner {
    public static void main(String[] args) {
        MeteoStation station = new MeteoStation();

        station.addObserver(new ConsoleObserver());
        station.setMeasurements(25, 760);
    }
}
