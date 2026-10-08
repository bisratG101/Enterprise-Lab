import java.sql.Connection;
import java.sql.DriverManager;

public class Main {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/StudentsDB";
        String username = "root";
        String password = "221997Bis$";

        try {
            Connection connection =
                    DriverManager.getConnection(url, username, password);

            System.out.println("Established Connection");

            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}