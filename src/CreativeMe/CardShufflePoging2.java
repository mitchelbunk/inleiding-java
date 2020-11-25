package CreativeMe;


import java.applet.Applet;
import java.awt.*;

public class CardShufflePoging2 extends Applet {

    String [][] kaartendek = new String[][]{
            {"klaver", "schoppen", "ruiten", "harten"},

            {"Aas", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Boer", "Vrouw", "Heer"},



    };
     //Image afbeelding;
     //URL pad;
     //String [][] kaartendek;

    public void init() {
        System.out.println(kaartendek [0][1]); //geeft schoppen
        System.out.println(kaartendek[1][1]); //geeft 2
        System.out.println(kaartendek[1][0]); //geeft aas
        //// ik geef het op # confused
//        pad = afbeelding.class.getResource("/Images/");
//        afbeelding = getImage(pad, "hahaYouLost.jpg");
//        System.out.println(afbeelding);
//        kaartendek = new String[13][4];
    }



    public void paint(Graphics g) {
//        g.drawString(pad.toString(), 20, 10);
//        g.drawImage(afbeelding, 20, 20, 400, 300, this);

    }
    public static class MultidimensionalArray  {
        public void main (String[] args) {



            //System.out.println(kaartendek[0][0]);
            //System.out.println(kaartendek[1][2]);
        }

    }
}
