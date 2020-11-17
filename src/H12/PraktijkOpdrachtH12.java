package H12;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;


public class PraktijkOpdrachtH12 extends Applet {
    String [] nummers;
    String [] namen;
    TextField tekstvak1;
    TextField tekstvak2;
    Button knop;



    @Override
    public void init() {





        knop = new Button("OK");
        add(knop);
        knop.addActionListener(new KnopListener());

        tekstvak1 = new TextField("", 20);
        add(tekstvak1);


        tekstvak2 = new TextField("", 20);
        add(tekstvak2);


    }

    @Override
    public void paint(Graphics g) {
        g.drawString("voer een telefoonnummer en naam in en druk op OK", 50, 25);
        knop.setLocation(150, 50);
        tekstvak1.setLocation(50, 100);
        tekstvak2.setLocation(50, 250);
    }

    class KnopListener implements ActionListener{
        public void actionPerformed( ActionEvent e) {
            for (int teller = 0; teller < 9; teller++) {


                namen[teller] = tekstvak1.getText();
                nummers[teller] = tekstvak2.getText();

                System.out.println(teller);
            }
        }
    }
}
