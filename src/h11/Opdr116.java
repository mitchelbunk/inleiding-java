package h11;

import java.applet.*;
import java.awt.*;

public class Opdr116 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int y = 0;

        for (teller = 2; teller < 15; teller++) {
            y += 10;
            g.drawRoundRect(50, 50, y, y, 150, 150);

        }
    }
}
