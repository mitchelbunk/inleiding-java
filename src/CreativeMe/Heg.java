package CreativeMe;

import java.applet.Applet;
import java.awt.*;

public class Heg extends Applet {

    @Override
    public void init() {
        setSize(1950, 500);
    }

    public void paint(Graphics g) {

//        tekenDriehoek(g, 0, 0, 40, 0, 20, 80);
//        tekenDriehoek(g, 0, 80, 40, 80, 20, 0);
//        tekenVijfhoek(g, 150, 150, 100, 105, 50, 150, 75, 200, 125, 200);
        tekenBoomGaard(g, 25, 100, 75, 75);
    }

    // de meegegeven waarden voor de lijnen van de driehoek
//    public void tekenDriehoek(Graphics g, int xA, int yA, int xB, int yB, int xC, int yC) {
        // lijn A naar B
//        g.drawLine(xA, yA, xB, yB);
        // lijn B naar C
//        g.drawLine(xB, yB, xC, yC);
        //lijn C naar A
//        g.drawLine(xC, yC, xA, yA);
//    }
//    public void tekenVijfhoek(Graphics g, int xA, int yA, int xB, int yB, int xC, int yC, int xD, int yD, int xE, int yE)
//    {
        //lijn A naar B
//        g.drawLine(xA, yA, xB, yB);

        //lijn B naar C
//        g.drawLine(xB, yB, xC, yC);

        //lijn C naar D
 //       g.drawLine(xC, yC, xD, yD);

        //lijn D naar E
 //       g.drawLine(xD, yD, xE, yE);

        //lijn E naar A
 //       g.drawLine(xE, yE, xA, yA);

//    }
    public void tekenBoomGaard(Graphics g, int boomBreedte, int boomHoogte, int bladerenBreedte, int bladerenHoogte) {

        int teller = 0;
        int x = 0;

        while (teller < 2) {
            x += 63.5;
            g.setColor(new Color(113, 79, 23));
            g.fillRect(30 + x, 50, boomBreedte, boomHoogte);

            g.setColor(new Color(37, 87, 31, 255));
            g.fillOval(10 + x, 15, bladerenBreedte, bladerenHoogte);
        }
    }
}