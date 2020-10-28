package CreativeMe;

import java.applet.*;
import java.awt.*;

public class RuitjesPapier extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int y = 0;
        int x = 0;

        for(teller = 0; teller < 1000; teller++) {
            y += 10;
            g.drawRect(0 , y, 3000, y );
        }

        for(teller = 0; teller < 1000; teller++) {
            x += 10;
            g.drawRect(x, 0, x, 3000 );
        }

    }

}
