package h04;

import java.awt.*;

import java.applet.*;

public class opdr41 extends Applet{

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
            g.setColor(Color.black);
        g.drawLine(100, 200, 150, 50);
            g.setColor(Color.black);
        g.drawLine(200, 200, 100, 200);
            g.setColor(Color.black);
        g.drawLine(200, 200, 150, 50);
            g.setColor(Color.cyan);
        g.fillRect(100, 200, 100 ,100);
            g.setColor(Color.black);
        g.drawLine(100, 200, 100, 300);
        g.drawLine(200, 300, 100, 300);
        g.drawLine(200, 200, 200, 300);
        g.drawLine(100, 200, 200, 200);
            g.setColor(Color.black);
        g.fillRect(110, 210, 20, 20);
        g.fillRect(170, 260, 20, 40);
    }
}