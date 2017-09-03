package main.java.net.proselyte.patterns.behavioral.memento;

import com.sun.org.apache.xpath.internal.SourceTree;

public class MementoRunner {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State 1");
        originator.setState("State 2");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State 3");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State 4");
        System.out.println("Current State: " + originator.getState());

        originator.gerStateFromMemento(careTaker.get(0));
        System.out.println("First saved state: " + originator.getState());
        originator.gerStateFromMemento(careTaker.get(1));
        System.out.println("Second saved state:" + originator.getState());
    }
}
