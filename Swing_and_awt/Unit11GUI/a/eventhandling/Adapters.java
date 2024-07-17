package Unit11GUI.a.eventhandling;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-05-08
 **/
public class Adapters {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Events");
        frame.setVisible(true);

        //Action Event
        JButton button = new JButton("Click Me");
        panel.add(button);
        JLabel actionLabel = new JLabel();

        panel.add(actionLabel);
        frame.add(panel);

        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Clicked Me");
            }
        });
    }
}
