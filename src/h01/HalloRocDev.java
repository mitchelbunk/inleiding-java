package h01;

import java.awt.*;
import java.applet.*;
/**
 * Created by piet on 31-08-16.
 */
public class HalloRocDev extends Applet{

    public static void main(String[] args) {
        System.out.println("Hallo cohort 0");
    }

    public void init() {
        setBackground(Color.magenta);
    }
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("welcome to Java!!", 50, 60 );
        g.drawString("welcome to Java!!",100,60);



        //tot hier :)
    }}
