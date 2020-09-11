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

        g.drawLine(200, 200, 100, 200);

        g.drawLine(200, 200, 150, 50);
    }
}