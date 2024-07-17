package Unit11GUI.a.mvc;

import javax.swing.*;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-05-09
 **/
public class StudentView {
    private JLabel nameLabel;
    private JLabel ageLabel;

    public StudentView() {
        JFrame frame = new JFrame("Student Details");
        this.nameLabel = new JLabel();
        this.ageLabel = new JLabel();

        JPanel panel = new JPanel();

        panel.add(nameLabel);
        panel.add(ageLabel);

        frame.add(panel);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void setDetails(String name, int age) {
        this.nameLabel.setText("Name:" + name);
        this.ageLabel.setText("Age:" + age);
    }
}
