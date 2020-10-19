package h11;

import java.awt.*;
import java.applet.*;

public class Opdr112 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int y = 10;

        for(teller = 11; teller < 21; teller++) {
            y += 20;
            g.drawString("" + teller, 305, y );
        }
    }

}
