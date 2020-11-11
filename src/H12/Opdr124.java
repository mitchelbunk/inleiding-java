package H12;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Zoeken in een tabel

public class Opdr124 extends Applet {
    boolean gevonden, einde;
    double[] salaris = { 100.0, 200.0, 500.0, 400.0, 300.0 };
    double gezocht;
    TextField tekstvak;
    Button knop;



    @Override
    public void init() {

        tekstvak = new TextField();
        add(tekstvak);
        tekstvak.addActionListener(new TekstvakListener());

        knop = new Button("ok");
        add(knop);
        knop.addActionListener(new KnopListener());
        /*
        de bedoeling is: de gebruiker kan de gezochte waarde invoeren
        bv via gettext

        ff proberen hier
        */
        // toString(gezocht)




        gezocht = 600;
        gevonden = false;
        einde = false;
        int teller = 0;

        while (teller < salaris.length) {
            if (salaris[teller] == gezocht){
                gevonden = true;
            }
            teller++;
        }
        // voor 12.5

        // vervangen met eindige loop zoals
        // for teller < salarislength--1 if  sal = gezochtF
    }


    @Override
    public void paint(Graphics g) {
        if (gevonden = true) {
            g.drawString("De waarde is gevonden.", 20, 50);
        }
        else {
            g.drawString("De waarde is niet gevonden.", 20, 50);
        }

    }
    class TekstvakListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String message = tekstvak.getText();
                    double gevonden = Double.parseDouble(message);
        }
    }
    class KnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            double gezocht = Double.parseDouble(s);

        }
    }
}
