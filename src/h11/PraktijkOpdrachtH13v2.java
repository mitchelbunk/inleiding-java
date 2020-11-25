package h11;

import java.applet.Applet;
import java.awt.*;

public class PraktijkOpdrachtH13v2 extends Applet {

    public void init() {setSize(1950, 500);}


    public void paint(Graphics g) {
        tekenBoomGaard1(g, 25, 100, 75, 75);
        tekenBoomGaard2(g, 25, 100, 75, 75);
    }

    public void tekenBoomGaard1(Graphics g, int boomBreedte, int boomHoogte, int bladerenBreedte, int bladerenHoogte) {

        g.setColor(new Color(113, 79, 23));
        g.fillRect(30, 50, boomBreedte, boomHoogte);
        g.fillRect(95, 50, boomBreedte, boomHoogte);
        g.fillRect(160, 50, boomBreedte, boomHoogte);
        g.fillRect(225, 50, boomBreedte, boomHoogte);
        g.fillRect(290, 50, boomBreedte, boomHoogte);

        g.setColor(new Color(37, 87, 31, 255));
        g.fillOval(10, 15, bladerenBreedte, bladerenHoogte);
        g.fillOval(75, 15, bladerenBreedte, bladerenHoogte);
        g.fillOval(140, 15, bladerenBreedte, bladerenHoogte);
        g.fillOval(205, 15, bladerenBreedte, bladerenHoogte);
        g.fillOval(270, 15, bladerenBreedte, bladerenHoogte);

    }

    public void tekenBoomGaard2(Graphics g, int boomBreedte, int boomHoogte, int bladerenBreedte, int bladerenHoogte) {

        g.setColor(new Color(113, 79, 23));
        g.fillRect(30, 190, boomBreedte, boomHoogte);
        g.fillRect(95, 190, boomBreedte, boomHoogte);
        g.fillRect(160, 190, boomBreedte, boomHoogte);
        g.fillRect(225, 190, boomBreedte, boomHoogte);
        g.fillRect(290, 190, boomBreedte, boomHoogte);

        g.setColor(new Color(37, 87, 31, 255));
        g.fillOval(10, 155, bladerenBreedte, bladerenHoogte);
        g.fillOval(75, 155, bladerenBreedte, bladerenHoogte);
        g.fillOval(140, 155, bladerenBreedte, bladerenHoogte);
        g.fillOval(205, 155, bladerenBreedte, bladerenHoogte);
        g.fillOval(270, 155, bladerenBreedte, bladerenHoogte);

    }

}