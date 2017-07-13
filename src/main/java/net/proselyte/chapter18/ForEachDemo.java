package main.java.net.proselyte.chapter18;

// Применяем цикл for в стиле for each для перебора содержимого коллекций
import java.util.*;

class ForEachDemo {
    public static void main (String args[]) {
        // Создаём списочный массив для целых чисел
        ArrayList<Integer> vals = new ArrayList<Integer>();

        // Вводим числовые значения в списочный массив
        vals.add(1);
        vals.add(2);
        vals.add(3);
        vals.add(4);
        vals.add(5);

        // Организуем цикл для вывода числовых значений
        System.out.print("Исходное содержимое списочного массива vals: ");
        for (int v : vals)
            System.out.print(v + " ");

        System.out.println();

        // Суммирует числовые значения в цикле for
        int sum = 0;
        for (int v : vals)
            sum += v;

        System.out.println("Сумма числовых значений " + sum);
    }
}
