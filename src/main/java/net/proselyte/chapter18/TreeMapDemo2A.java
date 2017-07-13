package main.java.net.proselyte.chapter18;

// Используем метод thenComparing() для сортировки счетов вкладчиков сначала по фамилии, а затем по имени
import java.util.*;

// Создаём компаратор, сравнивающий фамилии вкладчиков
class CompLastNames implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i, j;

        // Найдём индекс символа, с которого начинается фамилия
        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');
        return aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
    }
}

// отсортируем счета вкладчиков по имени, если фамилии одинаковы
class CompThenByFirstName implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i, j;
        return aStr.compareToIgnoreCase(bStr);
    }
}

class TreeMapDemo2A {
    public static void main (String args[]) {
        // используем метод thenComparing() для создания компаратора, сравнивающего сначала фамилии, а затем имена, если фамилии одинаковы
        CompLastNames compLN = new CompLastNames();
        Comparator<String> compLastThenFirst = compLN.thenComparing(new CompThenByFirstName());

        // Создаём древовидное отображение
        TreeMap<String, Double> tm = new TreeMap<String, Double>(compLastThenFirst);

        // Вводим элементы в древовидное отображение
        tm.put("Джон Доу", new Double(3434.34));
        tm.put("Том Смит", new Double(123.22));
        tm.put("Джейн Бейкер", new Double(1378.00));
        tm.put("Тод Халл", new Double(99.22));
        tm.put("Ральф Смит", new Double(-19.08));

        // Получаем множество элементов
        Set<Map.Entry<String, Double>> set = tm.entrySet();

        // Выводим элементы из множества
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        // Вносим 1000 на счёт Джона Доу
        double balance = tm.get("Джон Доу");
        tm.put("Джон Доу", balance + 1000);

        System.out.println("Новый остаток на счёте Джона Доу: " + tm.get("Джон Доу"));

    }
}
