package main.java.net.proselyte.chapter07;

// Использовать массив для передачи методу переменного количества аргуметов.
// Это старый подход к обработке аргументов переменной длины
class PassArray {
    static void vaTest(int v[]) {
        System.out.print("Колическтво аргументов " + v.length + " Содержимое: ");

        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        // Обратить внимание на порядок создания массива для хранения аргументов
        int n1[] = { 10 };
        int n2[] = { 1, 2, 3 };
        int n3[] = { };
        vaTest(n1);
        vaTest(n2);
        vaTest(n3);
    }
}
