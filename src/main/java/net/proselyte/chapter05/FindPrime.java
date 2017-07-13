package main.java.net.proselyte.chapter05;

// Проверить на простые числа
class FindPrime {
    public static void main (String args[]) {
        int num;
        boolean isPrime;

        num = 8;

        if(num < 2) isPrime = false;
        else isPrime = true;

        for (int i = 2; i <= num/i; i++) {
            if ((num % i == 0)) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) System.out.println(num + " - простое число");
        else System.out.println(num + " - составное число");
    }
}
