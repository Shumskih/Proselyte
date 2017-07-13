package main.java.net.proselyte.chapter18;

// Демонстрация применения итераторов
import java.util.*;

class IteratorDemo {
    public static void main(String args[]) {
        // Создаём списочный массив
        ArrayList<String> al = new ArrayList<String>();

        // Вводим элементы в списочный массив
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");

        // Используем итераторы для вывода списочного массива al
        System.out.print("Исходное содержимое списочного массива al: ");

        Iterator<String> itr = al.iterator();
        while(itr.hasNext()) {
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        // Видоизменяем перебираемые объекты
        ListIterator<String> litr = al.listIterator();
        while(litr.hasNext()) {
            String element = litr.next();
            litr.set(element + "+");
        }

        System.out.print("Изменённое содержимое списочного массива al:");
        itr = al.iterator();
        while(itr.hasNext()){
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        // Теперь отобразим список в обратном порядке
        System.out.println("Список в обратном порядке: ");
        while(litr.hasPrevious()) {
            String element = litr.previous();
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
