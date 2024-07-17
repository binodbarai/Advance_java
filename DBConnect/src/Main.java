import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String username = "postgres";
        String password = "root";
        String host = "localhost";
        String port = "5432";
        String databaseName = "advance_java";
        String databaseType = "postgresql";

        String url = "jdbc:" + databaseType + "://" + host + ":" + port + "/" + databaseName;

        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();

            if (connection != null) {
                System.out.println("Successfully connected to the PostgreSQL database.");
                //insert query
//                String insertSQL = "INSERT INTO students(id,name) values(5, 'Bharat')";
//                int result = statement.executeUpdate(insertSQL);
//                System.out.println("Rows affected:"+result);



                //update queries
//                String selectSQL = "UPDATE students SET name = 'Binod' WHERE id = 1";
//                int result = statement.executeUpdate(selectSQL);
//                System.out.println(result);


                String selectSQL = "SELECT * FROM students";
                ResultSet resultSet = statement.executeQuery(selectSQL);


                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    System.out.println("ID: " + id + ", Name: " + name);
                }

                resultSet.close();
                statement.close();
                connection.close();
            }
        } catch (SQLException e) {
            System.out.println("Connection to the database failed.");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

