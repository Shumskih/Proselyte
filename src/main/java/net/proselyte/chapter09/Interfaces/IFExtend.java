package main.java.net.proselyte.chapter09.Interfaces;

// Один интурфейс может расширять другой
interface A1 {
    void meth1();
    void meth2();
}

// Теперь интерфейс B включает в себя методы meth1() и meth2() и добаляет метод meth3()
interface B1 extends A1 {
    void meth3();
}

// Этот класс должен реализовать все методы из интерфейсов A и B
class MyClass implements B1 {
    public void meth1() {
        System.out.println("Реализация метода meth1()");
    }

    public void meth2() {
        System.out.println("Реализация метода meth2()");
    }

    public void meth3() {
        System.out.println("Реализация метода meth3()");
    }
}

class IFExtend {
    public static void main (String args[]) {
        MyClass ob = new MyClass();

        ob.meth1();
        ob.meth2();
        ob.meth3();
    }
}

