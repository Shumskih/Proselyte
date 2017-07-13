package main.java.net.proselyte.chapter13And20.File;

// Просмотреть каталог HTML-файлов

import java.io.*;

class OnlyExt implements FilenameFilter {
    String ext;

    public OnlyExt(String Ext) {
        this.ext = "." + ext;
    }

    public boolean accept(File dir, String name) {
        return name.endsWith(ext);
    }
}

public class DirListOnly {
    public static void main (String args[]) {
        String dirname = "/Projects";
        File f1 = new File(dirname);
        FilenameFilter only = new OnlyExt("html");
        String s[] = f1.list(only);

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
