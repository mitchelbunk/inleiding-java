package CreativeMe;

import java.applet.Applet;
import java.awt.*;

public class Fibbonacci extends Applet {
    int A, B, C, teller, y, getal;

    public void init() {
        A = 1;
        B = 1;

    }


    public void paint(Graphics g) {

        g.drawString("" + 1, 50, 50);
        g.drawString("" + 1, 50, 75);

        y = 75;

        for (teller = 0; teller < 11; teller++) {

            C = A + B;
            A = B;
            B = C;

        y+= 25;
            g.drawString("" + C, 50, y);
        }


    }
}
