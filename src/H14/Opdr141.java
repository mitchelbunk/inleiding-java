package H14;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Opdr141 extends Applet {
    String[] symbolen = {"klaver", "ruiten", "schoppen", "harten"};
    String[] waarden = {"aas", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Boer", "vrouw", "Heer" };
    String s;
    int indexSymbool, cijfer;
    double r;
    Button kaartenTrekker;
    Label label;

    @Override
    public void init() {
        label = new Label();
        label.setLocation(100, 100);
        label.setSize(10, 50);
        add(label);

        s = "";

//        symbolen = Math.random();
        r = Math.random();
        indexSymbool = (int)(r * 4);

        r = Math.random();
        cijfer = (int)(r * 13);

        kaartenTrekker = new Button("Kies een kaart");
        add(kaartenTrekker);

        //kaartenTrekker = new CardListener(new ActionListener);
        kaartenTrekker.addActionListener(new CardListener());



        setBackground(new Color(0x494949));
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(s, 50, 100);

    }
    class CardListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            s = "Card["+ indexSymbool + "]:" + symbolen[indexSymbool] + " nummer: " + waarden[cijfer];
            //s = label.getText();

            r = Math.random();
            indexSymbool = (int)(r * 4);

            r = Math.random();
            cijfer = (int)(r * 13);


            System.out.println("Card["+ indexSymbool + "]:" + symbolen[indexSymbool]);
            System.out.println(waarden[cijfer]);

            repaint();
        }
    }
}
