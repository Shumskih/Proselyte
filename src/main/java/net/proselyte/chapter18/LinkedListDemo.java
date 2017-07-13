package main.java.net.proselyte.chapter18;

// Демонстрация применения класса LinkedList
import java.util.*;

class LinkedListDemo {
    public static void main (String[] args) {
        // Создаём связный список
        LinkedList<String> ll = new LinkedList<String>();

        // Вводим элементы в связный список
        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        ll.addFirst("A");
        ll.add(1, "A2");

        System.out.println("Исходное содержимое связного списка ll: " + ll);

        // Удалить элементы из связного списка
        ll.remove("F");
        ll.remove(2);
        System.out.println("Содержимое связного списка ll после удаления элементов: " + ll);

        // Удалить первый и последний элементы из связного списка
        ll.removeFirst();
        ll.removeLast();

        System.out.println("Содержимое связного списка после удаления первого и последнего элементов: " + ll);

        // Получить и присвоить значение
        String val = ll.get(2);
        ll.set(2, val + " изменено");

        System.out.println("Содержимое связного списка после изменения: " + ll);
    }
}
