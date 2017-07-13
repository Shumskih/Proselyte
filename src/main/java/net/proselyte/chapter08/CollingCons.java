package main.java.net.proselyte.chapter08;

// Демонстрация порядка вызова конструкторов

// Создаём суперкласс
class A4 {
    A4() {
        System.out.println("Внутри конструктора А");
    }
}

class B4 extends A4 {
    B4() {
        System.out.println("Внутри конструктора B");
    }
}

class C4 extends B4 {
    C4() {
        System.out.println("Внутри конструктора С");
    }
}

class CollingCons {
    public static void main (String args[]) {
        C4 c = new C4();
    }
}
