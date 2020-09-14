package h04;

import java.awt.*;

import java.applet.*;

public class opdr45 extends Applet{

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);


        g.fillArc(500, 500, 500, 250, 360, 360);
    }
}
