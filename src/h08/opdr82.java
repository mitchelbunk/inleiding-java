
 package h08;

 import java.awt.*;

 import java.applet.Applet;
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;

 public class opdr82 extends Applet{

  //knoppen
 Button knop;
 Button knop1;
 Button knop2;
 Button knop3;
 Button knop4;
 Button knop5;
 Button knop6;
 Button knop7;

//Tekstvakken
TextField tekstvak;
TextField tekstvak1;
TextField tekstvak2;
TextField tekstvak3;

//Variabelen
int teller;
int teller1;
int teller2;
int teller3;

//strings
String vrouw, man, jongens, meisjes;


 public void init() {

  //knoppen
 knop = new Button("Man > ");
 add(knop);
 knop.addActionListener(new KnopListener() );
 man = "";


 knop1 = new Button("vrouw > ");
 add(knop1);
 knop1.addActionListener(new Knop2Listener() );
 vrouw = "";


 knop2 = new Button("jongens > ");
 add(knop2);
 knop2.addActionListener(new Knop3Listener() );
 jongens = "";


 knop3 = new Button("meisjes > ");
 add(knop3);
 knop3.addActionListener(new Knop4Listener() );
 meisjes = "";
//////
  knop4 = new Button("Man < ");
  add(knop4);
  knop4.addActionListener(new Knop5Listener() );
  man = "";


  knop5 = new Button("vrouw < ");
  add(knop5);
  knop5.addActionListener(new Knop6Listener() );
  vrouw = "";


  knop6 = new Button("jongens < ");
  add(knop6);
  knop6.addActionListener(new Knop7Listener() );
  jongens = "";


  knop7 = new Button("meisjes < ");
  add(knop7);
  knop7.addActionListener(new Knop8Listener() );
  meisjes = "";


 //tekstvakken
  tekstvak = new TextField("man", 50);
  tekstvak1 = new TextField("vrouw", 50);
  tekstvak2 = new TextField("jongens", 50);
  tekstvak3 = new TextField("meisjes", 50);

  //Strings
  man = "";
  vrouw = "";
  jongens = "";
  meisjes = "";

  //variabelen.
  teller = 0;
  teller1 = 0;
  teller2 = 0;
  teller3 = 0;

 }

 public void paint(Graphics g) {
  setBackground(new Color(0, 255, 187, 220));
  g.drawString("man  " +teller, 60, 50);
  g.drawString("vrouw  " +teller1, 60, 100);
  g.drawString("jongens  " +teller2, 60, 150);
  g.drawString("meisjes  " +teller3, 60, 200);

  knop.setLocation(150, 35);            knop4.setLocation(250, 35);
  knop1.setLocation(150, 85);           knop5.setLocation(250, 85);
  knop2.setLocation(150, 135);          knop6.setLocation(250, 135);
  knop3.setLocation(150, 185);          knop7.setLocation(250, 185);



 }
 class KnopListener implements ActionListener {
  public void actionPerformed(ActionEvent e) {
   teller++;
   man = tekstvak.getText();
   repaint();
 }
  }


  class Knop2Listener implements ActionListener {
   public void actionPerformed(ActionEvent e) {
    teller1++;
    vrouw = tekstvak1.getText();
    repaint();
   }
  }


  class Knop3Listener implements ActionListener {
   public void actionPerformed(ActionEvent e) {
    teller2++;
    jongens = tekstvak2.getText();
    repaint();
   }
  }

  class Knop4Listener implements ActionListener {
   public void actionPerformed(ActionEvent e) {
    teller3++;
    meisjes = tekstvak3.getText();
    repaint();
   }
  }

  class Knop5Listener implements ActionListener {
   public void actionPerformed(ActionEvent e) {
    teller--;
    man = tekstvak.getText();
    repaint();
   }
  }


  class Knop6Listener implements ActionListener {
   public void actionPerformed(ActionEvent e) {
    teller1--;
    vrouw = tekstvak1.getText();
    repaint();
   }
  }


  class Knop7Listener implements ActionListener {
   public void actionPerformed(ActionEvent e) {
    teller2--;
    jongens = tekstvak2.getText();
    repaint();
   }
  }

  class Knop8Listener implements ActionListener {
   public void actionPerformed(ActionEvent e) {
    teller3--;
    meisjes = tekstvak3.getText();
    repaint();
   }
  }
 }




