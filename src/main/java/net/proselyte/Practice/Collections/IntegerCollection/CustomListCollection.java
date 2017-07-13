package main.java.net.proselyte.Practice.Collections.IntegerCollection;

import java.util.Arrays;

class CustomIntegerClass {

    // Пустые массивы интов
    private int arr[] = {};
    private int arrCopy[] = {};
    private int arrCopyForRemove[] = {};
    int i;

    // Добавление элемента и увеличение каждого элемента на добавляемый элемент
    void add(int integer) {
        if (arr.length == 0)
            arr = new int[]{integer};
        else {
            arrCopy = Arrays.copyOf(arr, arr.length + 1);
            arr = arrCopy;
            arr[arr.length - 1] = integer;
            for (i = 0; i < arr.length; i++)
                arr[i] += integer;

            arrCopy = null; // Для GC, я так понимаю
        }
    }

    // Удаление элемента и уменьшение каждого элемента на уменьшаемый элемент
    void remove(int integer) {
        int temp;

        System.out.print("Удаляем: " + integer + "; ");
        System.out.println("До удаления: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == integer) {
                temp = arr[arr.length - 1];
                arr[i] = temp;
                arr[arr.length - 1] = integer;
                arrCopy = Arrays.copyOf(arr, arr.length - 1);
                arr = arrCopy;

                arrCopy = null; // для GC, полагаю

            }
        }
        for (i = 0; i < arr.length; i++)
            arr[i] -= integer;
        System.out.println("После удаления: " + Arrays.toString(arr));
    }

    // Поиск элемента по значению
    void searchByValue(int integer) {
        boolean in = false;
        int value;

        for (i = 0; i < arr.length; i++) {
            if (arr[i] == integer) {
                in = true;
                System.out.println("Элемент найден: " + arr[i]);
                break;
            }
        }
        if (!in)
            System.out.println("Элемент " + integer + " отсутствует.");
    }

    // Поиск по индексу
    void searchByIndex(int index) {

        try {
            for (i = 0; i < arr.length; i++) {
                if (arr[index] == arr[i]) {
                    System.out.println("По индексу [" + index + "] лежит элемент: " + arr[i]);
                    System.out.println(showArr());
                    break;
                }
            }
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Нет элемента под индексом [" + index + "]");
        }
    }

    // Поиск максимального элемента
    void maxElement() {
        int index;
        int temp;
        int maxElement;

        for (index = 0; index < arr.length - 1; index++) {
            if (arr[index] > arr[index + 1]) {
                temp = arr[index];
                arr[index] = arr[index + 1];
                arr[index + 1] = temp;
            }
        }
        maxElement = arr[arr.length - 1];
        System.out.println("Максимальный элемент в коллекции: " + maxElement);
    }

    // Поиск минимального элемента
    void minElement() {
        int index;
        int temp;
        int minElement;

        for (index = 0; index < arr.length - 1; index++) {
            if (arr[index] < arr[index + 1]) {
                temp = arr[index];
                arr[index] = arr[index + 1];
                arr[index + 1] = temp;
            }
        }
        minElement = arr[arr.length - 1];
        System.out.println("Минимальный элемент в коллекции: " + minElement);
    }

    // Поиск среднего арифметического значения
    void average() {
        double average;
        double sum = 0;
        int index;

        for (index = 0; index < arr.length; index++) {
            sum += arr[index];
        }
        average = sum / arr.length;
        System.out.println("Среднее арифметическое значение: " + average);
    }

    // Проверка на наличие элементов
    boolean isEmpty() {
        if (arr.length == 0) {
            System.out.print("Данные отсутствуют:" + " ");
            return true;
        } else
            return false;
    }

    // Выводим массив на экран
    String showArr() {
        return Arrays.toString(arr);
    }
}
