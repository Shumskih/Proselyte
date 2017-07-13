package main.java.net.proselyte.chapter18;

// Демонстрация применения класса TreeSetDemo
import java.util.*;

class TreeSetDemo {
    public static void main(String args[]) {
        // Создаём древовидное множество типа TreeSet
        TreeSet<String> ts = new TreeSet<String>();

        // Вводим элементы в древовидное множество типа TreeSet
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        System.out.println(ts);
    }
}
