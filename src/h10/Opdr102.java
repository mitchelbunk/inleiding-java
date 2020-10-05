package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Opdr102 extends Applet {
    int leeftijd, hoogGetal;
    int laagGetal = 200;
    TextField tekstVak;
    Label label;
    String tekst, tekst2;


    public void init() {
        tekstVak = new TextField("", 5);
        tekstVak.addActionListener(new VakListener());
        tekst = "";
        tekst2 = "";

        label = new Label("voer hier een nummer in");

        add( label );
        add(tekstVak);
    }
    public void paint(Graphics g)
    {
        g.drawString(tekst, 50, 45 );
        g.drawString(tekst2, 50, 90);

        setBackground(new Color(110, 167, 36, 255));
    }

    class VakListener implements ActionListener {
        public void actionPerformed(ActionEvent e)
        {
            String s;

            s = tekstVak.getText();
            leeftijd = Integer.parseInt( s );

            if ( leeftijd > hoogGetal) {
                hoogGetal = leeftijd;
                tekst = "hoogste getal = " + hoogGetal;
            }
            if (leeftijd < laagGetal) {
                laagGetal = leeftijd;
                tekst2 = "laagste getal = " + laagGetal;
            }

            repaint();
        }
    }
}
