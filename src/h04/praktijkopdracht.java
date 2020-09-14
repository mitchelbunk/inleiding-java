package h04;

import java.awt.*;

import java.applet.*;

public class praktijkopdracht extends Applet{

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.gray);

        g.setColor(Color.lightGray);
        g.drawRect(0, 0, 100, 100);
        g.drawRect(0, 100, 100, 100);
        g.drawRect(100, 0, 100, 100);
        g.drawRect(0, 200, 100, 100);
        g.drawRect(200, 0, 100, 100);
        g.drawRect(0, 400, 100, 100);
        g.drawRect(400, 0, 100, 100);
        g.drawRect(0, 400, 100, 100);
        g.drawRect(400, 0, 100, 100);
        g.drawRect(0, 500, 100, 100);
        g.drawRect(500, 0, 100, 100);

        g.drawRect(100, 100, 100, 100);
        g.drawRect(200, 100, 100, 100);
        g.drawRect(100, 200, 100, 100);
        g.drawRect(100, 100, 100, 100);
        g.drawRect(300, 100, 100, 100);
        g.drawRect(100, 300, 100, 100);

        g.drawRect(200, 200, 100, 100);
        g.drawRect(200, 300, 100, 100);
        g.drawRect(300, 200, 100, 100);



        g.drawRect(300, 300, 100, 100);
        g.drawRect(0, 300, 100, 100);
        g.drawRect(300, 0, 100, 100);
        g.drawRect(300, 400, 100, 100);
        g.drawRect(400, 300, 100, 100);

        g.drawRect(500, 500, 100, 100);
        g.drawRect(500, 100, 100, 100);
        g.drawRect(100, 500, 100, 100);
        g.drawRect(500, 400, 100, 100);
        g.drawRect(400, 500, 100, 100);













            g.setColor(Color.magenta);
        g.fillRect(250, 50, 200, 50);

        g.fillArc(250, 150, 200, 50, 0, 360);
        g.fillArc(500, 50, 200, 50, 0, 45);

        g.setColor(Color.black);
        g.drawLine(0, 20, 200, 20);

        g.drawRoundRect(0, 150, 200, 50, 30, 30);

        g.drawRect(0, 50, 200, 50);

        g.drawArc(250, 50, 200, 50, 0, 360);
        g.drawArc(500, 200, 100, 100, 0, 360);
        g.drawArc(500, 50, 200, 50, 0, 360);

        g.drawString("lijn", 100, 50 );
        g.drawString("rechthoek", 100, 100 );
        g.drawString("afgeronde rechthoek", 50, 200 );
        g.drawString("gevulde rechthoek met ovaal", 250, 75 );
        g.drawString("gevulde ovaal", 300, 200 );
        g.drawString("cirkel", 525, 300 );
        g.drawString("taartpunt met ovaal eromheen", 525, 120 );







    }
}