package main.java.net.proselyte.chapter09.Interfaces.Stack;

// Определить интерфейс для целочисленного стека
interface IntStack {
    void push(int item); // Сохранить элемент в стеке
    int pop();           // Извлечь элемент из стека

    //  У метода clear() теперь имеется вариант по умолчанию, поэтому ему придётся реализоваться в том классе,
    // где уже применяется интерфейс IntStack
    default void clear() {
        System.out.println("Метод clear() не реализован");
    }
}
