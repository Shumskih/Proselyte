package main.java.net.proselyte.chapter03;

// Пример динамической инициализации переменной
class DynInit {
    public static void main (String[] args) {
        double a = 3.0, b = 4.0;

        // Динамическая инициализация переменной с
        double c = Math.sqrt(a * a + b * b);
        System.out.println("Гипотенуза равна " + c);
    }
}
