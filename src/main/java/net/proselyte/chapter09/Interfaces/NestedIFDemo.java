package main.java.net.proselyte.chapter09.Interfaces;

class NestedIFDemo {
    public static void main (String args[]) {
        // Используем ссылку на вложенный интерфейс
        A.NestedIF nif = new B();

        if (nif.isNotNegative(10))
            System.out.println("Число 10 не отрицательное");
        if (nif.isNotNegative(-12))
            System.out.println("Это не будет выведено");
    }
}
