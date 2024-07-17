package Unit11GUI.a.eventhandling;

import javax.swing.*;
import java.awt.event.*;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-05-08
 **/
public class Events {
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
        JLabel label = new JLabel();
        JLabel keyLabel = new JLabel();
        panel.add(actionLabel);
        panel.add(label);

        frame.add(panel);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actionLabel.setText("Button clicked   ");
            }
        });

        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                label.setText("Mouse clicked  ");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                label.setText("Mouse pressed  ");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                label.setText("Mouse released  ");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                label.setText("Mouse entered  ");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                label.setText("Mouse exited  ");
            }
        });

        JTextField textField = new JTextField("Key event");
        panel.add(textField);
        panel.add(keyLabel);

        textField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                keyLabel.setText("Key typed  " + e.getKeyChar());
            }

            @Override
            public void keyPressed(KeyEvent e) {
                keyLabel.setText("Key Pressed  " + e.getKeyChar());
            }

            @Override
            public void keyReleased(KeyEvent e) {
                keyLabel.setText("Key Released  " + e.getKeyChar());
            }
        });


        JComboBox<String> cmbClass = new JComboBox<String>();
        cmbClass.addItem("Select Class");
        cmbClass.addItem("BCA");
        cmbClass.addItem("BBA");
        cmbClass.addItem("MCA");
        cmbClass.addItem("MBA");

        panel.add(cmbClass);

        cmbClass.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    JOptionPane.showMessageDialog(null, cmbClass.getSelectedItem().toString());
                }
            }
        });
    }
}
