package main.java.net.proselyte.chapter03;

// Область действия блока кода
class Scope {
    public static void main (String[] args) {
        int x; // Переменная доступна всему коду из блока main

        x = 10;
        if(x == 10) { // Начало новой область действия,
            int y = 20; // доступной только этому блоку кода

            // Обе переменные x и y доступны в этой области действия
            System.out.println("x и y: " + x + " " + y);
            x = y * 2;
        }

        // y = 100; // Переменная y недоступна в этой области действия,
        // а переменная x доступна
        System.out.println("x равно " + x);
    }
}
