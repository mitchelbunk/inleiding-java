package CreativeMe;

import java.applet.*;
import java.awt.*;

public class Schaakbord extends Applet {
    int breedte, hoogte;


    public void init() {
        breedte = 50;
        hoogte = 50;
    }

        public void paint(Graphics g) {

        int x = 50;
        int y = 50;

            for (int kolom = 0; kolom < 8; kolom++) {

                if (kolom == 0 || kolom == 2 ||kolom == 4 || kolom == 6){
                    g.setColor(Color.black);
                    g.fillRect(x, y, breedte, hoogte);
                } else {
                    g.setColor(Color.white);
                    g.fillRect(x, y, breedte, hoogte);
                }
                x += breedte;
            }

            //rij 2
            x = 50;
            y += hoogte;

            for (int kolom = 0; kolom < 8; kolom++) {
                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.white);
                    g.fillRect(x, y, breedte, hoogte);
                } else {
                    g.setColor(Color.black);
                    g.fillRect(x, y, breedte, hoogte);
                }
                x += breedte;
            }
            //rij 3
            x = 50;
            y += hoogte;
            for (int kolom = 0; kolom < 8; kolom++) {

                if (kolom == 0 || kolom == 2 ||kolom == 4 || kolom == 6){
                    g.setColor(Color.black);
                    g.fillRect(x, y, breedte, hoogte);
                } else {
                    g.setColor(Color.white);
                    g.fillRect(x, y, breedte, hoogte);
                }
                x += breedte;
            }
            //rij 4
            x = 50;
            y += hoogte;
            for (int kolom = 0; kolom < 8; kolom++) {
                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.white);
                    g.fillRect(x, y, breedte, hoogte);
                } else {
                    g.setColor(Color.black);
                    g.fillRect(x, y, breedte, hoogte);
                }
                x += breedte;
            }

            x = 50;
            y += hoogte;
            for (int kolom = 0; kolom < 8; kolom++) {

                if (kolom == 0 || kolom == 2 ||kolom == 4 || kolom == 6){
                    g.setColor(Color.black);
                    g.fillRect(x, y, breedte, hoogte);
                } else {
                    g.setColor(Color.white);
                    g.fillRect(x, y, breedte, hoogte);
                }
                x += breedte;
            }

    }
}
