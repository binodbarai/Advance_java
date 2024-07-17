package Unit11GUI.a.dialog;

import javax.swing.*;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-05-08
 **/
public class CustomDialog {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Dialog Example");
        JDialog dialog = new JDialog(frame, "Dialog Box", true);
        JLabel label = new JLabel("This is a dialog box!");
        dialog.add(label);
        dialog.setSize(200, 100);
        dialog.setVisible(true);
    }
}
