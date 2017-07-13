package main.java.net.proselyte.chapter09.Interfaces;

// Ещё одна реализация интерфейса Callback
class AnotherClient implements Callback{
    // Реализовавыем интерфейс callBack
    public void callBack(int p) {
        System.out.println("Ещё один вариант метода callBack()");
        System.out.println("p в квадрате равно " + p);
    }
}
