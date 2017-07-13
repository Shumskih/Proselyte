package main.java.net.proselyte.chapter10;

// Демонстрация throws
class ThrowsDemo {
    static void throwOne() throws IllegalAccessException {
        System.out.println("В теле метода");
        throw new IllegalAccessException();
    }

    public static void main (String ags[]){
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Перехвачено исключение: " + e);

        }
    }
}
