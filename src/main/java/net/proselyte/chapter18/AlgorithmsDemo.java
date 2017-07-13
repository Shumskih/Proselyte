package main.java.net.proselyte.chapter18;

// Демонстрация применения различных алгоритмов коллекций
import java.util.*;

class AlgorithmsDemo {
    public static void main (String args[]) {
        // Создаём неинициализированный связный список
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(-8);
        ll.add(20);
        ll.add(-20);
        ll.add(8);

        // Создаём компаратор с обратным упорядочением
        Comparator<Integer> r = Collections.reverseOrder();

        // Отсортируем список с помощью этого компаратора
        Collections.sort(ll, r);

        System.out.print("Список отсортирован в обратном порядке: ");

        for (int i : ll)
            System.out.print(i + " ");

        System.out.println();

        // Перетасуем список
        Collections.shuffle(ll);

        // Выведем перетасованный список
        System.out.print("Список перетасован: ");

        for (int i : ll)
            System.out.print(i + " ");

        System.out.println();

        System.out.println("Минимум: " + Collections.min(ll));
        System.out.println("Максимум: " + Collections.max(ll));
    }
}
