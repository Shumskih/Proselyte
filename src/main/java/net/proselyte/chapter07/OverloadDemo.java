package main.java.net.proselyte.chapter07;

// Демонстрация перегрузки методов
class OverloadDemo {
    void test() {
        System.out.println("Параметры отсутствуют");
    }

    // Перегружаемы метод, проверяющий наличие одного целочисленного параметра
    void test(int a) {
        System.out.println("a = " + a);
    }

    // Перегружаемый метод, проверяющий наличие двух целочисленных параметров
    void test(int a, int b) {
        System.out.println("a = " + a + "; b = " + b);
    }

    // Перегружаемый метод, проверяющий наличие параметра типа double
    double test(double a) {
        System.out.println("double a = " + a);
        return a*a;
    }
}

class Overload {
    public static void main (String args[]) {
        OverloadDemo od = new OverloadDemo();
        double result;

        // Вызываем все варианты метода test()
        od.test();
        od.test(10);
        od.test(10, 20);
        result = od.test(123.25);
        System.out.println("Результат вызова od.test(123.25): " + result);
    }
}
