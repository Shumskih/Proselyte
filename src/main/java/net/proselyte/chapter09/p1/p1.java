package main.java.net.proselyte.chapter09.p1;

// Демонстрационный пакет p1
class Demo {

    // Получить экземпляры различных классов из пакета p1
    public static void main (String args[]){
        Protection ob1 = new Protection();
        Derived ob2 = new Derived();
        SamePackage ob3 = new SamePackage();
    }
}
