package main.java.net.proselyte.chapter11;

// Приостановка и возобновление исполнения потока современным способос
class NewThread1 implements Runnable {
    String name; // имя потока исполнения
    Thread t;
    boolean suspendFlag;

    NewThread1(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("Новый поток " + t);
        suspendFlag = false;
        t.start(); // запустить поток исполнения
    }

    // Точка входа в поток исполнения
    public void run() {
        try {
            for (int i = 15; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(200);
                synchronized(this) {
                    while(suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println(name + " прерван");
        }
        System.out.println(name + " завершён");
    }

    synchronized void mysuspend() {
        suspendFlag = true;
    }

    synchronized void myresume() {
        suspendFlag = false;
        notify();
    }
}

public class SuspendResume {
    public static void main(String[] args) {
        NewThread1 obj1 = new NewThread1("Один");
        NewThread1 obj2 = new NewThread1("Два");

        try {
            Thread.sleep(1000);
            obj1.mysuspend();
            System.out.println("Приостановка потока Один");

            Thread.sleep(1000);
            obj1.myresume();
            System.out.println("Возобновление потока Один");

            obj2.mysuspend();
            System.out.println("Приостановка потока Два");
            Thread.sleep(1000);

            obj2.myresume();
            System.out.println("Возобновление потока Два");
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }

        // Ожидать завершения потоков исполнения
        try {
            System.out.println("Ожидание завершения потоков");
            obj1.t.join();
            obj2.t.join();
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
    }
}
