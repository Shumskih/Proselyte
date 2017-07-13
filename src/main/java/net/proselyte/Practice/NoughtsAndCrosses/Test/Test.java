package main.java.net.proselyte.Practice.NoughtsAndCrosses.Test;

import java.util.Arrays;
import java.util.Scanner;

class Test {

    String cells[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
    boolean gameOver = false;

    void test() {

        if (!cells[0].equals("0") & !cells[1].equals("0") & !cells[2].equals("0")
                & !cells[3].equals("0")  & !cells[4].equals("0")  & !cells[5].equals("0")
                & !cells[6].equals("0")  & !cells[7].equals("0")  & !cells[8].equals("0")) {

            gameOver = true;
        }
        System.out.println("gameOver = " + gameOver);
    }
}

class TestTest {
    public static void main (String args[]) {
        Test test = new Test();
        test.test();
    }
}
