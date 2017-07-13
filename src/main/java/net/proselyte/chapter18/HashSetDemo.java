package main.java.net.proselyte.chapter18;

// Демонстрация применения класса HashSet
import java.util.*;

class HashSetDemo {
    public static void main(String[] args) {
        // Создаём хеш-множество
        HashSet<String> hs = new HashSet<String>();

        // Ввести элементы в хеш-множество
        hs.add("Бета");
        hs.add("Альфа");
        hs.add("Эта");
        hs.add("Гамма");
        hs.add("Эпсилон");
        hs.add("Омега");

        System.out.println(hs);
    }
}
