package main.java.net.proselyte.chapter05;

// Демонстрация применения оператора return
class Return {
    public static void main (String args[]) {
        boolean t = true;

        System.out.println("До возврата");

        if(t) return;

        System.out.println("Этот код выводиться не будет");
    }
}
