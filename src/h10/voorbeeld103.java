package h10;

import java.applet.Applet;
import java.awt.*;

public class voorbeeld103 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        g.drawString("" + 6 + " is groter dan "+ 5 + " en kleiner dan " + 8 + ": " +(6 > 5 && 6 < 8), 50, 60);
        g.drawString("" + 6 + " is groter dan "+ 5 + " en groter dan " + 8 + ": " +(6 > 5 && 6 > 8), 50, 120);
        g.drawString("" + 6 + " is kleiner dan "+ 5 + " en groter dan " + 8 + ": " +(6 < 5 && 6 > 8), 50, 180);
        g.drawString("" + 6 + " is kleiner dan "+ 5 + " en kleiner dan " + 8 + ": " +(6 < 5 && 6 < 8), 50, 240);

        g.drawString("" + 6 + " is groter dan " + 5 + ": " + (!(6 > 5)), 50, 30);
        g.drawString("" + 6 + " is groter dan " + 5 + ": " + (!(6 < 5)), 200, 30);
    }
}