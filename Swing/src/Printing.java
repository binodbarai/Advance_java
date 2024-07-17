import javax.swing.*;
import java.awt.*;

public class Printing {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        JFrame frame = new JFrame();
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        frame.setSize(screenWidth/2, screenHeight/2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Swing");
        frame.setVisible(true);

        JLabel jLabel = new JLabel("******");
        jLabel.setVerticalAlignment(JLabel.TOP);

        frame.add(jLabel);
    }
}