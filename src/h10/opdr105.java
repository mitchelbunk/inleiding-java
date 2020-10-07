package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdr105 extends Applet {
    TextField tekstvak1;
    Double totaal, aantal, gemiddelde;
    Label label1;


    public void init() {
        tekstvak1 = new TextField("hello world", 40);
        tekstvak1.addActionListener(new CijferListener());
        add(tekstvak1);

        label1 = new Label();
        add(label1);
    }


    public void paint(Graphics g)
    {
        setBackground(new Color(0, 255, 234, 255));

        label1.setLocation(25, 200);
        label1.setSize(250, 20);

        tekstvak1.setLocation(25, 100);
    }


    class CijferListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {

            //TODO if statement maken waar gemiddelde wordt berekend en wordt aangegeven of het cijfer voldoende of onvoldoende is.

        }
    }
}

