package main.java.net.proselyte.patterns.behavioral.state;

public class Child {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity() {
        if (activity instanceof Sleeping) {
            setActivity(new Breakfast());
        }
        else if (activity instanceof Breakfast) {
            setActivity(new Kindergarten());
        }
        else if (activity instanceof Kindergarten) {
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
