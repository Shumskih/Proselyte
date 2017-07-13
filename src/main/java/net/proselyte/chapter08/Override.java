package main.java.net.proselyte.chapter08;

// Переопределение метода
class A5 {
    int i, j;

    A5(int a, int b) {
        i = a;
        j = b;
    }

    // Вывести содержимое переменных i и j
    void show() {
        System.out.println("i и j: " + i + " " + j + ";");
    }
}

class B5 extends A5 {
    int k;

    B5(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // Вывести содержимое k с помощью метода, переопределяющего метод show() из класса А
    void show() {
        super.show(); // Вызывается методл show() из класса А
        System.out.println("k = " + k);
    }
}

class Override {
    public static void main (String args[]) {
        B5 subObj = new B5(1, 2, 3);

        subObj.show();
    }
}
