package CreativeMe;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Idea1 extends Applet {
    String tekst, resultaat;

    TextField tekstvak;

    Button okKnop, gemiddeldeKnop;

    double input, totaal, aantal, gemiddelde;

    public void init() {
        tekstvak = new TextField("", 50);
        add(tekstvak);
 //       tekstvak.addActionListener(new Listener3());


        okKnop = new Button("ok");
        add(okKnop);
        okKnop.addActionListener(new Listener1());

        gemiddeldeKnop = new Button("Bereken gemiddelde");
        add(gemiddeldeKnop);
        gemiddeldeKnop.addActionListener(new Listener2());
    }

    public void paint(Graphics g) {
        setBackground(new Color(108, 74, 22, 255));

        tekstvak.setLocation(25, 100);
        tekstvak.setSize(150, 20);

        okKnop.setLocation(25, 50);
        okKnop.setSize(80, 20);

        gemiddeldeKnop.setLocation(25, 150);
        gemiddeldeKnop.setSize(80, 20);

        g.drawString(resultaat, 75, 20);


    }

    class Listener1 implements ActionListener{
        public void actionPerformed(ActionEvent e) {

            input = Double.parseDouble(tekstvak.getText());
            aantal++;
            totaal = totaal + input;
            gemiddelde = totaal / aantal;

            System.out.println("Klik");
            System.out.println(totaal);
            System.out.println(aantal);
            System.out.println(gemiddelde);

                     if ( gemiddelde < 55 )
                     { tekst ="U Bent gezakt";}
            else
        {tekst = "u bent geslaagd";}
            System.out.println(tekst);

                repaint();
        }



    }

    




    class Listener2 implements ActionListener{
        public void actionPerformed(ActionEvent e) {
               resultaat = "Het gemiddelde is " + gemiddelde + " " + tekst;
            System.out.println(resultaat);

//            g.drawString
//                    ("Het gemiddelde: "
//                            + gemiddelde
//                          + "  "
//                            + tekst)

                            // s drawstring
            //                + if (gemiddelde < 55)
              //                { "U Bent gezakt";}
          //                      else {"u bent geslaagd"}

//                                , 100, 150);}}




         //   class Listener3 implements ActionListener{
           //     public void actionPerformed(ActionEvent e) {
             //       //s drawstring


// ;}

 } } }
 //   }}