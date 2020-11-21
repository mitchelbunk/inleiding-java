package H13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr133v2 extends Applet {
    Button knop1, knop2;
    int breedte = 50;
    int hoogte = 20;
    int kleur = 0x34454545;

    public void init() {
        knop1 = new Button();
        add(knop1);
        knop1.addActionListener(new BakstenenMuurListener());

        knop2 = new Button();
        add(knop2);
        knop2.addActionListener(new BetonnenMuurListener());
    }

    public void paint(Graphics g) {
        betonnenMuur(g, 10, 10, breedte, hoogte, kleur);

        g.setColor(new Color(0xFF0000));
        bakstenenMuur(g, 10, 10, breedte, hoogte);


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

    public void betonnenMuur(Graphics g, int aantalRijen, int aantalKolomen, int breedteBaksteen, int hoogteBaksteen, int bColour){
        g.setColor(new Color(bColour, true));
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

    class BakstenenMuurListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            breedte = 25;
            hoogte = 10;
            kleur = 0xFF0000;

            repaint();
        }
    }

    class BetonnenMuurListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            breedte = 50;
            hoogte = 20;
            kleur = 0x34454545;

            repaint();
        }
    }

}

