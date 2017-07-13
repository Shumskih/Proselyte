package main.java.net.proselyte.chapter18;

// Демонстрация применения класса ArrayDeque
import java.util.*;

class ArrayDequeDemo {
    public static void main (String args[]) {
        // Создаём двухстороннюю очередь
        ArrayDeque<String> adq = new ArrayDeque<String>();

        // Используем класс ArrayDeque для организации стека
        adq.push("A");
        adq.push("B");
        adq.push("D");
        adq.push("E");
        adq.push("F");

        System.out.println("Извлечение из стека: ");

        while(adq.peek() != null)
            System.out.print(adq.pop() + " ");

        System.out.println();
    }
}
