package main.java.net.proselyte.patterns.behavioral.strategy;

public class Sleeping implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Sleeping after play.");
    }
}
