package CreativeMe;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;

public class Experiment2MetArrays extends Applet {
    JPanel windowContent;
    JTextField displayField;
    JButton buttons[];
    JButton buttonPoint;
    JButton buttonAdd;
    JButton buttonEqual;
    JPanel pl;



    Experiment2MetArrays() {
        windowContent = new JPanel();
        buttons = new JButton[10];

        BorderLayout bl = new BorderLayout();
        windowContent.setLayout(bl);

        displayField = new JTextField(30);
        windowContent.add("North", displayField);

        for (int i = 0; i < 10; i++) {
            buttons[i] = new JButton(String.valueOf(1));
            System.out.println(i);
        }
        buttonAdd = new JButton("+");
        buttonPoint = new JButton(".");
        buttonEqual = new JButton("=");

        pl = new JPanel();
        GridLayout gl = new GridLayout(4, 3);
        pl.setLayout(gl);

        for (int i = 0; i < 10; i++) {
            pl.add(buttonAdd);
            pl.add(buttonPoint);
            pl.add(buttonEqual);

            windowContent.add("Center", pl);

            JFrame frame = new JFrame("");
            frame.setContentPane(windowContent);

            frame.pack();

            frame.setVisible(true);

        }

    }




    public static void main(String[] args) {
        Experiment2MetArrays calc = new Experiment2MetArrays();

        JButton[] buttons = new JButton[10];

        buttons[0] = new JButton("0");

        System.out.println(buttons[0].getText());

    }


}


