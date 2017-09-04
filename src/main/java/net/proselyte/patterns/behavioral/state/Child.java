package main.java.net.proselyte.patterns.behavioral.state;

import main.java.net.proselyte.patterns.structural.bridge.Hatchback;

public class Child {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity() {
        if (activity instanceof Sleeping) {
            setActivity(new HavingABreakfast());
        }
        else if (activity instanceof HavingABreakfast) {
            setActivity(new GoingToKindergarten());
        }
        else if (activity instanceof GoingToKindergarten) {
            setActivity(new Playing());
        }
        else if (activity instanceof Playing) {
            setActivity(new Sleeping());
        }
    }

    public void justDoIt() {
        activity.justDoIt();
    }
}
