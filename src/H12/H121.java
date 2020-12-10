package H12;

import java.applet.Applet;
import java.awt.*;

public class H121 extends Applet {
    double[] getal;
    double opteller, deler;

    public void init() {
        getal = new double[9];
        deler = getal.length;
        for (int teller = 0; teller < getal.length; teller++) {
            getal[teller] = 50 * teller + 50;
            opteller += 50 * teller + 50;
        }
    }

    public void paint(Graphics g) {
        g.drawString("Het gemiddelde is: " + opteller / deler, 50, 50);

        for (int indexNumber = 0, y = 70; indexNumber < getal.length; indexNumber++, y += 20){
            g.drawString("Het volgende nummber is: " + getal[indexNumber], 50, y);
        }

    }
}
