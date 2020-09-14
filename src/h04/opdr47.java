package h04;

import java.awt.*;

import java.applet.*;

public class opdr47 extends Applet{

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.gray);

        g.setColor(Color.black);
        g.fillRect(100, 100, 100, 100);

        g.setColor(Color.gray);
        g.fillRect(101, 101, 98, 98);

            g.setColor(Color.red);
        g.fillArc(110, 110, 25, 25, 360, 360);
            g.setColor(Color.green);
        g.fillArc(165, 110, 25, 25, 360, 360);
            g.setColor(Color.blue);
        g.fillArc(165, 165, 25, 25, 360, 360);
            g.setColor(Color.yellow);
        g.fillArc(110, 165, 25, 25, 360, 360);

        g.setColor(Color.black);

        g.drawLine(200, 100, 250, 50);

        g.drawLine(100, 100, 150, 50);

        g.drawLine(150, 50, 250, 50);

        g.drawLine(200, 200, 250, 150);

        g.drawLine(250, 50, 250, 150);


    }
}