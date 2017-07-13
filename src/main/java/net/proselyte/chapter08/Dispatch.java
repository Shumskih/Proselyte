package main.java.net.proselyte.chapter08;

// Динамическая диспетчеризация методов
class A7 {
    void callMe() {
        System.out.println("Метод callMe() из класса А");
    }
}

class B7 extends A7 {
    // Переопределяем метод callMe()
    void callMe() {
        System.out.println("Метод callMe() из класса B");
    }
}

class C7 extends B7 {
    // Переопределяем метод callMe()
    void callMe() {
        System.out.println("Метод callMe() из класса C");
    }
}
class Dispatch {
    public static void main (String args[]) {
        A7 a = new A7(); // Объект класса А
        B7 b = new B7(); // Объект класса В
        C7 c = new C7(); // Объект класса С

        A7 r; // Получили ссылку на объект класса А

        r = a; // Ссылочная переменная r ссылается на объект типа А
        r.callMe(); // Вызываем вариант метода callMe(), определённый в классе А

        r = b; // Ссылочная переменная ссылается на объект типа В
        r.callMe(); // Вызываем вариант метода callMe(), определённый в классе B

        r = c; // Ссылочная переменная ссылается на объект класса С
        r.callMe(); // Вызываем вариант метода callMe(), определённый в классе С
    }
}
