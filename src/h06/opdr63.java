package h06;

import java.awt.*;
import java.applet.*;

public class opdr63 extends Applet {
    int getal1, getal2, uitkomst;

    public void init() {
        getal1 = 2147483647;
        getal2 = 600;
        uitkomst = getal1 + getal2;

    }

    public void paint(Graphics g) {
        g.drawString("negatief getal" + uitkomst, 20, 20);
        // ok het is nu duidelijk voor mij wat er gebeurd als ik bij int hoger ga dan het limiet
    }
}