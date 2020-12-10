package H13;

import java.applet.Applet;
import java.awt.*;

public class Opdr132v2 extends Applet {

    public void init() {
    }


    public void bakstenenMuur(Graphics g, int aantalRijen, int aantalKolomen, int breedteBaksteen, int hoogteBaksteen){
        for (int kolom = 0; kolom < aantalKolomen; kolom++) {
            for (int rij = 0; rij < aantalRijen; rij++) {
                if (rij % 2 == 0){
                g.drawRect((int) (kolom * breedteBaksteen + 0.5 * breedteBaksteen), rij * hoogteBaksteen, breedteBaksteen, hoogteBaksteen);
                    g.drawRect((int) (kolom * breedteBaksteen + 0.5 * breedteBaksteen), rij * hoogteBaksteen, breedteBaksteen, hoogteBaksteen);
                }else{
                    g.drawRect(kolom * breedteBaksteen, rij * hoogteBaksteen , breedteBaksteen, hoogteBaksteen);
                }

            }
        }

    }


    public void paint(Graphics g) {
        g.setColor(new Color(0xFF0000));
        bakstenenMuur(g, 10, 10, 25, 10);
    }

}

