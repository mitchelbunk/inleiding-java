package CreativeMe;

import java.applet.Applet;
import java.awt.*;

public class TafelVan3 extends Applet {


    public void init() {

    }


    public void paint(Graphics g) {

        int teller;
        int y = 0;

        for (teller = 1; teller <= 10; teller++) {
            y += 20;
            g.drawString("" + teller * 3, 305, y);
        }
    }
}

