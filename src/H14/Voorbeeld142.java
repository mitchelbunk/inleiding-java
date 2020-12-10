package H14;

import java.applet.Applet;
import java.awt.*;

public class Voorbeeld142 extends Applet {

    double r;
    int worp;

    @Override
    public void init() {
        r = Math.random();
        worp = (int)(r * 6 + 1);
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("" + worp, 50, 60);
        System.out.println();
    }
}
