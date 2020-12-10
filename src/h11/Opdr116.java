package h11;

import java.applet.*;
import java.awt.*;

public class Opdr116 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int y = 50;

        for (teller = 0; teller < 15; teller++) {
            y += 10;
            g.drawRoundRect(50, 50, y, y, 200, 200);

        }
    }
}
