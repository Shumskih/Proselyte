package main.java.net.proselyte.patterns.behavioral.observer;

public interface Observed {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
