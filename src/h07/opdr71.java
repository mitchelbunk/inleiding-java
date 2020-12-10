package h07;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class opdr71 extends Applet{
    Button knop1;
    Button knop2;

    String schermtekst1;
    String schermtekst2;

    TextField tekstvak1;

    public void init() {
        //knoppen
        KnopListener kl = new KnopListener();

        tekstvak1 = new TextField("klik op mij", 50);
        schermtekst1 = "Ja, deze knop wel iets?1";
        knop1 = new Button("Ok");
        knop1.addActionListener( kl );
        add(knop1);

        tekstvak1 = new TextField("klik op mij", 50);
        schermtekst2 = "Ja, deze knop wel iets?1";
        knop2 = new Button("Reset");
        knop2.addActionListener(kl);
        add (knop2);

        //labellen.

    }

    public void paint(Graphics g) {
        g.drawString(schermtekst2, 100, 100);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            schermtekst1 = "/Doet deze knop wel iets?1";
            repaint();
            schermtekst2 = "Doet deze knop wel iets?2";
            repaint();
        }
    }
}