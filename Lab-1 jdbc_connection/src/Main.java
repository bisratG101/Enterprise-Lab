import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/StudentsDB";
        String username = "root";
        String password = "221997Bis$";

        try {
            Connection connection =
                    DriverManager.getConnection(url, username, password);

            System.out.println("Established Connection");

            Statement statement = connection.createStatement();

            String createTable = """
                    CREATE TABLE IF NOT EXISTS students (
                        id INT PRIMARY KEY,
                        firstname VARCHAR(255),
                        lastname VARCHAR(255),
                        grade INT
                    )
                    """;

            statement.executeUpdate(createTable);

            System.out.println("Students table is ready");

            statement.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}