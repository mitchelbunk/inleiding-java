package h10;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;


public class Opdr105 extends Applet {
    Color achtergrondKleur;

    static TextField tekstvak1;

    double gemiddelde, totaal, aantal;

    Button nakijker;

    String Stringtekst;


    public void init() {
        achtergrondKleur = new Color(90, 215, 165, 216);
        setBackground(achtergrondKleur);

        if (aantal == 0) {
        }
        else
        {        gemiddelde = totaal / aantal;}


        Stringtekst = "";

        //tekstvak
        tekstvak1 = new TextField();
        add(tekstvak1);
        tekstvak1.addActionListener(new CijferListener());

        //knop
        nakijker = new Button("Ok");
        add(nakijker);
        nakijker.addActionListener(new CijferListener());
    }


    public void paint(Graphics g) {
        g.drawString(Stringtekst, 100, 130);

        //tekstvak
        tekstvak1.setLocation(50, 150);
        tekstvak1.setSize(150, 20);

        //knop opties
        nakijker.setLocation(175, 90);
        nakijker.setSize(50, 25);
    }


    class CijferListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            aantal = aantal + 1;

            System.out.println("test" + aantal);

            String Cijfer = tekstvak1.getText();

            switch (Cijfer) {
                case "10" :
                case "9" :
                case "8" :
                case "7" :
                case "6" :
                    Stringtekst = "Geslaagd, je gemiddelde is:  " + gemiddelde ;
                    break;
                case "5" :
                case "4" :
                case "3" :
                case "2" :
                case "1" :
                    Stringtekst = "niet geslaagd, je gemiddelde is: " + gemiddelde ;
                    break;
                default: Stringtekst = "ongeldig cijfer, voer een geldig cijfer in";
            }
            repaint();
        }
    }
}

