package main.java.net.proselyte.chapter07;

// Применение автоматического преобразования типов к перегрузке
class OverloadDemo2 {
    void test() {
        System.out.println("Параметры отсутствуют");
    }

    // Перегружаемый метод, проверяющий наличие двух целочисленных параметров
    void test(int a, int b) {
        System.out.println("a = " + a + "; b = " + b);
    }

    // Перегружаемый метод, проверяющий наличие параметра типа double
    void test(double a) {
        System.out.println("Внутреннее преобразование при вызове test(double a) a = " + a);
    }
}

class Overload2 {
    public static void main (String args[]) {
        OverloadDemo2 od = new OverloadDemo2();
        int i = 88;

        od.test();
        od.test(10, 20);

        od.test(i); // Здесь вызывается вариант метода test(double a)
        od.test(123.2); // И здесь вызывается вариант метода test(double a)
    }
}
