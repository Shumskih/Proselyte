package main.java.net.proselyte.chapter06;

// В этом колассе определяется целочисленный стек, в котором можно хранить до 10 целочисленных значений
class Stack {
    int stck[] = new int[10];
    int tos;

    // Инициализировать вершину стека
    Stack() {
        tos = -1;
    }

    // Разместить элемент в стеке
    void push (int item) {
        if(tos == 9)
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

class TestStack {
    public static void main (String args[]) {
        Stack myStack1 = new Stack();
        Stack myStack2 = new Stack();

        // Разместить числа в стеке
        for (int i = 0; i < 10; i++) myStack1.push(i);
        for (int i = 10; i < 20; i++) myStack2.push(i);

        // Извлечь числа из стека
        System.out.println("Содержимое стека 1: ");
        for (int i = 0; i < 10; i++)
            System.out.println(myStack1.pop());

        System.out.println("Содержимое стека 2: ");
        for (int i = 0; i < 10; i++)
            System.out.println(myStack2.pop());
    }
}
