package H12;

import java.applet.Applet;
import java.awt.*;

public class Opdr122 extends Applet {
    int[] knop;
    int teller;

    @Override
    public void init() {
        knop = new int[25];
        for (int teller = 1; teller <= knop.length; teller++) {
            Button ok;
            ok = new Button("knop " + teller);
            add(ok);
        }
    }

    @Override
    public void paint(Graphics g) {
        setBackground(new Color(45, 191, 154, 255));

    }
}
