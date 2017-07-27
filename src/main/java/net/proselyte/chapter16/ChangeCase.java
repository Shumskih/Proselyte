package main.java.net.proselyte.chapter16;

// Применение методов toLowerCase() и toUpperCase()
class ChangeCase {
    public static void main (String args[]) {

        String s = "Это тест";
        System.out.println("Исходная строка: " + s);
        String upper = s.toUpperCase();
        String lower = s.toLowerCase();
        System.out.println("Верхний регистр: " + upper);
        System.out.println("Нижний регистр: " + lower);

    }
}
