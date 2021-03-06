package main.java.net.proselyte.chapter11.atomic;

// Простой пример выполнения атомарных операций
import java.util.concurrent.atomic.*;

public class AtomicDemo {
    public static void main(String[] args) {
        new AtomThread("A");
        new AtomThread("B");
        new AtomThread("C");
    }
}

class Shared {
    static AtomicInteger ai = new AtomicInteger(0);
}

// Поток исполнения, в котором икрементируется значение счётчика
class AtomThread implements Runnable {
    String name;
    AtomThread(String n) {
        name = n;
        new Thread(this).start();
    }

    public void run() {
        System.out.println("Запуск потока " + name);
        for (int i = 1; i <= 3; i++) {
            System.out.println("Поток " + name + " получено: " + Shared.ai.getAndSet(i));
        }
    }
}