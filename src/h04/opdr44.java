package h04;

import java.awt.*;

import java.applet.*;

public class opdr44 extends Applet {

    public void init(){
    }

    public void paint(Graphics g) {
        setBackground(Color.gray);


                    g.setColor(Color.black);
                g.drawRect(100, 200, 700, 600);
                    g.setColor(Color.white);
                g.drawRect(150, 250, 600, 500);
                g.drawRect(200, 300, 500, 400);
                g.drawRect(250, 350, 400, 300);
                g.drawRect(300, 400, 300, 200);
                g.drawRect(350, 450, 200, 100);
                g.drawRect(400, 500, 100, 0);

                g.drawLine(75, 200, 100, 200);

                g.drawLine(700, 100, 700, 100);

                    g.setColor(Color.blue);
                g.drawLine(75, 800, 800, 800);
                g.drawLine(75, 750, 800, 750);
                g.drawLine(75, 700, 800, 700);
                g.drawLine(75, 650, 800, 650);
                g.drawLine(75, 600, 800, 600);
                g.drawLine(75, 550, 800, 550);
                g.drawLine(75, 500, 800, 500);
                g.drawLine(75, 450, 800, 450);
                g.drawLine(75, 400, 800, 400);
                g.drawLine(75, 350, 800, 350);
                g.drawLine(75, 300, 800, 300);
                g.drawLine(75, 250, 800, 250);
                g.drawLine(75, 200, 800, 200);

                    g.setColor(Color.white);
                g.drawString("120",40, 200);

                g.drawString("100",40, 300);

                g.drawString("80",40, 400);

                g.drawString("60",40, 500);

                g.drawString("40",40, 600);

                g.drawString("20",40, 700);

                g.drawString("gewicht in kg",5, 795);



                g.setColor(Color.black);
            g.drawLine(100, 800, 100, 200);
            g.drawLine(100, 800, 800, 800);

                g.setColor(Color.green);
            g.fillRect(250, 600, 50, 200);
            g.drawString("Valerie",250, 825);

                g.setColor(Color.red);
            g.fillRect(450, 300, 50, 500);
            g.drawString("Jeroen",450, 825);

                g.setColor(Color.yellow);
            g.fillRect(650, 400, 50, 400);
            g.drawString("Hans",650, 825);

    }
}
