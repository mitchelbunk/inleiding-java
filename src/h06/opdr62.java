package h06;

import java.awt.*;
import java.applet.*;

public class opdr62 extends Applet {
    int uur, dag, week, jaar;

    public void init() {
        uur = 60 * 60;
        dag = (60 * 60) * 24;
        week = ((60 * 60) * 24) * 7;
        jaar = ((((60 * 60) * 24) * 7) * 52);
    }

    public void paint(Graphics g) {
        setBackground(new Color(255, 150, 150));
        g.drawString("seconden in een uur = " + uur, 20, 20);
        g.drawString("Seconden in een dag = " + dag, 20, 40);
        g.drawString("Seconden in een week = " + week, 20, 60);
        g.drawString("seconden in een jaar = " + jaar, 20, 80);

    }
}