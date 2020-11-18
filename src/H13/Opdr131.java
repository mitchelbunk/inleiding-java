package H13;

import java.applet.Applet;
import java.awt.*;

public class Opdr131 extends Applet {

    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        // lijn A naar B
        g.drawLine(10, 11, 20, 22);
        // lijn B naar C
        g.drawLine(20, 22, 30, 40);
        //lijn C naar A
        g.drawLine(30, 40, 10, 11);
    }
    void tekenDriehoek (Graphics g, int xA, int yA, int xB, int yB, int xC, int yC){

    }
}
