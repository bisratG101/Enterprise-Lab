import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/StudentsDB";
        String username = "root";
        String password = "passwrod";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection =
                    DriverManager.getConnection(url, username, password);

            System.out.println("Established Connection");

            Statement statement = connection.createStatement();

            String sql = "SELECT * FROM students LIMIT 5";

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {

                int id = resultSet.getInt("id");
                String firstname = resultSet.getString("firstname");
                String lastname = resultSet.getString("lastname");
                int grade = resultSet.getInt("grade");

                System.out.println(
                        "ID: " + id +
                                ", Name: " + firstname + " " + lastname +
                                ", Grade: " + grade
                );
            }

            resultSet.close();
            statement.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}