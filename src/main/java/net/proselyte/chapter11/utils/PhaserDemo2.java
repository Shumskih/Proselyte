package main.java.net.proselyte.chapter11.utils;

// Расширить класс Phaser и переопределить метод onAdvance() таким образом, чтобы было выполнено только определённое количество фаз
import java.util.concurrent.*;

// Расширить класс Phaser, чтобы было выполнено только определённое количество фаз
class MyPhaser extends Phaser {
    int numPhases;

    MyPhaser(int parties, int phaseCount) {
        super(parties);

        numPhases = phaseCount - 1;
    }

    // Переопределить метод onAdvance(), чтобы выполнить определённое количество фаз
    protected boolean onAdvance(int p, int regParties) {
        // Следующий оператор printl() требуется только для целей иллюстрации.
        // Как правило, метод onAdvance() не отображает вводимые данные
        System.out.println("Фаза " + p + " завершена\n");

        // Возвратить логическое значение true, если все фазы завершены
        if(p == numPhases || regParties == 0) return true;

        // В противном случае возвратить логическое значение false
        return false;
    }
}

public class PhaserDemo2 {
    public static void main(String[] args) {
        MyPhaser phsr = new MyPhaser(1, 4);

        System.out.println("Запуск потоков\n");

        new MyThread4(phsr, "A");
        new MyThread4(phsr, "B");
        new MyThread4(phsr, "C");

        // Ожидать завершения определённого количества фаз
        while(!phsr.isTerminated())
            phsr.arriveAndAwaitAdvance();

        System.out.println("Синхронизатор фаз завершён");
    }
}

// Поток исполнения, использующий синхронизатор фаз типа Phaser
class MyThread4 implements Runnable {
    Phaser phsr;
    String name;

    MyThread4(Phaser p, String n) {
        phsr = p;
        name = n;
        phsr.register();
        new Thread(this).start();
    }

    public void run() {
        while(!phsr.isTerminated()){
            System.out.println("Поток " + name + " начинает фазу " + phsr.getPhase());
            phsr.arriveAndAwaitAdvance();

            // Небольшая пауза, чтобы не нарушить порядок вывода.
            // Только для иллюстрации, но необязательно для правильного функционирования фаз
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
