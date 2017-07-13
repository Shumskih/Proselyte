package main.java.net.proselyte.chapter05;

// Демонстрация применения цикла do-while
class DoWhile {
    public static void main (String args[]) {
        int n = 10;
        do {
            System.out.println("Такт " + n);
            n--;
        } while (n > 0);
    }
}
