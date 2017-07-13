package main.java.net.proselyte.chapter08;

/**
 В иерархии классов закрытые члены остаются закрытыми в пределах своего класса.
 Эта программа содержит ошибку, поэтому скомпилировать её не удастся.
 */
// Создаём суперкласс
class A1 {
    int i;          // Открыт по кмолчанию
    private int j;  // Закрыт в классе А

    void setij(int x, int y) {
        i = x;
        j = y;
    }
}

// Член j класса А в этом классе недоступен
class B1 extends A1 {
    int total;

    void sum() {
        //total = i + j; // Ошибка! Член j в этом классе недоступен
    }
}
class Access {
    public static void main (String args[]) {
        B1 subObj = new B1();

        subObj.setij(10, 12);

        subObj.sum();
        System.out.println("Сумма равна: " + subObj.total);
    }
}

/**
 Скомпилировать эту программу не удастся, потому что использование переменной j из класса А
 в методе sum() из класса В приводит к нарушению правил доступа.
 */
