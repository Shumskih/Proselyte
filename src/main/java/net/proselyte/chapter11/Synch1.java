package main.java.net.proselyte.chapter11;

// В этой программе используется синхронизированный блок
class Callme1 {
    void call (String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Прервано!");
        }
        System.out.println("]");
    }
}

class Caller1 implements Runnable {
    String msg;
    Callme1 target;
    Thread t;

    public Caller1(Callme1 targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }

    // Синхронизированные вызовы метода call()
    public void run() {
        synchronized(target) { // Синхронизированный блок
            target.call(msg);
        }
    }
}

public class Synch1 {
    public static void main(String[] args) {
        Callme1 target = new Callme1();
        Caller1 obj1 = new Caller1(target, "Добро пожаловать");
        Caller1 obj2 = new Caller1(target, "в синхронизированный");
        Caller1 obj3 = new Caller1(target, "мир!");

        // Ожидать завершения потока исполнения
        try {
            obj1.t.join();
            obj2.t.join();
            obj3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Прервано!");
        }
    }
}
