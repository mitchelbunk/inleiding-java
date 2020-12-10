package JavaTests;

import java.applet.Applet;
import java.awt.*;

public class javaTests extends Applet{
    double salaris[];

    @Override
    public void init() {
        salaris = new double[5];

        for (int teller = 0; teller < salaris.length; teller++) {
            salaris[teller] = 10 * teller + 100;

        }

    }

    @Override
    public void paint(Graphics g) {
        for (int teller = 0; teller < salaris.length; teller++) {
            g.drawString("" + salaris[teller], 50, 20 * teller + 20);

        }
    }



}