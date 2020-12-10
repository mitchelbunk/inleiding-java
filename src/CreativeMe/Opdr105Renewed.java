package CreativeMe;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Opdr105Renewed extends Applet {
    TextField tekstvak1;

    double aantal, gemiddelde, totaal, input;

    Button okKnop;

    public void init() {
 //       totaal = totaal + input;
 //       gemiddelde = ;
 //       aantal = ;
 //       input = ;

//        okKnop = new Button("ok");
//        add(okKnop);
//        okKnop.addActionListener(new CijferListener());

        tekstvak1 = new TextField(""+input, 50);
        add(tekstvak1);
  //      tekstvak.addActionListener(new CijferListener());



String s = tekstvak1.getText();
        input = Double.parseDouble( s );
        if(input > 10 && input < 100) {
            totaal = totaal + input;
            aantal++;}
        System.out.println(input);
        System.out.println(tekstvak1);
        repaint();
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak1.getText();
            input = Double.parseDouble(s);
            if (input > 10 && input < 100) {
                totaal = totaal + input;
                aantal++;
            }
            System.out.println(input);
            System.out.println(tekstvak1);
            repaint();

            //   public void paint(Graphics g) {

            //     setBackground(new Color(115, 20, 70, 255));

        }


        //  class CijferListener implements ActionListener{
        //    public void actionPerformed(ActionEvent e) {


    }
}


