package H12;

import java.applet.Applet;
import java.awt.*;
import java.util.*;

public class Voorbeeld126 extends Applet {
    String[] namen = { "Valerie", "Jeroen", "Sander", "Elise"};

    @Override
    public void init() {
        Arrays.sort(namen);
    }

    @Override
    public void paint(Graphics g) {
        for (int teller = 0; teller < namen.length; teller++) {
            g.drawString("" + namen[teller], 50, 20 * teller + 20);
        }
    }
}
