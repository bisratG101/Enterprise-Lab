import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/jdbc_db";
        String username = "root";
        String password = "YOUR_PASSWORD";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);

            System.out.println("Connected successfully!");

            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}