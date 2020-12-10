package h07;

import java.awt.*;

import java.applet.*;

public class voorbeeld84 extends Applet{
    TextField tekstvlak;
    Label label;

    public void init() {
        tekstvlak = new TextField("Klik op mij", 20);
        label = new Label("Type iets in het tekstvakje");
        add(label);
        add(tekstvlak);
    }

    public void paint(Graphics g) {}

}
