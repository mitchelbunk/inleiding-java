package h05;

import java.awt.*;

import java.applet.*;

public class opdr52 extends Applet {
    Color achtergrondkleur, hlijnen, vlijnen, cijfersEnWoorden, Valerie, Jeroen, Hans;

    int paalbreedte, hansGewicht, jeroenGewicht, valerieGewicht;


    public void init(){
        achtergrondkleur = Color.LIGHT_GRAY;
        hlijnen = Color.BLUE;
        vlijnen = Color.LIGHT_GRAY;
        cijfersEnWoorden = Color.WHITE;
        Valerie = Color.GREEN;
        Jeroen = Color.RED;
        Hans = Color.YELLOW;
        paalbreedte = 25;
        hansGewicht = 400;
        jeroenGewicht = 500;
        valerieGewicht = 200;
    }

    public void paint(Graphics g) {
        setBackground(achtergrondkleur);


        g.setColor(Color.GRAY);
        g.drawRect(100, 200, 700, 600);
        g.setColor(vlijnen);
        g.drawRect(150, 250, 650, 500);
        g.drawRect(200, 300, 600, 400);
        g.drawRect(250, 350, 550, 300);
        g.drawRect(300, 400, 500, 200);
        g.drawRect(350, 450, 450, 100);
        g.drawRect(400, 500, 400, 0);

        g.drawLine(75, 200, 100, 200);

        g.drawLine(700, 100, 700, 100);

        g.setColor(Color.blue);
        g.drawLine(800, 200, 800, 800);

        g.setColor(hlijnen);
        g.drawLine(70, 800, 800, 800);
        g.drawLine(70, 750, 800, 750);
        g.drawLine(70, 700, 800, 700);
        g.drawLine(70, 650, 800, 650);
        g.drawLine(70, 600, 800, 600);
        g.drawLine(70, 550, 800, 550);
        g.drawLine(70, 500, 800, 500);
        g.drawLine(70, 450, 800, 450);
        g.drawLine(70, 400, 800, 400);
        g.drawLine(70, 350, 800, 350);
        g.drawLine(70, 300, 800, 300);
        g.drawLine(70, 250, 800, 250);
        g.drawLine(70, 200, 800, 200);

        g.setColor(cijfersEnWoorden);
        g.drawString("120.",40, 200);

        g.drawString("100.",40, 300);

        g.drawString("80.",40, 400);

        g.drawString("60.",40, 500);

        g.drawString("40.",40, 600);

        g.drawString("20.",40, 700);

        g.drawString("gewicht in kg.",5, 795);



        g.setColor(Color.cyan);
        g.drawLine(100, 800, 100, 195);
        g.drawLine(95, 800, 800, 800);

        g.setColor(Valerie);
        g.fillRect(250, 600, paalbreedte, valerieGewicht);
        g.drawString("Valerie",250, 825);

        g.setColor(Jeroen);
        g.fillRect(450, 300, paalbreedte, jeroenGewicht);
        g.drawString("Jeroen",450, 825);

        g.setColor(Hans);
        g.fillRect(650, 400, paalbreedte, hansGewicht);
        g.drawString("Hans",650, 825);

    }
}