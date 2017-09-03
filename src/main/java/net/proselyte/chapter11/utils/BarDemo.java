package main.java.net.proselyte.chapter11.utils;


// Демонстрация применения класса CyclicBarrier
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class BarDemo {
    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(3, new BarAction());

        System.out.println("Запуск потоков");

        new MyThread2(cb, "A");
        new MyThread2(cb, "B");
        new MyThread2(cb, "C");
        new MyThread2(cb, "X");
        new MyThread2(cb, "Y");
        new MyThread2(cb, "Z");
    }
}

// Поток исполнения, использующий барьер типа CyclicBarrier
class MyThread2 implements Runnable {
    CyclicBarrier cbar;
    String name;

    MyThread2(CyclicBarrier c, String n) {
        cbar = c;
        name = n;
        new Thread(this).start();
    }

    public void run() {

        System.out.println(name);

        try {
            cbar.await();
        } catch (BrokenBarrierException e) {
            System.out.println(e);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

// Объект этого класса вызывается по достижении барьера типа CyclicBarrier
class BarAction implements Runnable {
    public void run() {
        System.out.println("Барьер достигнут!");
    }
}