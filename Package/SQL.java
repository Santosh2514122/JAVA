package PackageBuilt;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SQL {
    public static void main(String[] args) {
        try {
            // Step 1: Load the JDBC driver (optional in newer versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Connect to the database
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mydb", "root", "password");

            // Step 3: Create a Statement
            Statement stmt = con.createStatement();

            // Step 4: Execute a query
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            // Step 5: Process the result
            while (rs.next()) {
                System.out.println("Name: " + rs.getString("name"));
            }

            // Step 6: Close connection
            con.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

}
