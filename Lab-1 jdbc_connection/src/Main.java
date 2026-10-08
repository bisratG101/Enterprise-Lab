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
                    "UPDATE students SET firstname = ? WHERE id = ?";

            PreparedStatement statement =
                    connection.prepareStatement(sql);

            statement.setString(1, "UpdatedFirstName");
            statement.setInt(2, 1);

            int rowsUpdated = statement.executeUpdate();

            System.out.println(
                    rowsUpdated + " student updated successfully."
            );

            statement.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}