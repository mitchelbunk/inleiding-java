package h06;

import java.awt.*;

import java.applet.*;

public class h06Praktijkopdracht extends Applet{
    double cijfer1, cijfer2, cijfer3, gemiddelde, correctie1, correctie3, correctie4;
    int correctie2;


    public void init() {
        cijfer1 = 5.9;
        cijfer2 = 6.3;
        cijfer3 = 6.9;
        gemiddelde = (cijfer1 + cijfer2 + cijfer3) / 3;
        correctie1 = gemiddelde * 10;
        correctie2 = 63;
        correctie3 = 63;
        correctie4 = correctie3 / 10;
    }

    public void paint(Graphics g) {
        g.drawString("cijfer 1: " + cijfer1, 50, 50);
        g.drawString("cijfer 2: " + cijfer2, 50, 100);
        g.drawString("cijfer 3: " + cijfer3, 50, 150);
        g.drawString("Het gemiddelde is: " + correctie4, 50, 300);

    }
}
