package main.java.net.proselyte.chapter10;

class SuperSubCatch {
    public static void main (String args[]) {
        try {
            int a = 0;
            int b = 42 / a;
        } catch (Exception e) {
            System.out.println("Перехват исключений общего класса Exception");
        } /*catch (ArithmeticException e) { // Этот оператор catch вообще не будет достигнут, т.к. подкласс ArithmeticException является производным от класса Exception
            System.out.println("Этот код недостижим");
        } */
    }
}
