package a;

import javax.swing.*;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-03-31
 **/
public class Button {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My frame");

        JPanel panel = new JPanel();
        JButton button = new JButton("My button");
        panel.add(button);
        frame.add(panel);
        frame.setVisible(true);
    }
}
