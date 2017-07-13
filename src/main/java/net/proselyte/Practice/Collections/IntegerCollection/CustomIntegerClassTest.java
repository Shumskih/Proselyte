package main.java.net.proselyte.Practice.Collections.IntegerCollection;

import java.util.*;

class CustomIntegerClassTest {

    public static void main (String args[]) {

        CustomIntegerClass cic = new CustomIntegerClass();

        cic.add(1);
        cic.add(2);
        cic.add(3);
        cic.add(10);
        cic.add(4);
        cic.add(6);

        cic.searchByValue(27);
        cic.searchByIndex(4);
        cic.maxElement();
        cic.minElement();
        cic.average();
        cic.remove(14);

        System.out.println(cic.showArr());


    }
}

