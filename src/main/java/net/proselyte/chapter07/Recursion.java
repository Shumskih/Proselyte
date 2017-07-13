package main.java.net.proselyte.chapter07;

// Простой пример рекурсии
class Factorial {
    // Это рекурсивный метод
    int fact(int n) {
        int result;

        if(n==1) return 1;
        result = fact(n-1) * n;
        return result;
    }
}

class Recursion {
    public static void main (String args[]) {
        Factorial f = new Factorial();

        System.out.println("Факториал числа 3 = " + f.fact(3));
        System.out.println("Факториал числа 4 = " + f.fact(4));
        System.out.println("Факториал числа 5 = " + f.fact(5));
    }
}
