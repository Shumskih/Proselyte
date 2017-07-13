package main.java.net.proselyte.chapter13And20.File;

// Используем каталоги

import java.io.*;

public class DirList {
    public static void main (String args[]) {
        String dirname = "/Projects/Java";
        File f1 = new File(dirname);
        if (f1.isDirectory()) {
            System.out.println("Каталог " + dirname);
            String s[] = f1.list();

            for (int i = 0; i < s.length; i++) {
                File f = new File(dirname + "/" + s[i]);
                if(f.isDirectory()) {
                    System.out.println(s[i] + " является каталогом");
                } else {
                    System.out.println(s[i] + " является файлом");
                }
            }
        } else {
            System.out.println(dirname + " не является каталогом");
        }
    }
}