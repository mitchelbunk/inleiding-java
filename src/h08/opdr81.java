package h08;

import java.awt.*;

import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdr81 extends Applet{

    Button Knop1;
    Button Knop2;

    TextField voorbeeldTekstvak;

    Label stickertje;

    Color backgroundColor;



    public void init() {

        Knop1 = new Button("Ok");
        add(Knop1);

        Knop2 = new Button("Reset");
        add(Knop2);


        voorbeeldTekstvak = new TextField("", 30);
        add(voorbeeldTekstvak);


        backgroundColor = (new Color(52, 194, 88, 255));
        setSize(400, 400);


        Knop1.addActionListener(new Knop1Listener());

        Knop2.addActionListener(new Knop2Listener());


        stickertje = new Label("Ik ben een label");
        add(stickertje);





    }

    public void paint(Graphics g) {
        //is in de applet te zien
        Knop1.setLocation(20, 20);
        Knop1.setLabel("Ok");
        Knop1.setSize(300, 40);


        Knop2.setLocation(350, 20);
        Knop2.setSize(300, 40);
        Knop2.setLabel("Reset");


        voorbeeldTekstvak.setLocation(20, 60);

        voorbeeldTekstvak.setSize(300, 40);

        stickertje.setLocation(20, 150);
        stickertje.setSize(300, 40);





        setBackground(backgroundColor);

    }
    class Knop1Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            //is in de broncode te zien


            String message = voorbeeldTekstvak.getText();
            Knop1.setLabel(message);
            stickertje.setText(message);
            backgroundColor = new Color(55, 255, 0, 164);

            repaint();


        }
    }

    class Knop2Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            Knop2.setLabel("");
            stickertje.setText("");
            backgroundColor = new Color(255, 0, 0, 181);
            repaint();


        }
    }

}
