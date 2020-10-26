package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdrachtH11 extends Applet {
    int x = 50;
    private int y = 30;
    private int tafel = 3;
    private TextField tf;
    private Font font = new Font("default", Font.BOLD, 20);
    private Boolean aanuit;

    @Override
    public void init() {
        super.init();
        TafelListener tl = new TafelListener();
        tf = new TextField("", 5);
        tf.addActionListener((tl));
        Label label = new Label("Voer een tafel in");
        Button ok = new Button("OK");
        ok.addActionListener((tl));

        add(label);
        add(tf);
        add(ok);

        NogGeenTafelListener ntl = new NogGeenTafelListener();
        Button next = new Button("Next");
        next.addActionListener((ntl));

        add(next);
    }

    private class TafelListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            tafel = Integer.valueOf(tf.getText());
            tf.setText("");
            aanuit = true;
            repaint();
        }
    }

    private class NogGeenTafelListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            tafel++;
            repaint();
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        if (aanuit) {
            for (int teller=1; teller <= 10; teller++) {
                y += 20;


                int antwoord = tafel * teller;
                g.setFont(font);
                g.drawString(teller + " x " + tafel + " = " + antwoord, x, y);


            }
            y=30;
        }
    }
}
