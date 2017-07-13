package main.java.net.proselyte.chapter18;

// Используем специальный компаратор
import java.util.*;

// Компаратор для сравнения символьных строк в обратном порядке
// Переопределяем метод compare()(по-умолчанию он пустой) интерфейса Comparator
class MyComp implements Comparator<String> {
    public int compare(String a, String b) {
        String aStr, bStr;
        aStr = a;
        bStr = b;

        // Выполняем сравнение в обратном порядке
        return bStr.compareTo(aStr);
    }
    // Переопределять метод equals() не требуется

}

class CompDemo {
    public static void main(String args[]) {
        // Создаём древовидное множество типа TreeSet
        TreeSet<String> ts = new TreeSet<String>(new MyComp());

        // Вводим элементы в древовидное множество
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        // Выводим элементы из древовидного множества
        for (String element : ts)
            System.out.print(element + " ");

        System.out.println();
    }
}
