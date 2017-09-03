package main.java.net.proselyte.patterns.behavioral.command;

// Receiver
public class Comp {
    void start() {
        System.out.println("Start");
    }

    void stop() {
        System.out.println("Stop");
    }

    void reset() {
        System.out.println("Reset");
    }
}
