package main.java.net.proselyte.chapter09.Interfaces.Stack;

class IFTest {
    public static void main (String args[]) {
        FixedStack myStack1 = new FixedStack(5);
        FixedStack myStack2 = new FixedStack(8);

        // Разместить числа в стеке
        System.out.println("Пушим стек myStack1: ");
        for (int i = 0; i < 5; i++) {
            myStack1.push(i);
            System.out.println("Пушим число " + i);
        }

        System.out.println("Пушим стек myStack2: ");
        for (int i = 0; i < 8; i++) {
            myStack2.push(i);
            System.out.println("Пушим число " + i);
        }

        // Извлечь эти числа из стека
        System.out.println("Стек в myStack1:");
        for (int i = 0; i < 5; i++)
            System.out.println(myStack1.pop());

        System.out.println("Стек в myStack2:");
        for (int i = 0; i < 8; i++)
            System.out.println(myStack2.pop());
    }
}
