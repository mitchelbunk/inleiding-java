package h10;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Opdr104 extends Applet {
    TextField tekstVakje1, tekstVakje2;
    Label label1;
    String tekst1, tekst2, tekst3, tekst4, tekst5;
    int maandNummer, jaartal;

    public void init() {
        tekstVakje1 = new TextField("", 40);
        tekstVakje1.addActionListener( new Case1Listener());
        repaint();

        label1 = new Label("Type eerts het jaar onderin in en dan het maandnummer bovenin");

        tekstVakje2 = new TextField("", 40);
        tekstVakje2.addActionListener( new Case2Listener());
        repaint();


        tekst1 = "";
        tekst2 = "";
        tekst3 = "";
        tekst4 = "";
        tekst5 = "";

        add(label1);


        add(tekstVakje1);
        add(tekstVakje2);

    }
    public void paint(Graphics g){


        g.drawString(tekst1, 50, 60);
        g.drawString(tekst2, 50, 120);
        g.drawString(tekst3, 50, 180);
        g.drawString(tekst4, 50, 240);


        tekstVakje1.setLocation(800, 40);
        tekstVakje2.setLocation(800, 80);

        label1.setLocation(200, 40);
        label1.setSize(400, 50);

        setBackground(new Color(55, 117, 121, 255));



    }
    class Case2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstVakje2.getText();
            jaartal = Integer.parseInt( s);

            if ((jaartal % 4 == 0 && (!(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0)) {
                tekst4 = "" + jaartal + " is een schrikkeljaar";
            }
            else {
                tekst4 = ""+ jaartal + " is geen schrikkeljaar";
            }
            if (maandNummer == 2) {
                tekst1 = "Februari";

                if (jaartal % 4 == 0 && (!(jaartal % 100 == 0)) ||
                        jaartal % 400 == 0) {
                    tekst2 = "29 dagen";
                } else {
                    tekst2 = "28 dagen";
                }
            }

            repaint();
        }

    }

    class Case1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstVakje1.getText();
            maandNummer = Integer.parseInt(s);


            switch (maandNummer) {
                case 1:
                    tekst1 = "Januari";
                    tekst2 = "31 dagen";
                    break;
                case 2:
                    tekst1 = "Februari";
                    if (jaartal % 4 == 0 && (!(jaartal % 100 == 0)) ||
                        jaartal % 400 == 0 ) {
                    tekst2 = "29 dagen";}
                    else {
                        tekst2 = "28 dagen";
                    }


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

