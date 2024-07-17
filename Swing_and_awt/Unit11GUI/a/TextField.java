package a;

import javax.swing.*;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-03-31
 **/
public class TextField {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My frame");
        frame.setSize(500, 600);
        JPanel panel = new JPanel();
        JTextField textField = new JTextField("My textfield");

        panel.add(textField);
        frame.add(panel);
        frame.setVisible(true);
    }
}
