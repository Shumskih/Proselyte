package main.java.net.proselyte.patterns.behavioral.state;

public class ChildDay {
    public static void main(String[] args) {
        Activity activity = new Sleeping();
        Child child = new Child();

        child.setActivity(activity);

        for (int i = 0; i < 10; i++) {
            child.justDoIt();
            child.changeActivity();
        }
    }
}
