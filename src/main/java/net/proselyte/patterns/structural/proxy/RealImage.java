package main.java.net.proselyte.patterns.structural.proxy;

public class RealImage implements Image {
    String file;

    public RealImage(String file) {
        this.file = file;
        load();
    }

    public void load() {
        System.out.println("Загрузка " + file);
    }

    @Override
    public void display() {
        System.out.println("Просмотр " + file);
    }
}
