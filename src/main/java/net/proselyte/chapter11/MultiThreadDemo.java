package main.java.net.proselyte.chapter11;

// Создаём несколько потоков исполнения
class NewThread3 implements Runnable {
    String name;
    Thread t;

    NewThread3(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("Новый поток " + t);
        t.start(); // Запускаем поток на исполнение
    }

    // Точка входа в поток исполнения
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " прерван");
        }
        System.out.println(name + " завершён");
    }
}

public class MultiThreadDemo {
    public static void main (String args[]) {
        // Запустить потоки на исполнение
        new NewThread3("Один");
        new NewThread3("Два");
        new NewThread3("Три");

        try {
            // Ожидать щавершения других потоков исполнения
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
        System.out.println("Главный поток завершён");
    }
}
