package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdr111 extends Applet {

    public void init() {}


    public void paint(Graphics g) {
        int teller = 1;
        int y = 0;

        while (teller < 11) {
            y += 20;
            g.drawLine(y, 50, y, 300);
            g.drawString("" + teller, y, 315);
            teller++;
        }
    }
}
