import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandling extends JFrame {


    public void EventOccured(){
        setTitle("Event handling example");
        setVisible(true);
        setSize(400, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JButton button = new JButton("Click Me");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.remove(button);
                JLabel jLabel = new JLabel("Button Clicked", JButton.CENTER);
                jLabel.setFont(new Font("Arial", Font.BOLD, 24));
                panel.add(jLabel);
                panel.revalidate();
                panel.repaint();
            }
        });
        panel.add(button);
        add(panel);
    }

    public static void main(String[] args){
        EventHandling eventHandling = new EventHandling();
        eventHandling.EventOccured();
    }
}
