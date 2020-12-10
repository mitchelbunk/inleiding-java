package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class opdr101new extends Applet {

    Button rekenknop;

    TextField vergelijkvak;

    Label getal1;

    double btw;






    public void init() {


        rekenknop = new Button("reken uit");
        add(rekenknop);

        vergelijkvak= new TextField("hoogste getal", 50);
        add(vergelijkvak);

        getal1= new Label("bedrag + btw");
        add(getal1);

        rekenknop.addActionListener(new Knop1Listener());

        setBackground(Color.black);


        btw = 1.21;


    }

    public void paint(Graphics g){
        rekenknop.setLocation(100, 20);
        rekenknop.setLabel("Ok");
        rekenknop.setSize(40, 40);

        getal1.setLocation(20, 150);
        getal1.setSize(300, 40);

        vergelijkvak.setLocation(20, 20);



    }
    class Knop1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String message = vergelijkvak.getText();
            double bedragbtw = Double.parseDouble(message);

            repaint();


        }

    }
}
