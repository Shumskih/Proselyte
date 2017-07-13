package main.java.net.proselyte.chapter18;

import java.util.*;

class TreeMapDemo {
    public static void main (String args[]) {
        // Создаём древовидное отображение
        TreeMap<String, Double> tm = new TreeMap<String, Double>();

        // Вводим элементы в древовидное отображение
        tm.put("Джон Доу", new Double(4343.43));
        tm.put("Том Смит", new Double(123.22));
        tm.put("Джейн Бейкер", new Double(1378.00));
        tm.put("Тод Халл", new Double(99.22));
        tm.put("Ральф Смит", new Double(-19.08));

        // Получаем множество записей
        Set<Map.Entry<String, Double>> set = tm.entrySet();

        // Выводим множество записей
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }
        System.out.println();

        // Вносит сумму 1000 на счёт Джона Доу
        double balance = tm.get("Джон Доу");
        tm.put("Джон Доу", balance + 1000);
        System.out.println("Новый остаток на счёте Джона Доу: " + tm.get("Джон Доу"));
    }
}
