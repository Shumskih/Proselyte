package main.java.net.proselyte.chapter11.utils;

// Пример применения класса Phaser
import java.util.concurrent.*;

public class PhaserDemo {
    public static void main(String[] args) {
        Phaser phsr = new Phaser(1);
        int curPhase;

        System.out.println("Запуск потоков");

        new MyThread3(phsr, "A");
        new MyThread3(phsr, "B");
        new MyThread3(phsr, "C");

        // Ожидать завершения всеми потоками исполнения первой фазы
        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Фаза " + curPhase + " завершена");

        // Ожидать завершения всеми потоками исполнения второй фазы
        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Фаза " + curPhase + " завершена");

        // Ожидать завершения всеми потоками третьей фазы
        curPhase = phsr.getPhase();
        phsr.arriveAndAwaitAdvance();
        System.out.println("Фаза " + curPhase + " завершена");

        // Снять основной поток исполнения с регистрации
        phsr.arriveAndDeregister();

        if(phsr.isTerminated())
            System.out.println("Синхронизатор фаз завершён");
    }
}

// Поток исполнения, использующий синхронизатор фаз типа Phaser
class MyThread3 implements Runnable {
    Phaser phsr;
    String name;

    MyThread3(Phaser p, String n) {
        phsr = p;
        name = n;
        phsr.register();
        new Thread(this).start();
    }

    public void run() {
        System.out.println("Поток " + name + " начинает первую фазу");
        phsr.arriveAndAwaitAdvance(); // Известить о достижении фазы

        // Небольшая пауза, чтобы не нарушить порядок вывода.
        // Только для иллюстрации, но необязательно для правильного функционирования синхронизатора фаз
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Поток " + name + " начинает вторую фазу");
        phsr.arriveAndAwaitAdvance(); // Известить о достижении фазы

        // Небольшая пауза, чтобы не нарушить порядок вывода.
        // Только для иллюстрации, но необязательно для правильного функционирования синхронизатора фаз
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Поток " + name + " начинает третью фазу");
        phsr.arriveAndDeregister(); // Известить о достижении фазы и снять потоки с регистрации

    }
}
