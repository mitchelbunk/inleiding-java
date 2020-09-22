package h08;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class praktijkopdrachth08 extends Applet
{
    TextField invoervakje1, invoervakje2, uitkomst;
    Button maal, plus, delen, aftrekken;
    double invoergetal1, invoergetal2, resultaatgetal;

    public void init()
    {

        invoervakje1 = new TextField( 10 );
        invoervakje2 = new TextField( 10 );
        uitkomst = new TextField( 10 );

        maal = new Button("x");
        maal.addActionListener(new maalHandler());

        plus = new Button("+");
        plus.addActionListener(new plusHandler());

        delen = new Button("/");
        delen.addActionListener(new delenHandler());

        aftrekken = new Button("_");
        aftrekken.addActionListener(new aftrekkenHandler());

        add( invoervakje1 );
        add( invoervakje2 );
        add( maal );
        add( plus );
        add( delen );
        add( aftrekken );
        add( uitkomst );

    }




    class maalHandler implements ActionListener
    {

        public void actionPerformed(ActionEvent e)
        {
            String invoer1 = invoervakje1.getText();
            invoergetal1 = Double.parseDouble( invoer1 );

            String invoer2 = invoervakje2.getText();
            invoergetal2 = Double.parseDouble( invoer2 );

            resultaatgetal = invoergetal1 * invoergetal2;
            uitkomst.setText("" + resultaatgetal );


        }
    }



    class plusHandler implements ActionListener
    {

        public void actionPerformed(ActionEvent e)
        {
            String invoer1 = invoervakje1.getText();
            invoergetal1 = Double.parseDouble( invoer1 );

            String invoer2 = invoervakje2.getText();
            invoergetal2 = Double.parseDouble( invoer2 );

            resultaatgetal = invoergetal1 + invoergetal2;
            uitkomst.setText("" + resultaatgetal );
        }
    }



    class delenHandler implements ActionListener
    {

        public void actionPerformed(ActionEvent e)
        {
            String invoer1 = invoervakje1.getText();
            invoergetal1 = Double.parseDouble( invoer1 );

            String invoer2 = invoervakje2.getText();
            invoergetal2 = Double.parseDouble( invoer2 );

            resultaatgetal = invoergetal1 / invoergetal2;
            uitkomst.setText("" + resultaatgetal );
        }
    }



    class aftrekkenHandler implements ActionListener
    {

        public void actionPerformed(ActionEvent e)
        {
            String invoer1 = invoervakje1.getText();
            invoergetal1 = Double.parseDouble( invoer1 );

            String invoer2 = invoervakje2.getText();
            invoergetal2 = Double.parseDouble( invoer2 );

            resultaatgetal = invoergetal1 - invoergetal2;
            uitkomst.setText("" + resultaatgetal );
        }
    }



}
