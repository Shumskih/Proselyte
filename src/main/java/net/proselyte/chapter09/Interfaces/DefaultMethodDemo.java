package main.java.net.proselyte.chapter09.Interfaces;

// Реализовать интерфейс MyIF
class MyIFImp implements MyIF {
    // В этом классе должен быть реализован только метод getNumber(),
    // а вызов метода getString() разрешается по умолчанию
    public int getNumber() {
        return 100;
    }
}

class MyIFImp2 implements MyIF {
    // В этом классе предоставляется реализация обоих методов getString() и getNumber()
    public int getNumber() {
        return 100;
    }

    public String getString() {
        return "Это другая символьная строка";
    }
}

// Использовать метод по умолчанию
class DefaultMethodDemo {
    public static void main (String args[]){
        MyIFImp obj = new MyIFImp();
        MyIFImp2 obj2 = new MyIFImp2();

        // Метод getNumber() можно вызвать, т.к. он явно реализован в классе MyIFImp
        System.out.println(obj.getNumber());

        // Метод getString() также можно вызвать, т.к. в интерфейсе имеется его реализация по умолчанию
        System.out.println(obj.getString());
        System.out.println(obj2.getString());
    }
}
