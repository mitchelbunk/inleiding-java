package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr124 extends Applet {
    boolean gevonden;
    double[] salaris = {100.0, 200.0, 500.0, 400.0, 300.0, 500.0};
    int getal;
    double gezocht;
    TextField tekstvak;
    Button knop;


    @Override
    public void init() {

        tekstvak = new TextField();
        add(tekstvak);
        tekstvak.addActionListener(new KnopListener());

        knop = new Button("ok");
        add(knop);
        knop.addActionListener(new KnopListener());

        gevonden = false;
    }


    @Override
    public void paint(Graphics g) {
        setBackground(new Color(0x4B8D45));

        tekstvak.setLocation(200, 50);
        tekstvak.setSize(100, 20);

        knop.setSize(50, 25);

        if (gevonden == true) {
            g.drawString("De waarde is gevonden. " + getal, 20, 50);
        } else {
            g.drawString("De waarde is niet gevonden.", 20, 50);
        }

        setSize(500, 500);

    }

    class KnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            double gezocht = Double.parseDouble(s);
            gevonden = false;

            int teller = 0;
            while (teller < salaris.length) {

                if (salaris[teller] == gezocht) {
                    getal = teller;
                    gevonden = true;
                    break;
                }
                teller++;
            }
    repaint();
        }
    }

}