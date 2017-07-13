package main.java.net.proselyte.chapter05;

// Применение оператора break для выхода из цикла while
class BreakLoop2 {
    public static void main (String args[]) {
        int i = 0;

        while (i < 100) {
            if (i == 10) break; // Выход из цикла, если значение i = 0
            System.out.println("Значение i равно: " + i);
            i++;
        }
        System.out.println("Цикл завершён!");
    }
}
