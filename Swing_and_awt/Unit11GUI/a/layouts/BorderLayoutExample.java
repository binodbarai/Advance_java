package Unit11GUI.a.layouts;

import javax.swing.*;
import java.awt.*;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-05-08
 **/
public class BorderLayoutExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Layout");
        JButton jb1 = new JButton("NORTH");
        JButton jb2 = new JButton("SOUTH");
        JButton jb3 = new JButton("WEST");
        JButton jb4 = new JButton("EAST");
        JButton jb5 = new JButton("CENTER");
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(jb1, BorderLayout.NORTH);
        panel.add(jb3, BorderLayout.WEST);
        panel.add(jb4, BorderLayout.EAST);
        panel.add(jb2, BorderLayout.SOUTH);
        panel.add(jb5, BorderLayout.CENTER);


        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
