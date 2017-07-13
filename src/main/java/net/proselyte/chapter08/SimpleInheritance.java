package main.java.net.proselyte.chapter08;

// Простой пример наследования

// Создаём суперкласс
class A {
    int i, j;

    void showij() {
        System.out.println("i и j: " + i + " " + j + ";");
    }
}

// Создаём подкласс путём расширения класса A
class B extends A {
    int k;

    void showk() {
        System.out.println("k: " + k + ";");
    }

    void sum() {
        System.out.println("i + j + k: " + (i+j+k));
    }
}
class SimpleInheritance {
    public static void main (String args[]) {
        A superObj = new A();
        B subObj = new B();

        // Суперкласс может использоваться самостоятельно
        superObj.i = 10;
        superObj.j = 20;
        System.out.println("Содержимое объекта superObj: ");
        superObj.showij();
        System.out.println();

        // Подкласс имеет доступ ко всем открытым членам своего класса
        subObj.i = 7;
        subObj.j = 8;
        subObj.k = 9;
        System.out.println("Содержимое объекта subObj: ");
        subObj.showij();
        subObj.showk();

        System.out.println();

        System.out.println("Сумма i, j и k в объекте subObj: ");
        subObj.sum();
    }
}