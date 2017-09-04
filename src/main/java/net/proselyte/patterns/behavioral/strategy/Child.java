package main.java.net.proselyte.patterns.behavioral.strategy;

public class Child {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void executeActivity() {
        activity.justDoIt();
    }
}
