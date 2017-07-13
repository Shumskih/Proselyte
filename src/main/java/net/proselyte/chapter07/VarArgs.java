package main.java.net.proselyte.chapter07;

// Демонстрация применения аргументов переменной длины
class VarArgs {
    // Здесь метод vaTest() объявляется с аргументами переменной длины
    static void vaTest(int ... v) {
        System.out.print("Количество аргументов: " + v.length + " Содержимое: ");

        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main (String args[]) {
        // Обратить внимание на возможные спосоьы вызова метода vaTest() с вргументами переменной длины
        vaTest(10);
        vaTest(1, 2, 3);
        vaTest();
    }
}
