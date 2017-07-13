package main.java.net.proselyte.chapter10;

// Демонстрация применения оператора finally
class FinallyDemo {
    // Генерируем исключение в методе
    static void procA() {
        try {
            System.out.println("В теле метода procA()");
            throw new RuntimeException();
        } finally {
            System.out.println("Блок оператора finally в методе procA()");
        }
    }

    // Возвращаем управление из блока оператора try
    static void procB() {
        try {
            System.out.println("В теле метода procB()");
            return;
        } finally {
            System.out.println("Блок оператора finally в методе procB()");
        }
    }

    // Выполняем блок try как обычно
    static void procC() {
        try {
            System.out.println("В теле метода procC()");
        } finally {
            System.out.println("Блок оператора finally в методе procC()");
        }
    }

    public static void main (String args[]) {
        try {
            procA();
        } catch (Exception e) {
            System.out.println("Исключение перехвачено");
        }

        procB();
        procC();
    }
}