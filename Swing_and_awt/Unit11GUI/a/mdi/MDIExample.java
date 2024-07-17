package Unit11GUI.a.mdi;

import javax.swing.*;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-05-08
 **/
public class MDIExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Primary");
        JDesktopPane jd = new JDesktopPane();

        JInternalFrame frame1 = new JInternalFrame("Internal Frame1",
                true, true, true, true);
        frame1.setLayout(null);
        frame1.setSize(200, 100);
        frame1.setVisible(true);

        JInternalFrame frame2 = new JInternalFrame("Internal Frame2", true, true, true, true);
        frame2.setLayout(null);
        frame2.setSize(200, 100);
        frame2.setVisible(true);

        JInternalFrame frame3 = new JInternalFrame("Internal Frame3", true, true, true, true);
        frame3.setLayout(null);
        frame3.setSize(200, 100);
        frame3.setVisible(true);

        jd.add(frame1);
        jd.add(frame2);
        jd.add(frame3);

        jd.setVisible(true);

        frame.add(jd);
        frame.setVisible(true);

    }
}
