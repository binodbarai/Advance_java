package a;

import javax.swing.*;

/**
 * @author Ozads
 * @version v1.0
 * @project JAVA TUTORIAL
 * @since 2024-03-31
 **/
public class Components {
    public static void main(String[] args) {
        //frame setup
        JFrame jframe = new JFrame("This App contains almost all Elements of Swing");
        jframe.setSize(600, 500);
        jframe.setLayout(null);
        jframe.setLocationRelativeTo(null);
        jframe.setVisible(true);

        //name label
        JLabel lblName = new JLabel("Name: ");
        lblName.setBounds(30, 12, 150, 10);
        jframe.add(lblName);

        //name textfield
        JTextField txtName = new JTextField();
        txtName.setBounds(100, 12, 150, 20);
        jframe.add(txtName);

        //address label
        JLabel lblAddress = new JLabel("Address: ");
        lblAddress.setBounds(300, 12, 150, 10);
        jframe.add(lblAddress);

        //address textfield
        JTextField txtAddress = new JTextField();
        txtAddress.setBounds(370, 10, 150, 20);
        jframe.add(txtAddress);

        //class label
        JLabel lblClass = new JLabel("Class: ");
        lblClass.setBounds(30, 60, 150, 10);
        jframe.add(lblClass);

        //classes options dropdown
        JComboBox<String> cmbClass = new JComboBox<>();
        cmbClass.addItem("Select Class");
        cmbClass.addItem("BCA");
        cmbClass.addItem("BBA");
        cmbClass.addItem("MCA");
        cmbClass.addItem("MBA");
        cmbClass.setBounds(100, 55, 150, 20);
        jframe.add(cmbClass);

        //gender label
        JLabel lblSex = new JLabel("Gender: ");
        lblSex.setBounds(300, 60, 80, 10);
        jframe.add(lblSex);

        //button group for one selection
        ButtonGroup group1 = new ButtonGroup();

        //male radio button
        JRadioButton chkMale = new JRadioButton("Male", true);
        chkMale.setBounds(360, 55, 70, 20);
        jframe.add(chkMale);
        group1.add(chkMale);

        //male radio button
        JRadioButton chkFemale = new JRadioButton("Female");
        chkFemale.setBounds(430, 55, 90, 20);
        jframe.add(chkFemale);
        group1.add(chkFemale);

        //shift label
        JLabel lblShift = new JLabel("Shift: ");
        lblShift.setBounds(30, 100, 80, 10);
        jframe.add(lblShift);

        //list of shifts
        String[] shift = {"Morning", "Day", "Evening"};
        JList list1 = new JList(shift);
        list1.setBounds(100, 100, 100, 60);
        jframe.add(list1);

        //interest label
        JLabel lblInterest = new JLabel("Interest: ");
        lblInterest.setBounds(300, 100, 80, 10);
        jframe.add(lblInterest);

        //c checkbox
        JCheckBox checkC = new JCheckBox("C", false);
        checkC.setBounds(380, 100, 70, 20);
        jframe.add(checkC);

        //c++ checkbox
        JCheckBox checkCpp = new JCheckBox("C++");
        checkCpp.setBounds(450, 100, 70, 20);
        jframe.add(checkCpp);

        //java checkbox
        JCheckBox checkJava = new JCheckBox("Java");
        checkJava.setBounds(520, 100, 70, 20);
        jframe.add(checkJava);

        //table
        String[][] data = {{"101", "Sam", "670000"},
                {"102", "Ram", "780000"},
                {"102", "Gita", "780000"},
                {"102", "Hari", "780000"},
                {"101", "Madan", "700000"}};
        String[] column = {"ID", "NAME", "SALARY"};
        JTable jt = new JTable(data, column);
        JScrollPane sp = new JScrollPane(jt);
        sp.setBounds(30, 200, 250, 80);
        jframe.add(sp);


        //Remarks label
        JLabel lblRemarks = new JLabel("Remarks: ");
        lblRemarks.setBounds(300, 200, 80, 10);
        jframe.add(lblRemarks);

        //text area
        JTextArea txtArea = new JTextArea();
        txtArea.setBounds(400, 200, 150, 100);
        jframe.add(txtArea);

        //button
        JButton click = new JButton("Submit");
        click.setBounds(200, 300, 100, 30);
        jframe.add(click);

        //menu
        JMenuBar mb = new JMenuBar();
        mb.setBounds(30, 350, 200, 20);
        JMenu menu1 = new JMenu("File");
        JMenuItem item1, item3;
        item1 = new JMenuItem("New");
        JMenu item2 = new JMenu("Open");
        JMenuItem i1, i2;
        i1 = new JMenuItem("Open Project");
        i2 = new JMenuItem("Open File");
        item2.add(i1);
        item2.add(i2);
        item3 = new JMenuItem("Close");
        menu1.add(item1);
        menu1.add(item2);
        menu1.add(item3);
        mb.add(menu1);
        JMenu menu2 = new JMenu("Edit");
        JMenuItem it1, it2;
        it1 = new JMenuItem("Copy");
        it2 = new JMenuItem("Paste");
        menu2.add(it1);
        menu2.add(it2);
        mb.add(menu2);
        jframe.add(mb);
    }
}
