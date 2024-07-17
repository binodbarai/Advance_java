import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SwingDatabase {
    Statement statement;
    Connection connection;

    void getConnection(){
        String username = "postgres";
        String password = "root";
        String host = "localhost";
        String port = "5432";
        String databaseName = "bca";
        String databaseType = "postgresql";
        String url = "jdbc:" + databaseType + "://" + host + ":" + port + "/" + databaseName;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    SwingDatabase(){
        getConnection();
        JFrame jFrame = new JFrame("This is simple JFrame App");
        jFrame.setSize(600, 250);
        jFrame.setLocationRelativeTo(null);
        jFrame.getContentPane().setLayout(null);
        jFrame.setVisible(true);

        JLabel idLabel = new JLabel("Id");
        idLabel.setBounds(20,12,100,10);
        jFrame.add(idLabel);
        JTextField idTF = new JTextField();
        idTF.setBounds(120,10,150,20);
        jFrame.add(idTF);

        JLabel nameLabel = new JLabel("Name");
        nameLabel.setBounds(20,55,100,10);
        jFrame.add(nameLabel);
        JTextField nameTF = new JTextField();
        nameTF.setBounds(120,50,150,20);
        jFrame.add(nameTF);

        JLabel addressLabel = new JLabel("Address");
        addressLabel.setBounds(20,85,100,10);
        jFrame.add(addressLabel);
        JTextField addressTF = new JTextField();
        addressTF.setBounds(120,90,150,20);
        jFrame.add(addressTF);

        JButton insert = new JButton("Insert");
        insert.setBounds(10,140,80,20);
        jFrame.add(insert);

        JButton update = new JButton("Update");
        update.setBounds(100,140,80,20);
        jFrame.add(update);

        JButton view = new JButton("View");
        view.setBounds(190,140,80,20);
        jFrame.add(view);

        JButton delete = new JButton("Delete");
        delete.setBounds(280,140,80,20);
        jFrame.add(delete);

        view.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] columns = {"SID","Name", "Address"};
                JTable jTable = new JTable();
                DefaultTableModel model = new DefaultTableModel();
                jTable.setModel(model);
                model.setColumnIdentifiers(columns);
                try {
                    String sql = "SELECT * FROM student";
                    ResultSet rs = statement.executeQuery(sql);
                    while (rs.next()) {
                        String id = rs.getString(1);
                        String name = rs.getString(2);
                        String address = rs.getString(3);
                        model.addRow(new
                                String[]{id, name, address});
                    }
                    JScrollPane sp = new JScrollPane(jTable);
                    sp.setBounds(300,10,250,100);
                    jFrame.add(sp);
                }catch (Exception ae){
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        });

        insert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = idTF.getText().toString();
                String name = nameTF.getText().toString();
                String address = addressTF.getText().toString();
                try {
                    String sql = "INSERT INTO student(sid,name,address)" + "VALUES('"+id+"','"+name+"','"+address+"')";
                    statement.execute(sql);
                    JOptionPane.showMessageDialog(null, "Data inserted successfully");
                }catch (Exception exception){
                    JOptionPane.showMessageDialog(null, exception);
                }
            }
        });

        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = idTF.getText().toString();
                String name = nameTF.getText().toString();
                String address = addressTF.getText().toString();
                try {
                    String sql = "UPDATE student SET name='" + name + "', address='" + address + "' WHERE sid='" + id + "'";
                    statement.execute(sql);
                    JOptionPane.showMessageDialog(null, "Data updated successfully");
                }catch (Exception exception){
                    JOptionPane.showMessageDialog(null, exception);
                }
            }
        });

        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = idTF.getText().toString();
                try {
                    String sql = "DELETE FROM student WHERE sid='" + id + "'";
                    statement.execute(sql);
                    JOptionPane.showMessageDialog(null, "Data deleted successfully");
                }catch (Exception exception){
                    JOptionPane.showMessageDialog(null, exception);
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingDatabase();
            }
        });
    }
}
