package main.java.net.proselyte.chapter08;

// Методы с отличающимися сигнатурами считаются перегружаемыми, а не переопределяемыми
class A6 {
    int i, j;

    A6(int a, int b) {
        i = a;
        j = b;
    }

    // Вывести содержимое переменных i и j
    void show() {
        System.out.println("i и j: " + i + " и " + j + ";");
    }
}

// Создаём подкласс путём расширения класса А
class B6 extends A6 {
    int k;

    B6(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // Перегрузить метод show()
    void show(String msg) {
        System.out.println(msg + k);
    }
}

class Override2 {
    public static void main (String args[]) {
        B6 subObj = new B6(1, 2, 3);

        subObj.show("Это k: ");
        subObj.show();
    }
}
