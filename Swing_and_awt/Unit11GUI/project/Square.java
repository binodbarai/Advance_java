package Unit11GUI.project;

import javax.swing.*;
import java.awt.*;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-05-08
 **/
public class Square {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setLayout(new GridLayout(2, 2));

        JPanel panel1 = new JPanel();
        panel1.setSize(100, 100);
        panel1.setLayout(new FlowLayout());
        JLabel inp = new JLabel("Number: ");
        JTextField input = new JTextField("Enter Number here");
        input.setSize(10, 20);
        panel1.add(inp);
        panel1.add(input);
        frame.add(panel1);

        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        JLabel out = new JLabel("Square = ");
        JTextField output = new JTextField("Output will appear here");
        output.setEditable(false);
        output.setSize(10, 20);
        panel2.add(out);
        panel2.add(output);
        frame.add(panel2);

        JPanel panel3 = new JPanel();
        JButton button = new JButton("Calculate");
        panel3.add(button);
        frame.add(panel3);

        button.addActionListener(event -> {
            int a = Integer.parseInt(input.getText());
            output.setText(String.valueOf(a * a));
        });

    }
}
