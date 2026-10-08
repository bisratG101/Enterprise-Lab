import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/StudentsDB";
        String username = "root";
        String password = "PASSWORD";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection =
                    DriverManager.getConnection(url, username, password);

            System.out.println("Established Connection");

            String sql =
                    "DELETE FROM students WHERE id = ?";

            PreparedStatement statement =
                    connection.prepareStatement(sql);

            statement.setInt(1, 2);

            int rowsDeleted = statement.executeUpdate();

            System.out.println(
                    rowsDeleted + " student deleted successfully."
            );

            statement.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}