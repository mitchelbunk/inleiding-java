package CreativeMe;

import javax.swing.*;

public class TextfielfInArray {

    public static void main(String[] args) {

        JComponent a[] = new JComponent[]{

                new JTextField(),
                new JTextField(10),
                new JTextField("Hello"),
                new JTextField("Goodbye", 20)
                new JCheckBox(),
                new JCheckBox("Working?", true)
        };

        a[3] = new JTextField("I must be going");
        ((JTextField)a[2]).setText("Greetings");
        String param;
        param = ((JCheckBox)a[4]).paramString();
    }
}
