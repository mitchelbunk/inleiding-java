package CreativeMe;

import javax.swing.*;
import java.awt.*;

public class TextfieldInArrayTest3 extends JFrame {

    private static final long serialVersionUID = 1L;

    public TextfieldInArrayTest3 () {
        super("Text Field Array");
        JTextField jTextFieldArray = null;
        String[] textFieldStrings = new String[5];
        this.setLayout(new FlowLayout(FlowLayout.LEFT));

        for (int i = 0; i < 5; i++) {
            textFieldStrings = new String[]{"TextField : " + i};
            jTextFieldArray = new JTextField(String.valueOf(textFieldStrings));
            this.add(jTextFieldArray);
        }
    }
    public static void main(String[] args) {
        TextfieldInArrayTest3 main = new TextfieldInArrayTest3();
        main.setSize(new Dimension(400, 300));
        main.setVisible(true);
        
    }
}
