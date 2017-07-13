package main.java.net.proselyte.Practice.Collections.CustomListCollection;

import java.util.Arrays;

class CustomArrayListClass {

    private Object arr[];
    private int size = 10;
    private boolean isFull;
    private int i;

    // Конструкторы
    CustomArrayListClass() {
        arr = new Object[size];
    }

    CustomArrayListClass(int initialSize) {
        this.size = initialSize;
        arr = new Object[initialSize];
    }

    // Добавление элемента
    void add(Object element) {
        if (arr[0] != null) {
            arr[0] = null;
            removal();
        }
        for (i = arr.length - 1; i >= 0; i-- ) {
            if (arr[i] == null) {
                arr[i] = element;
                break;
            }
        }
    }

    // Смещение элементов коллекции влево
    void removal() {
        for (i = 0; i < arr.length - 1; i++) {
            Object temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    // Получение размера коллекции
    int getSize() {
        System.out.println(Arrays.toString(arr));
        System.out.println();
        System.out.println("Ёмкость коллекции: ");
        return arr.length;
    }
}
