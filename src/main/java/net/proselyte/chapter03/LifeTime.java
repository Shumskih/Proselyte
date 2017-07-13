package main.java.net.proselyte.chapter03;

// Демонстрация срока действия переменной
class LifeTime {
    public static void main (String[] args) {
        int x;

        for (x = 0; x < 10; x++) {
            int y = -1; // Переменная y инициализируется при каждом вхождении в блок кода
            System.out.println("y равно: " + y); // Здесь всегда выводится значение -1

            y = 100;
            System.out.println("y теперь равно: " + y);
        }
    }
}
