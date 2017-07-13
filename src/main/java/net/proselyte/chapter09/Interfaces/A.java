package main.java.net.proselyte.chapter09.Interfaces;

// Пример вложенного интерфейса
// Этот класс содержит интерфейс как свой член
class A {
    // Это вложенный интерфейс
    public interface NestedIF {
        boolean isNotNegative (int x);
    }
}
