package h07;

import java.awt.*;

import java.applet.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

public class voorbeeld86 extends Applet{
    TextField tekstvak;
    Button knop1;

    public void init() {
        tekstvak = new TextField("", 30);
        knop1 = new Button("Ok");
        knop1.addActionListener( new KnopListener() );
        add(knop1);
        add(tekstvak);

    }

    public void paint(Graphics g) {
        g.drawString("Type een hele lange tekst " + "in het tekstvakje " + "en klik op Ok", 50, 60);
    }
    class KnopListener implements ActionListener        {
        public void actionPerformed( ActionEvent e ) {
            tekstvak.setText("Jammer, " + "maar nu staat er iets anders");
        repaint();
        }
    }
}
