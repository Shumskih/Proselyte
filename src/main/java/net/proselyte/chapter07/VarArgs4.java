package main.java.net.proselyte.chapter07;

// Аргументы переменной длины, перегрузка и неоднозначность
// Программа содержит ошибку, поэтому компилироваться не будет
class VarArgs4 {

    static void vaTest(int ... v) {
        System.out.print("vaTest(int ... ): " + "Количество аргументов: " + v.length + " Содержимое: ");

        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    static void vaTest(boolean ... v) {
        System.out.print("vaTest(boolean ...): " + "Количество аргументов: " + v.length + " Содержимое: ");

        for (boolean x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main (String args[]) {
        vaTest(1, 2, 3);
        vaTest(true, false, false);
//        vaTest(); // Ошибка: неоднозначность! Параметр с переменным количеством аргументов может быть пустым,
//        // поэтому этот вызов может быть преобразован в вызов метода vaTest(int ...) или
//        // vaTest(boolean ...). А поскольку допустимы оба варианта, то этот вызов принципиально неоднозначен.
    }


}
