package main.java.net.proselyte.patterns.behavioral.observer;

public class ConsoleObserver implements Observer {
    @Override
    public void handleEvent(int temp, int presser) {
        System.out.println("The weather has changed. Temperature = " + temp + ", pressure = " + presser + ".");
    }
}
