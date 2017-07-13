package main.java.net.proselyte.chapter18;

// Демонстрация применения класса ArrayList
import java.util.*;

class ArrayListDemo {
    public static void main (String[] args) {
        // Создаём списочный массив
        ArrayList<String> al = new ArrayList<String>();

        System.out.println("Начальный размер списочного массива al = " + al.size());

        // Вводим элементы в списочный массив
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("D");
        al.add("B");
        al.add("F");
        al.add(1, "A2");
        System.out.println("Размер списочного массива al после ввода элементов = " + al.size());

        // Выводим списочный массив
        System.out.println("Содержимое списочного массива al: " + al);

        // Удалить элементы из списочного массива
        al.remove("F");
        al.remove(2);
        System.out.println("Размер списочного массива после удаления элементов = " + al.size());

        System.out.println("Содержимое списочного массива al: " + al);
    }
}
