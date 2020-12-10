package H12;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;


public class PraktijkOpdrachtH12 extends Applet {
    String [] telefoonnummer;
    String [] naam;
    TextField naamvak, nummervak;
    Button knop = new Button();
    int teller;
    boolean volleArray = false;





    public void init() {
        add(knop);
        knop.addActionListener(new KnopListener1());

        naamvak = new TextField("", 20);
        add(naamvak);


        nummervak = new TextField("", 20);
        add(nummervak);


        naam = new String[10];
        telefoonnummer = new String[10];

        teller = 0;
    }


    public void paint(Graphics g) {
        g.drawString("voer een naam en telefoonnummer in en druk op OK", 50, 25);
        knop.setLocation(150, 50);
        naamvak.setLocation(50, 100);
        nummervak.setLocation(250, 100);


        setSize(500, 600);


        if (volleArray){
            for (int i = 0; i < 10; i++) {
                g.drawString("" + naam[i] + telefoonnummer[i], 75, 25 * i + 150);
            }
        }


    }

    class KnopListener1 implements ActionListener{
        public void actionPerformed( ActionEvent e) {
            if (teller >= 10){
                volleArray = true;
            }
            else{
                String s = "Jantje                                                                             ";
                String t = "0618327648";
                naam[teller] = s;
                telefoonnummer[teller] = String.valueOf(Integer.parseInt(t));
                teller++;
            }
            repaint();
        }
    }
}