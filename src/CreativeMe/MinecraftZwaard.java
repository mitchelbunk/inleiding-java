package CreativeMe;

import java.applet.*;
import java.awt.*;

public class MinecraftZwaard extends Applet {
    int breedte, hoogte;


    public void init() {
        breedte = 40;
        hoogte = 40;
    }


    public void paint(Graphics g) {

        for (int i = 0; i < 7; i++) {
            g.drawRect(0 + i * breedte, 0 + i * hoogte, breedte, hoogte);

        }

    }
}
