package main.java.net.proselyte.chapter10;

class MultiCatch {
    public static void main (String args[]) {
        int a = 1, b = 0;
        int vals[] = {1, 2, 3};

        try {
            int result = a / b; // Генерируем исключение типа arithmeticException

            // vals[10] = 19; //Генерируем исключение типа ArrayIndexOutOfBoundException

            // В операторе catch перехватываются оба исключения
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Исключение перехвачено");
        }
        System.out.println("После многократного перехвата");

    }
}