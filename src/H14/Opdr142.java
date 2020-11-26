package H14;

import java.applet.Applet;
import java.awt.*;
import java.util.Random;

public class Opdr142 extends Applet {

    //String[] kaarten = {"klaver aas", "schoppen aas", "ruiten aas", "harten aas", "klaver 2", "schoppen 2", "ruiten 2", "harten 2","klaver 3", "schoppen 3", "ruiten 3", "harten 3", "klaver 4", "schoppen 4", "ruiten 4", "harten 4", "klaver 5", "schoppen 5", "ruiten 5", "harten 5", "klaver 6", "schoppen 6", "ruiten 6", "harten 6", "klaver 7", "schoppen 7", "ruiten 7", "harten 7", "klaver 8", "schoppen 8", "ruiten 8", "harten 8", "klaver 9", "schoppen 9", "ruiten 9", "harten 9", "klaver 10", "schoppen 10", "ruiten 10", "harten 10", "klaver boer", "schoppen boer" , "ruiten boer", "harten boer", "klaver vrouw", "schoppen vrouw", "ruiten vrouw", "harten vrouw", "klaver heer", "schoppen heer", "ruiten heer", "harten heer"};
    String[] element = {"aas", "2", "3", "4", "5", "6", "7", "8", "9", "10", "B", "V", "H"};
    String[] symbool = {"Klaver ", "Schoppen ", "Ruiten ", "Harten "};

    String[] piet = new String[13];
    String[] klaas = new String[13];
    String[] stan = new String[13];
    String[] kees = new String[13];

    String[] kaarten = new String[52];

    //piet = new String[13];
    //klaas = new String[13];
    //stan = new String[13];
    //kees = new String[13];

    Random rand;

    @Override
    public void init() {
        rand = new Random();

        int teller = 0;
        for (int i = 0; i < element.length; i++) {
            for (int j = 0; j < symbool.length; j++) {
                kaarten[teller] = symbool[j] + element[i];
                teller ++;
            }
        }

        for (int i = 0; i < 13; i++) {
            piet[i] = deelKaart();
            klaas[i] = deelKaart();
            stan[i] = deelKaart();
            kees[i] = deelKaart();

        }

 //       for (teller = 0; teller < piet.length; teller++) {
 //           piet[teller] = deelKaart();
 //       }
 //       for (teller = 0; teller < klaas.length; teller++) {
 //           klaas[teller] = deelKaart();
 //       }
 //       for (teller = 0; teller < stan.length; teller++) {
 //           stan[teller] = deelKaart();
 //       }
 //       for (teller = 0; teller < kees.length; teller++) {
 //           kees[teller] = deelKaart();
 //       }


    }


    private String deelKaart() {
        int random = rand.nextInt(kaarten.length);
        String kaart = kaarten[random];


        String[] hulpLijst = new String[kaarten.length - 1];

        int hulpindex = 0;

        for (int i = 0; i < kaarten.length; i++) {
            if (i != random) {
                hulpLijst[hulpindex] = kaarten[i];
                hulpindex++;
            }
        }

        kaarten = hulpLijst;

        return kaart;
    }


    @Override
    public void paint(Graphics g) {
        g.drawString("piet ", 20, 10);
        g.drawString("klaas ", 120, 10);
        g.drawString("stan ", 220, 10);
        g.drawString("kees ", 320, 10);

        for (int teller = 0; teller < 13; teller++) {
            int y = 40 + teller * 20;
            g.drawString(piet[teller],20, y );
            g.drawString(klaas[teller],120, y );
            g.drawString(stan[teller],220, y );
            g.drawString(kees[teller],320, y );
        }
    }

}
