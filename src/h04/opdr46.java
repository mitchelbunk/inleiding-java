package h04;

import java.awt.*;

import java.applet.*;

public class opdr46 extends Applet{

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.gray);
        g.fillRect(100, 100, 150, 350);

        g.setColor(Color.red);
        g.fillArc(125, 120, 100, 100, 360, 360);

        g.setColor(Color.yellow);
        g.fillArc(125, 225, 100, 100, 360, 360);

        g.setColor(Color.green);
        g.fillArc(125, 330, 100, 100, 360, 360);
    }
}