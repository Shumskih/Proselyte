package main.java.net.proselyte.chapter10;

import javax.management.PersistentMBean;

// Демонстрация цепочки исключений
public class ChainExcDemo {
    static void demoproc() {

        // Создаём исключение
        NullPointerException e = new NullPointerException("верхний уровень");

        // Добавляем причину исключения
        e.initCause(new ArithmeticException("причина"));

        throw e;
    }

    public static void main (String args[]) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            // Выводим исключение верхнего уровня
            System.out.println("Перехвачено исключение: " + e);

            // Выводим исключение, послужившее причиной для исключения первого уровня
            System.out.println("Первопричина: " + e.getCause());
        }
    }
}