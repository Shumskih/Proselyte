package main.java.net.proselyte.chapter11.locks;

// Простой пример блокировки
import java.util.concurrent.locks.*;

public class LockDemo {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();

        new LockThread(lock, "A");
        new LockThread(lock, "B");
    }
}

// Общий ресурс
class Shared {
    static int count = 0;
}

// Поток исполнения, инкрементирующий значение счётчика
class LockThread implements Runnable {
    String name;
    ReentrantLock lock;
    LockThread(ReentrantLock lk, String n) {
        lock = lk;
        name = n;
        new Thread(this).start();
    }

    public void run() {
        System.out.println("Запуск потока " + name);

        try {
            // Сначала заблокировать счётчик
            System.out.println("Поток " + name + " ожидает блокировки счётчика");
            lock.lock();
            System.out.println("поток " + name + " блокирует счётчик");
            Shared.count++;
            System.out.println("Поток " + name + ": " + Shared.count);
            // А теперь переключение контекста, если это возможно
            System.out.println("Поток " + name + " ожидает");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        } finally {
            // Снять блшокировку
            System.out.println("Поток " + name + " снимает блокировку счётчика");
            lock.unlock();
        }
    }
}
