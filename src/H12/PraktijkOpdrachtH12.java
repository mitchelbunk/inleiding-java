package H12;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;


public class PraktijkOpdrachtH12 extends Applet {
    String [] telefoonnummer;
    String [] naam;
    TextField naamvak;
    TextField nummervak;
    Button knop, overzichtKnop;
    int teller;





    public void init() {
        knop = new Button("OK");
        add(knop);
        knop.addActionListener(new KnopListener1());

        overzichtKnop = new Button("telefoonlijst");
        add(overzichtKnop);
        overzichtKnop.addActionListener(new KnopListener2());

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
        for (int teller = 0; teller < naam.length; teller++) {


        }


    }

    class KnopListener1 implements ActionListener{
        public void actionPerformed( ActionEvent e) {
          //  for (int teller = 0; teller < 9; teller++) {

                 naam[teller] = naamvak.getText();
                telefoonnummer[teller] = nummervak.getText();
                System.out.println(naam[teller]);
          //  }
        }
    }
    class KnopListener2 implements ActionListener{
        public void actionPerformed(ActionEvent e) {
        //print array via loop

            //for 0-9
            //prntln naam lcatie 50,100+25xteller; print nummer locatie 250,100+25xteller
        }
    }
}
