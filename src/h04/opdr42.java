package h04;

import java.awt.*;

import java.applet.*;

public class opdr42 extends Applet{

   public void init() {
   }

            public void paint(Graphics g) {
                setBackground(Color.lightGray);

                    //de driehoek van de vorige opdracht besloot ik als het dak van het huis te gebruiken.
                        g.setColor(Color.black);
                    g.drawLine(100, 150, 150, 50);
                    g.drawLine(200, 150, 150, 50);

                        g.setColor(Color.cyan);
                    g.fillRect(100, 150, 100 ,100);

                    // het vierkant stelt het huis voor
                        g.setColor(Color.red);
                    g.drawLine(100, 150, 100, 250);
                    g.drawLine(200, 150, 200, 250);
                        g.setColor(Color.blue);
                    g.drawLine(200, 150, 100, 150);
                    g.drawLine(100, 250, 200, 250);
                g.setColor(Color.blue);
                g.fillRect(110, 210, 20, 20);
                g.fillRect(170, 210, 20, 40);
                g.setColor(Color.blue);

                g.drawString("een huis.", 125, 310);

    }

}
