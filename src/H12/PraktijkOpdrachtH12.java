package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdrachtH12 extends Applet {
    String [] nummers;
    String [] namen;
    TextField tekstvak1;
    TextField tekstvak2;
    Button knop;
    int teller;



    @Override
    public void init() {
        teller = 0;


        knop = new Button("OK");
        add(knop);


        tekstvak1 = new TextField("", 20);
        add(tekstvak1);
        tekstvak1.addActionListener(new KnopListener());

        tekstvak2 = new TextField("", 20);
        add(tekstvak2);


    }

    @Override
    public void paint(Graphics g) {
        g.drawString("voer een telefoonnummer en naam in en druk op OK", 50, 25);
        knop.setLocation(150, 50);
        tekstvak1.setLocation(50, 100);
        tekstvak2.setLocation(50, 150);
    }
    class KnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            namen[teller] = tekstvak1;
            nummers[teller] = tekstvak2;
            teller++;
        }
    }
}
