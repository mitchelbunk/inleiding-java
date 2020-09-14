package h05;

import java.awt.*;

import java.applet.*;

public class opdr51 extends Applet{
    //declaratie.
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {
        //instalisatie.
        opvulkleur = Color.magenta;
        lijnkleur = Color.BLACK;
        breedte = 200;
        hoogte = 100;
    }

    public void paint(Graphics g) {
        //teken lijn
        g.drawRect(40, 60, 100, 0);
        //teken rechthoek
        g.drawRect(10, 100, breedte, hoogte);
        //teken afgeronde rechthoek
        g.drawRoundRect(100, 225, breedte, hoogte, 30, 30);
        //teken gevulde rechthoek
        g.setColor(opvulkleur);
        g.fillRect(315, 100, breedte, hoogte);
        //teken ovaal
        g.fillArc(550, 100, breedte, hoogte, 0, 45);
        g.setColor(lijnkleur);
        g.drawOval(315, 100, breedte, hoogte);

        g.setColor(lijnkleur);
        g.drawOval(550, 100, breedte, hoogte);
        //teken gevulde ovaal
        g.setColor(opvulkleur);
        g.fillOval(315, 225, breedte, hoogte);
        //teken cirkel
        g.setColor(lijnkleur);
        g.drawOval(550, 225, 100, 100 );

        g.drawString("lijn", 100, 49 );
        g.drawString("rechthoek", 100, 150);
        g.drawString("afgeronde rechthoek", 100, 300 );
        g.drawString("gevulde rechthoek met ovaal", 300, 100 );
        g.drawString("gevulde ovaal", 400, 300 );
        g.drawString("cirkel", 600, 300 );
        g.drawString("taartpunt met ovaal eromheen", 550, 120 );

    }
}
