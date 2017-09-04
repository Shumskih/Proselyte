package main.java.net.proselyte.patterns.behavioral.templatemethod;

public class WelcomePage extends WebsiteTemplate {
    @Override
    public void showPageContent() {
        System.out.println("Welcome");
    }
}
