package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Voorbeeld102 extends Applet {
    int leeftijd, hoogGetal;
    TextField tekstVak;
    Label label;
    String tekst;


    public void init() {
        tekstVak = new TextField("", 5);
        tekstVak.addActionListener(new VakListener());
        tekst = "";

        label = new Label("voer hier een nummer in");

        add( label );
        add(tekstVak);
    }
    public void paint(Graphics g)
    {
        g.drawString(tekst, 50, 45 );

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

            repaint();
        }
    }
}
