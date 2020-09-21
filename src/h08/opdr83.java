package h08;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class opdr83 extends Applet {

    Button rekenknop;

    TextField prijsvakje;

    Label PrijsInclusiefBTW;

    double prijs;

    double btw;

    double bedragMetBTW;




    public void init() {


        rekenknop = new Button("reken uit");
        add(rekenknop);

        prijsvakje = new TextField("prijsvakje", 50);
        add(prijsvakje);

        PrijsInclusiefBTW = new Label("bedrag + btw");
        add(PrijsInclusiefBTW);

        rekenknop.addActionListener(new Knop1Listener());

        setBackground(Color.black);

        prijs = 10;

        btw = 1.21;

        bedragMetBTW = prijs * btw;

    }

    public void paint(){
        rekenknop.setLocation(20, 20);
        rekenknop.setLabel("Ok");
        rekenknop.setSize(300, 40);

        PrijsInclusiefBTW.setLocation(20, 150);
        PrijsInclusiefBTW.setSize(300, 40);

        prijsvakje.setLocation(20, 20);



    }
    class Knop1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String message = prijsvakje.getText();
            rekenknop.setLabel("reken uit");
            PrijsInclusiefBTW.setText(message);

            repaint();


        }
    }
}
