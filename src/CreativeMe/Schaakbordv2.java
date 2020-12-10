package CreativeMe;

import java.applet.Applet;
import java.awt.*;

public class Schaakbordv2 extends Applet {
    int breedte, hoogte, voeg;


    public void init() {
        breedte = 50;
        hoogte = 25;
        voeg = 5;
    }

        public void paint(Graphics g) {

        int x = 50;
        int y = 50;

            for (int kolom = 0; kolom < 8; kolom++) {

                if (kolom == 0 || kolom == 2 ||kolom == 4 || kolom == 6){
                    g.setColor(Color.red);
                    g.fillRect(x, y, breedte + voeg, hoogte);
                } else {
                    g.setColor(Color.white);
                    g.fillRect(x, y, breedte + voeg, hoogte);
                }
                x += breedte;
            }

            //rij 2
            x = 50;
            y += hoogte;

            for (int kolom = 0; kolom < 8; kolom++) {
                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.white);
                    g.fillRect(x, y, breedte + voeg, hoogte);
                } else {
                    g.setColor(Color.red);
                    g.fillRect(x, y, breedte + voeg, hoogte);
                }
                x += breedte;
            }
            //rij 3
            x = 50;
            y += hoogte;
            for (int kolom = 0; kolom < 8; kolom++) {

                if (kolom == 0 || kolom == 2 ||kolom == 4 || kolom == 6){
                    g.setColor(Color.red);
                    g.fillRect(x, y, breedte + voeg, hoogte);
                } else {
                    g.setColor(Color.white);
                    g.fillRect(x, y, breedte + voeg, hoogte);
                }
                x += breedte;
            }
            //rij 4
            x = 50;
            y += hoogte;
            for (int kolom = 0; kolom < 8; kolom++) {
                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.white);
                    g.fillRect(x, y, breedte + voeg, hoogte);
                } else {
                    g.setColor(Color.red);
                    g.fillRect(x, y, breedte + voeg, hoogte);
                }
                x += breedte;
            }

            x = 50;
            y += hoogte;
            for (int kolom = 0; kolom < 8; kolom++) {

                if (kolom == 0 || kolom == 2 ||kolom == 4 || kolom == 6){
                    g.setColor(Color.red);
                    g.fillRect(x, y, breedte + voeg, hoogte);
                } else {
                    g.setColor(Color.white);
                    g.fillRect(x, y, breedte + voeg, hoogte);
                }
                x += breedte;
            }

            //rij 4
            x = 50;
            y += hoogte;
            for (int kolom = 0; kolom < 8; kolom++) {
                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.white);
                    g.fillRect(x, y, (breedte + voeg), hoogte);
                } else {
                    g.setColor(Color.red);
                    g.fillRect(x, y, (breedte + voeg), hoogte);
                }
                x += breedte;
            }

            x = 50;
            y += hoogte;
            for (int kolom = 0; kolom < 8; kolom++) {

                if (kolom == 0 || kolom == 2 ||kolom == 4 || kolom == 6){
                    g.setColor(Color.red);
                    g.fillRect(x, y, (breedte + voeg), hoogte);
                } else {
                    g.setColor(Color.white);
                    g.fillRect(x, y, (breedte + voeg), hoogte);
                }
                x += breedte;
            }

    }
}
