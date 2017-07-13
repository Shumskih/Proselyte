package main.java.net.proselyte.chapter09.Interfaces;

interface MyIF {
    // Это объявление обычного метода в интерфейсе. Он не предоставляет реализацию.
    int getNumber();

    // Это объявление метода по умолчанию
    default String getString() {
        return "Объект типа String по умолчанию";
    }
}
