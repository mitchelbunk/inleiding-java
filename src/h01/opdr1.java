package h01;
import java.awt.*;
import java.applet.*;
public class opdr1 extends Applet {
    public void init() {
        setBackground(Color.green);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Welcome to Java!!", 50, 60);
    }
}
