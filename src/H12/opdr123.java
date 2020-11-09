package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class opdr123 extends Applet {

    TextField tekstvak [];
    Button knop;

    public void init() {
        tekstvak = new TextField[5];
        int teller;
        for (teller = 0; teller < tekstvak.length; teller++){
            tekstvak[teller] = new TextField();
            add(tekstvak[teller]);
        }

        knop = new Button("ok");
        add(knop);
        knop.addActionListener(new KnopListener());
    }

    public void paint(Graphics g) {

    }

    class KnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            int[] s = new int[5];
            int i;
            for (i = 0; i < tekstvak.length; i++){
                s[i] = Integer.parseInt(tekstvak[i].getText());
            }
            Arrays.sort(s);

            for (i = 0; i < tekstvak.length; i++){
                tekstvak[i].setText(s[i] + "");
            }

        }
    }

}
