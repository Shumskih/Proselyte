package main.java.net.proselyte.chapter18;

// Использовать компаратор для сортировки счетов по фамилиям вкладчиков
import java.util.*;

// Сравниваем последние слова в обеих символьных строках
class TComp implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i, j, k;

        // Находим индекс символа, с которого начинается фамилия
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        k = aStr.substring(i).compareTo(bStr.substring(j));

        if(k == 0) // Фамилии совпадают, проверить имя и фамилию полностью
            return aStr.compareTo(bStr);
        else
            return k;
    }
    // Переопределять метод equals() не требуется
}

class TreeMapDemo2 {
    public static void main (String args[]) {
        // Создаём древовидное отображение
        TreeMap<String, Double> tm = new TreeMap<String, Double>(new TComp());

        // Вводим элементы в древовидное отображение
        tm.put("Джон Доу", new Double(3434.34));
        tm.put("Том Смит", new Double(123.22));
        tm.put("Джейн Бейкер", new Double(1378.00));
        tm.put("Тод Халл", new Double(99.22));
        tm.put("Ральф Смит", new Double(-19.08));

        // Получаем множество элементов
        Set<Map.Entry<String, Double>> set = tm.entrySet();

        // Выводим элементы из множества
        for(Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        // Внести 1000 на счёт Джона Доу
        double balance = tm.get("Джон Доу");
        tm.put("Джон Доу", balance + 1000);
        System.out.println("Новый остаток на счёте Джона Доу: " + tm.get("Джон Доу"));
    }
}
