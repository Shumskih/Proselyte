package main.java.net.proselyte.chapter05;

// Применение оператора break для выхода из цикла
class BreakLoop {
    public static void main (String args[]) {
        for (int i = 0; i < 100; i++) {
            if (i == 10) break;
            System.out.println("Значение i равно: " + i);
        }
        System.out.println("Цикл завершён!");
    }
}
