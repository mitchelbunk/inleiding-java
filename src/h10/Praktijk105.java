package h10;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Praktijk105 extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    int dag;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type het cijfer en druk op enter");
        tekstvak.addActionListener( new TekstvakListener());
        tekst = "";
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60);
    }

    class TekstvakListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            dag = Integer.parseInt( s);
            switch (dag) {
                case 1:
                case 2:
                case 3:
                    tekst = "slecht";
                    break;
                case 4:
                    tekst = "onvoldoende";
                    break;
                case 5:
                    tekst = "matig";
                    break;
                case 6:
                case 7:
                    tekst = "voldoende";
                    break;
                case 8:
                case 9:
                case 10:
                    tekst = "goed";
                    break;
            }
            repaint();
            }
        }
    }
