package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Opdr103 extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst1, tekst2, tekst3;
    int dag;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type het dagnummer en druk op enter");
        tekstvak.addActionListener( new CMDListener());
        tekst1 = "";
        tekst2 = "";
        tekst3 = "";
        add(label);
        add(tekstvak);

    }
    public void paint(Graphics g){
        g.drawString(tekst1, 50, 60);
        g.drawString(tekst2, 50, 120);
        g.drawString(tekst3, 50, 180);

    }

    class CMDListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            dag = Integer.parseInt( s);
            switch(dag) {
                case 1:
                    tekst1 = "Januari";
                    tekst2 = "31 dagen";
                    break;
                case 2:
                    tekst1 = "Februari";
                    tekst2 = "28 dagen";
                    break;
                case 3:
                    tekst1 = "Maart";
                    tekst2 = "31";
                    break;
                case 4:
                    tekst1 = "April";
                    tekst2 = "30 dagen";
                    break;
                case 5:
                    tekst1 = "Mei";
                    tekst2 = "31 dagen";
                    break;
                case 6:
                    tekst1 = "Juni";
                    tekst2 = "30 dagen";
                    break;
                case 7:
                    tekst1 = "Juli";
                    tekst2 = "31 dagen";
                    break;
                case 8:
                    tekst1 = "Augustus";
                    tekst2 = "31 dagen";
                    break;
                case 9:
                    tekst1 = "September";
                    tekst2 = "30 dagen";
                    break;
                case 10:
                    tekst1 = "Oktober";
                    tekst2 = "31 dagen";
                    break;
                case 11:
                    tekst1 = "November";
                    tekst2 = "30 dagen";
                    break;
                case 12:
                    tekst1 = "December";
                    tekst2 = "31 dagen";
                    break;
                default:
                    tekst3 = "terug naar de basisschool YEEEEEEEEEEEEEET";
                    break;

            }
            repaint();

        }
    }
}
