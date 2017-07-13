package main.java.net.proselyte.chapter13And20.Applets;

import java.applet.*;
import java.awt.*;

/*
    <applet code="SimpleApplet" width=200 height = 60>
    </applet>
*/

public class SimpleApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Простейший аплет", 100, 100);
    }
}
