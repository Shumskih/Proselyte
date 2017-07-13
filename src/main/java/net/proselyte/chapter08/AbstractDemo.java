package main.java.net.proselyte.chapter08;

// Простой пример абстракции
abstract class A8 {
    abstract void callMe();

    // Абстрактные классы всё же могут содержать конкретные методы
    void callMeToo() {
        System.out.println("Это конкретный метод в абстрактном классе А");
    }
}

class B8 extends A8 {
    void callMe() {
        System.out.println("Реализация метода callMe() в классе B");
    }
}
class AbstractDemo {
    public static void main (String args[]) {
        B8 b = new B8();

        b.callMe();
        b.callMeToo();
    }
}
