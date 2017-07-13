package main.java.net.proselyte.chapter07;

// Ещё пример рекурсии
class RecTest {
    int values[];

    RecTest(int i) {
        values = new int[i];
    }

    // Вывести рекурсивно элементы массива
    void printArray(int i) {
        if(i == 0) return;
        else printArray(i - 1);
        System.out.println("[" + (i - 1) + "] " + values[i-1]);
    }
}

class Recursion2 {
    public static void main (String args[]) {
        RecTest ob = new RecTest(20);
        int i;

        for (i = 0; i < 20; i++) ob.values[i] = i;

        ob.printArray(20);
    }
}