package CreativeMe;

import javax.swing.*;
import java.applet.Applet;

public class TextfieldInArray extends Applet {

    public TextfieldInArray(int Na){
        JTextField[] allField = new JTextField[Na];

        for (int i = 0; i < Na; i++) {
            JTextField textField = new JTextField(String.valueOf(0));
            textField.setBounds(150, 350 + i * 25, 20, 20);
            allField[i] = textField;
        }
    }
}
