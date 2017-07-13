package main.java.net.proselyte.chapter09.Interfaces;

class Client implements Callback {
    // Реализовываем интерфейс Callback
    public void callBack(int p) {
        System.out.println("Метод callback(), вызываемый со значением " + p);
    }

    void nonIfaceMeth() {
        System.out.println("В классах, реализующих интерфейсы, " + "могут определяться и другие члены");
    }
}
