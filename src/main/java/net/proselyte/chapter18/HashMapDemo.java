package main.java.net.proselyte.chapter18;

import java.util.*;

class HashMapDemo {
    public static void main (String args[]) {
        // Создаём хеш-отображение
        HashMap<String, Double> hm = new HashMap<String, Double>();

        // Вводим элементы в хеш-отображение
        hm.put("Джон Доу", new Double(3434.34));
        hm.put("Том Смит",  new Double(123.22));
        hm.put("Джейн Бейкер", new Double(1378.00));
        hm.put("Тод Холл", new Double(99.22));
        hm.put("Ральф Смит", new Double(-19.08));

        // Получаем множество записей
        Set<Map.Entry<String, Double>> set = hm.entrySet();

        // Выводим множество записей
        for(Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }
        System.out.println();

        // Внести сумму 1000 на счёт Джона Доу
        double balance = hm.get("Джон Доу");
        hm.put("Джон Доу", balance + 1000);
        System.out.println("Новый остаток на счёте Джона Доу: " + hm.get("Джон Доу"));
    }
}
