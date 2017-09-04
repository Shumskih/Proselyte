package main.java.net.proselyte.patterns.behavioral.templatemethod;

public class NewsPage extends WebsiteTemplate {
    @Override
    public void showPageContent() {
        System.out.println("News content");
    }
}
