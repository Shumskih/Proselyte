package main.java.net.proselyte.chapter18;

// Демонтсрация простого применения интерфейса Spliterator
import java.util.*;

class SpliteratorDemo {
    public static void main (String args[]) {
        // Создаём списочный массив числовых значений типа double
        ArrayList<Double> vals = new ArrayList<>();

        // Вводим значения в списочный массив
        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);

        // Вызываем метод tryAdvance() для вывода списочного массива vals
        System.out.print("Содержимое списочного массива vals:\n");
        Spliterator<Double> spltitr = vals.spliterator();
        while(spltitr.tryAdvance((n) -> System.out.println(n)));
        System.out.println();

        // Создаём новый списочный массив, содержащий квадратные корни числовых значений из списочного массива vals
        spltitr = vals.spliterator();
        ArrayList<Double> sqrs = new ArrayList<>();
        while(spltitr.tryAdvance((n) -> sqrs.add(Math.sqrt(n))));

        // Вызываем методв forEachRemaining() для вывода содержимого списочного массива sqrs
        System.out.print("Содержимое списочного массива:\n");
        spltitr = sqrs.spliterator();
        spltitr.forEachRemaining((n) -> System.out.println(n));
        System.out.println();
    }
}
