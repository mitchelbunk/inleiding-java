package CreativeMe;

import java.applet.*;
import java.awt.*;

public class MetenIsWeten extends Applet {
    private int marge, breedte, hoogte;

    private Color wit, zwart, background;


    public void init() {
        wit = Color.WHITE;
        zwart = Color.BLACK;
        background = Color. lightGray;

        marge = 60;
        breedte = 60;
        hoogte = breedte;

        int breedtescherm = 2 * marge + 8 * breedte;
        int hoogtescherm = 2 * marge + 8 * hoogte;
        setSize(breedtescherm, hoogtescherm);
        setBackground(background);
    }

    public void paint(Graphics g) {
        int y = marge;
        for (int rij = 0; rij < 8; rij++) {
            int x = marge;
            for (int kolom = 0; kolom < 8; kolom++) {
                if ( (rij + kolom) % 2 == 0) {
                    g.setColor(zwart);
                }else {
                    g.setColor(wit);
                }
                g.fillRect(x, y, breedte, hoogte);
                x  += breedte;
            }


            y += hoogte;
        }
    }
}
