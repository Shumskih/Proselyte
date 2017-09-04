package main.java.net.proselyte.patterns.behavioral.strategy;

public class ChildRunner {
    public static void main(String[] args) {
        Child child = new Child();

        child.setActivity(new Sleeping());
        child.executeActivity();

        child.setActivity(new Breakfast());
        child.executeActivity();

        child.setActivity(new Kindergarten());
        child.executeActivity();

        child.setActivity(new Playing());
        child.executeActivity();

        child.setActivity(new Sleeping());
        child.executeActivity();
    }
}
