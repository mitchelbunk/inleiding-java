package h02;
import java.awt.*;
import java.applet.*;
public class opdr2 extends Applet{
    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Mitchel Bunk!!", 50, 60 );
    }
}