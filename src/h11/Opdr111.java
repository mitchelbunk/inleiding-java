package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdr111 extends Applet {

    public void init() {}


    public void paint(Graphics g) {
        int teller = 1;
        int y = 2;

        while (teller < 200) {
            y += 2;
            g.drawRoundRect(200, 1, y, y,y ,y);
            g.drawString("", y, 315);
            teller++;
        }
    }
}