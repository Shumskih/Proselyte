package main.java.net.proselyte.patterns.behavioral.strategy;

public class ChildRunner {
    public static void main(String[] args) {
        Child child = new Child();

        child.setActivity(new Sleeping());
        child.executeActivity();

        child.setActivity(new HavingABreakfast());
        child.executeActivity();

        child.setActivity(new GoingToKindergarten());
        child.executeActivity();

        child.setActivity(new Playing());
        child.executeActivity();

        child.setActivity(new Sleeping());
        child.executeActivity();
    }
}
