package H13;

import java.applet.Applet;
import java.awt.*;

public class Opdr132v2 extends Applet {

    public void init() {
    }




    // de meegegeven waarden voor de lijnen van de driehoek

//    public void tekenDriehoek(Graphics g, int xA, int yA, int xB, int yB, int xC, int yC) {

    // lijn A naar B
//        g.drawLine(xA, yA, xB, yB);
    // lijn B naar C
//        g.drawLine(xB, yB, xC, yC);
    //lijn C naar A
//        g.drawLine(xC, yC, xA, yA);
//    }
//    public void tekenVijfhoek(Graphics g, int xA, int yA, int xB, int yB, int xC, int yC, int xD, int yD, int xE, int yE) {

    //lijn A naar B
//        g.drawLine(xA, yA, xB, yB);

    //lijn B naar C
//        g.drawLine(xB, yB, xC, yC);

    //lijn C naar D
//        g.drawLine(xC, yC, xD, yD);

    //lijn D naar E
//        g.drawLine(xD, yD, xE, yE);

    //lijn E naar A
//        g.drawLine(xE, yE, xA, yA);


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
//    public void betonnenMuur(Graphics g, int aantalRijen, int aantalKolomen, int breedteBaksteen, int hoogteBaksteen){}

    public void paint(Graphics g) {
//        tekenDriehoek(g, 0, 0, 40, 0, 20, 80);
//        tekenDriehoek(g, 0, 80, 40, 80, 20, 0);
//        tekenVijfhoek(g, 150, 150, 100, 105, 50, 150, 75, 200, 125, 200);
        bakstenenMuur(g, 10, 10, 25, 10);
        g.setColor(new Color(0xFF0000));
        bakstenenMuur(g, 10, 10, 25, 10);
    }

}

