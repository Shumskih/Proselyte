package main.java.net.proselyte.chapter07;

// Усовершенствованный клаа Stack, в котором использован член длины массива
class Stack1 {
    private int stck[];
    private int tos;

    // Выделить память под стек и инициализировать его
    Stack1(int size) {
        stck = new int[size];
        tos = -1;
    }

    // Разместить элемент в стеке
    void push(int item) {
        if(tos == stck.length-1) // Использован член длины массива
            System.out.println("Стек заполнен");
        else
            stck[++tos] = item;
    }

    // Извлечь элемент из стека
    int pop() {
        if(tos < 0) {
            System.out.println("Стек не загружен");
            return 0;
        } else
            return stck[tos--];
    }
}
class TestStack2 {
    public static void main (String args[]) {
        Stack1 myStack1 = new Stack1(5);
        Stack1 myStack2 = new Stack1(8);

        // Размещаем числа в стеке
        for (int i = 0; i < 5; i++) myStack1.push(i);
        for (int i = 0; i < 8; i++) myStack2.push(i);

        // Извлекаем числа из стека
        System.out.println("Стек в myStack1:");
        for (int i = 0; i < 5; i++)
            System.out.println(myStack1.pop());

        System.out.println("Стек в myStack2:");
        for (int i = 0; i < 8; i++)
            System.out.println(myStack2.pop());
    }
}
