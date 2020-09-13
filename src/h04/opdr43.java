package h04;

import java.awt.*;

import java.applet.*;

public class opdr43 extends Applet{

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.gray);

            g.setColor(Color.red);
        g.fillRect(100, 100, 200 ,50);

            g.setColor(Color.white);
        g.fillRect(100, 150, 200 ,50);

            g.setColor(Color.blue);
        g.fillRect(100, 200, 200 ,50);

            g.setColor(Color.black);
        g.fillRect(90, 100, 10, 500);

    }

}