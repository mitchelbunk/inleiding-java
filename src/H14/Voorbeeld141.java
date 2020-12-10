package H14;

import java.applet.Applet;
import java.awt.*;

//willekeurige getallen
public class Voorbeeld141 extends Applet {

    double r;
    int WKaart;

    @Override
    public void init() {
        r = Math.random();
        WKaart = (int)(r * 52 + 1);
    }


    @Override
    public void paint(Graphics g) {
        g.drawString("" + WKaart, 50, 60);
    }
}
