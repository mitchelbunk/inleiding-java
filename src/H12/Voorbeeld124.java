package H12;

import java.applet.Applet;
import java.awt.*;


//grootste waarde in een tabel.
public class Voorbeeld124 extends Applet {
    double[] salaris = { 100.0, 200.0, 500.0, 400.0, 300.0};
    double maximum;

    @Override
    public void init() {
        maximum = salaris[0];
        for (int teller = 0; teller < salaris.length; teller++) {
            if (salaris[teller] > maximum) {
                maximum = salaris[teller];
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("Het maximum is: " + maximum, 50, 20);
    }
}
