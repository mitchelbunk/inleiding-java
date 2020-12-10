package H12;

import java.applet.*;
import java.awt.*;


// het maken van een tabel
public class Voorbeeld121 extends Applet {
    double salaris[];

    public void init() {
        salaris = new double [10];

        for (int teller = 0; teller < salaris.length; teller++) {
            salaris[teller] = 100 * teller + 100;
        }

    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < salaris.length; teller++) {
            g.drawString("" + salaris[teller], 50, 20 * teller + 20);
            System.out.println(teller);
        }
    }
}
