package main.java.net.proselyte.chapter18;

// Демонстрация применения некоторых методов из класса Arrays
import java.util.*;

class ArraysDemo {
    public static void main (String args[]) {
        // Выделяем и инициализируем массив
        int array[] = new int[10];
        for(int i = 0; i < 10; i++) {
            array[i] = -3 * i;
        }

        // Вывести, отсортировать и снова вывести содержимое массива
        System.out.print("Исходный массив: ");
        display(array);
        Arrays.sort(array);
        System.out.print("Отсортированный массив: ");
        display(array);

        // Заполняем массив и выводим его содержимое
        Arrays.fill(array, 2, 6, -1);
        System.out.print("Массив после вызова метода fill(): ");
        display(array);

        // Отсортировать и вывести содержимое массива
        Arrays.sort(array);
        System.out.print("Массив после повторной сортировки: ");
        display(array);

        // Выполняем двоичный поиск значения -9
        System.out.print("Значение -9 находится на позиции: ");
        int index = Arrays.binarySearch(array, -9);
        System.out.println(index);
    }

    static void display(int array[]) {
        for (int i : array)
            System.out.print(i + " ");
        System.out.println();
    }
}
