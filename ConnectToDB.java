import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseConnection {
    public static void main(String[] args) {
        // Database URL, username, and password
        String jdbcURL = "jdbc:mysql://localhost:3306/your_database_name";
        String dbUsername = "your_username";
        String dbPassword = "your_password";

        try {
            // Connect to the database
            Connection connection = DriverManager.getConnection(jdbcURL, dbUsername, dbPassword);
            System.out.println("Connected to the database!");

            // Create a statement
            Statement statement = connection.createStatement();

            // Execute a query
            String sql = "SELECT * FROM your_table_name";
            ResultSet resultSet = statement.executeQuery(sql);

            // Process the result set
            while (resultSet.next()) {
                System.out.println("Column Value: " + resultSet.getString("your_column_name"));
            }

            // Close the connection
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
