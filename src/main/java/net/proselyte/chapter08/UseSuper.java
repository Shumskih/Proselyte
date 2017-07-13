package main.java.net.proselyte.chapter08;

// Использование ключевого слова super с целью предотвратить сокрытие имён
class A3 {
    int i;
}

class B3 extends A3 {
    int i; // этот член i скрывает член i из класса А

    B3(int a, int b) {
        super.i = a; // член i из класса А
        i = b;       // член i из класса В
    }

    void show() {
        System.out.println("Член i из суперкласса: " + super.i);
        System.out.println("Член i из подкласса: " + i);
    }
}
class UseSuper {
    public static void main (String args[]) {
        B3 subObj = new B3(1, 2);

        subObj.show();
    }
}
