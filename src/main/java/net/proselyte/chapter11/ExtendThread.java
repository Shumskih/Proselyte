package main.java.net.proselyte.chapter11;

// Создаём второй поток исполнения, расширив класс Thread
class NewThread2 extends Thread {

    NewThread2() {
        // Создаём новый поток исполнения
        super("Демонстрационный поток");
        System.out.println("Дочерний поток: " + this);
        start(); // Запускаем поток на исполнение
    }

    // Точка входа во второй поток исполнения
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Дочерний поток: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Дочерний поток прерван");
        }
        System.out.println("Дочерний поток завершён");
    }
}

public class ExtendThread {
    public static void main (String args[]) {
        new NewThread(); // Создаём новый поток исполнения

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Главный поток: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
        System.out.println("Главный поток завершён");
    }
}
