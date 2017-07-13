package main.java.net.proselyte.chapter09.Interfaces;

// Класс B реализвет вложенный интерфейс
class B implements A.NestedIF {
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}
