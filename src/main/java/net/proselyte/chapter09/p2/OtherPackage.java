package main.java.net.proselyte.chapter09.p2;

import main.java.net.proselyte.chapter09.p1.*;


class OtherPackage {
    OtherPackage() {
        Protection p = new Protection();
        System.out.println("Конструктор из другого пакета");

        // Доступен для данного класса или пакета
        // System.out.println("n = " + p.n);

        // Доступен для данного класса
        // System.out.println("n_pri = " + p.n_pri);

        // Доступен только для данного класса, подкласса или пакета
        // System.out.println("n_pro = " + p.n_pro);

        System.out.println("n_pub = " + p.n_pub);
    }
}
