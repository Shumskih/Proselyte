package main.java.net.proselyte.chapter10;

// Демонстрация применения оператора throw
class ThrowDemo {
    static void demoproc() {
        try {
            throw new NullPointerException("Демонстрация");
        } catch (NullPointerException e) {
            System.out.println("Исключение перехвачено в теле метода demoproc()");
            throw e; // Повторно генерируем исключение
        }
    }

    public static void main (String args[]) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("Повторный перехват: " + e);
        }
    }
}
