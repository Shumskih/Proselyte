package main.java.net.proselyte.chapter18;

// Обратный порядок с помощью метода reversed()
import java.util.*;

class MyComp2 implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        return aStr.compareTo(bStr);
    }
}

class CompDemo2 {
    public static void main(String args[]) {
        // Создаём объект компаратора
        MyComp2 mc = new MyComp2();

        // Создаём древовидное множество типа TreeSet
        // и передаём ему MyComp c обратным упорядочиванием
        TreeSet<String> ts = new TreeSet<String>(mc.reversed());

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
