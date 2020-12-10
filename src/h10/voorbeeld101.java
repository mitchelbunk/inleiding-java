package h10;

import java.applet.Applet;
import java.awt.*;

public class voorbeeld101 extends Applet
{
    public void init()
    {}

    public void paint(Graphics g)
    {
        g.drawString("" + 4 + " is groter dan " + 5 + ": " + (8 > 5), 50, 60 );
        g.drawString("" + 4 + " is kleiner dan " + 5 + ": " + (8 < 5), 50, 80 );
    }
}
