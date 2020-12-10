package CreativeMe;

import java.applet.*;
import java.awt.*;

public class ConcentrischeCirkels extends Applet {

    public void paint(Graphics g) {
        int straal = 440, breedte = 1280, hoogte = 960;
        do {
            int x = breedte/2-straal, y = hoogte/2-straal;

            g.setColor(new Color(0x103163));
            g.drawRect(x, y, 2*straal, 2*straal);
            straal -= 2;

        }while (straal > 0);
    }
}
