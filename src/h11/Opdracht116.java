package h11;

import java.applet.*;
import java.awt.*;

public class Opdracht116 extends Applet {


    public void init() {}


    public void paint(Graphics g) {
        int straal = 220, breedte = 640, hoogte = 480;
        do {
            int x = breedte/2-straal, y = hoogte/2-straal;

            g.setColor(new Color(0x2D9B19));
            g.drawOval(x, y, 2*straal, 2*straal);

            straal -= 50;

        }while (straal > 0);

    }
}
