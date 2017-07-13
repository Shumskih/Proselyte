package main.java.net.proselyte.chapter09.Interfaces.Stack;

// Реализация наращиваемого стека
class DynStack implements IntStack {
    private int stck[];
    private int tos;

    // Выделить память и инициализировать стек
    DynStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    // Разместить элемент в стеке
    public void push(int item) {
        // Если стек заполнен, выделить память под стек большего размера
        if (tos == stck.length - 1) {
            int temp[] = new int[stck.length * 2]; // Удвоить размер стека
            for (int i = 0; i < stck.length; i++) temp[i] = stck[i];
            stck = temp;
            stck[++tos] = item;
        } else
            stck[++tos] = item;
    }

    // Извлечь элемент из стека
    public int pop() {
        if (tos < 0) {
            System.out.println("Стек не загружен");
            return 0;
        } else
            return stck[tos--];

    }
}
