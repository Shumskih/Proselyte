package main.java.net.proselyte.chapter04;

// Демонстрация применения тернарной операции ?
class Ternary {
    public static void main (String args[]) {
        int i, k;

        i = 10;
        k = i < 0 ? -i : i; // Получить абсолютное значение переменной i
        System.out.print("Абсолютное значение ");
        System.out.println(i + " равно " + k);

        i = -10;
        k = i < 0 ? -i : i; // Получить абсолютное значение переменной i
        System.out.print("Абсолютное значение ");
        System.out.println(i + " равно " + k);
    }
}