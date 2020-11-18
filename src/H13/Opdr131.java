package H13;

import java.applet.Applet;
import java.awt.*;

public class Opdr131 extends Applet {

    @Override
    public void init() {
    }

    public void paint(Graphics g) {
        tekenDriehoek(g, 0, 0, 40, 0, 20, 80);
        tekenDriehoek(g, 0, 80, 40, 80, 20, 0);
    }

    public void tekenDriehoek(Graphics g, int xA, int yA, int xB, int yB, int xC, int yC) {
        // lijn A naar B
        g.drawLine(xA, yA, xB, yB);
        // lijn B naar C
        g.drawLine(xB, yB, xC, yC);
        //lijn C naar A
        g.drawLine(xC, yC, xA, yA);
    }
}