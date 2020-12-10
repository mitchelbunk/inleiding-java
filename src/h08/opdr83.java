package h08;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class opdr83 extends Applet {

    Button rekenknop;

    TextField prijsvakje;

    Label PrijsInclusiefBTW;

    double btw;

    int getal1;



    public void init() {


        rekenknop = new Button("reken uit");
        add(rekenknop);

        prijsvakje = new TextField("prijsvakje", 50);
        add(prijsvakje);

        PrijsInclusiefBTW = new Label("bedrag + btw");
        add(PrijsInclusiefBTW);

        rekenknop.addActionListener(new Knop1Listener());

        setBackground(Color.gray);


        btw = 1.21;

        getal1 = 16;


    }

    public void paint(Graphics g){
        rekenknop.setLocation(100, 20);
        rekenknop.setLabel("Ok");
        rekenknop.setSize(40, 40);

        PrijsInclusiefBTW.setLocation(20, 150);
        PrijsInclusiefBTW.setSize(300, 40);

        prijsvakje.setLocation(20, 20);





    }
    class Knop1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String message = prijsvakje.getText();
            double bedragbtw = Double.parseDouble(message);
            bedragbtw *= btw;
            PrijsInclusiefBTW.setText(bedragbtw + "");


            repaint();


        }

    }
}






