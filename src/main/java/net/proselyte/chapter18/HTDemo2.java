package main.java.net.proselyte.chapter18;

// Применяем итераторы вместе с классом Hashtable
import java.util.*;

class HTDemo2 {
    public static void main (String[] args) {
        Hashtable<String, Double> balance = new Hashtable<String, Double>();

        String str;
        Double bal;

        balance.put("Джон Доу", 3434.34);
        balance.put("Том Смит", 123.22);
        balance.put("Джейн Бейкер", 1378.00);
        balance.put("Тод Холл", 99.22);
        balance.put("Ральф Смит", -19.08);

        // Выводм все счета в хеш-таблице. Сначала получаем представление всех ключей в виде множества
        Set<String> set = balance.keySet();

        // Получаем итератор
        Iterator<String> itr = set.iterator();

        while (itr.hasNext()) {
            str = itr.next();
            System.out.println(str + ": " + balance.get(str));
        }
        System.out.println();

        // Внести сумму 1000 на счёт Джона Доу
        bal = balance.get("Джон Доу");
        balance.put("Джон Доу", bal + 1000);
        System.out.println("Новый остаток на счёте Джона Доу: " + balance.get("Джон Доу"));
    }
}

