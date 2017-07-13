package main.java.net.proselyte.chapter18;

// Используем лямбда-выражение для создания компаратора с обратным упорядочиванием
import java.util.*;

class CompDemo3 {
    public static void main (String args[]) {
        // Передаём компаратор с обратным упорядочиванием древовидному множеству типа TreeSet
        TreeSet<String> ts = new TreeSet<String>((aStr, bStr) -> bStr.compareTo(aStr));

        // Вводим элементы в древовидное множество
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        // Выводи элементы из древовидного множества
        for (String element : ts)
            System.out.print(element + " ");

        System.out.println();
    }
}
