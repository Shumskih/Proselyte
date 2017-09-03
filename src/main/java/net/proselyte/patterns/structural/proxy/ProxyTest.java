package main.java.net.proselyte.patterns.structural.proxy;

public class ProxyTest {
    public static void main(String[] args) {
        Image image = new ProxyImage("D:/myimages/1.jpg");
        image.display();
    }
}
