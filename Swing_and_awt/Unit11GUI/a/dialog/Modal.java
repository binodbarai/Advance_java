package Unit11GUI.a.dialog;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-05-08
 **/
public class Modal {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Modal Dialog Example");
        JButton button = new JButton("Open Modal Dialog");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog dialog = new JDialog(frame, "Modal Dialog", true);
                dialog.add(new JLabel("This is a Modal dialog"));
                dialog.setSize(200, 100);
                dialog.setVisible(true);
            }
        });
        frame.add(button);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
