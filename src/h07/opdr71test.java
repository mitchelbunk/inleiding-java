package h07;

import java.awt.*;

import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdr71test extends Applet {
    TextField tekstvak;
    Label label;
    Button knop1;
    Button knop2;

    public void init() {
        KnopListener kl = new KnopListener();

        label = new Label("Type iets in het tekstvakje");
        add(label);

        tekstvak = new TextField("Type iets in mij", 20);
        add(tekstvak);

        knop1 = new Button("knop 1: ok");
        knop1.addActionListener(kl);
        add(knop1);


        knop2 = new Button("knop 2: reset");
        knop2.addActionListener(kl);
        add(knop2);

    }

    public void paint(Graphics g) {

    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("Jammer, " + "maar nu staat er iets anders");
            repaint();

        }
    }
}