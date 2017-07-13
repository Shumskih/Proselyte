package main.java.net.proselyte.chapter09.Interfaces.Stack;

// Реализация интерфейса IntStack для стека фиксированного размера
class FixedStack implements IntStack {
    private int stck[];
    private int tos;

    // Выделить память и инициализировать стек
    FixedStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    // Разместить элемент в стеке
    public void push(int item) {
        if(tos == stck.length-1) // Использовать поле длины стека
            System.out.println("Стек заполнен");
        else
            stck[++tos] = item;
    }

    // Извлечь элемент из стека
    public int pop() {
        if(tos < 0) {
            System.out.print("Стек не загружен");
            return 0;
        } else
            return stck[tos--];
    }
}
