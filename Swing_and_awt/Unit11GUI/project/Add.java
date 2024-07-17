package Unit11GUI.project;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Add {
    Add() {
        JFrame jframe = new JFrame("This is a simple JFrame App");
        jframe.setSize(400, 300);
        jframe.setLocationRelativeTo(null);
        jframe.getContentPane().setLayout(null);
        jframe.setVisible(true);
        JLabel lbl1 = new JLabel("Number 1:");
        lbl1.setBounds(20, 10, 100, 10);
        jframe.add(lbl1);
        JTextField txt1 = new JTextField();
        txt1.setBounds(120, 10, 120, 20);
        jframe.add(txt1);
        JLabel lbl2 = new JLabel("Number 2:");
        lbl2.setBounds(20, 50, 100, 10);
        jframe.add(lbl2);
        JTextField txt2 = new JTextField();
        txt2.setBounds(120, 50, 120, 20);
        jframe.add(txt2);
        JLabel lbl3 = new JLabel("Result: ");
        lbl3.setBounds(20, 80, 100, 30);
        jframe.add(lbl3);
        JButton btn = new JButton("Calculate");
        btn.setBounds(100, 120, 100, 30);
        jframe.add(btn);
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String first1 = txt1.getText().toString();
                String second1 = txt2.getText().toString();
                int a, b, c;
                a = Integer.parseInt(first1);
                b = Integer.parseInt(second1);
                c = a + b;
                lbl3.setText("Result: " + c);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Add::new);
    }
}
