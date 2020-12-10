package h06;

import java.awt.*;
import java.applet.*;

public class opdr61 extends Applet{
    int a;
    int b;
    int uitkomst;

    public void init() {
        a =113;
        b = 4;
        uitkomst = a / b;
    }

    public void paint(Graphics g) {
        setBackground(new Color(255, 140, 50));
        g.drawString("het bedrag dat iedereen heeft verdiend:" + a, 20, 20);
        g.drawString("aantal personen: " + b, 20, 40);
        g.drawString("$113 : 4 = $28 ", 20, 60);

        g.drawString("Jans deel =$" + uitkomst, 20, 100);
        g.drawString("Ali's deel =$" + uitkomst, 20, 150);
        g.drawString("Mijn deel =$" + uitkomst, 20, 200);
        g.drawString("Jeannette's deel =$" + uitkomst, 20, 250);
    }
}