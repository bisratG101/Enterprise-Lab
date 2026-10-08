import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/StudentsDB";
        String username = "root";
        String password = "221997Bis$";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection =
                    DriverManager.getConnection(url, username, password);

            System.out.println("Established Connection");

            String sql = """
                    INSERT INTO students
                    (id, firstname, lastname, grade)
                    VALUES (?, ?, ?, ?)
                    """;

            PreparedStatement statement =
                    connection.prepareStatement(sql);

            // Student 1
            statement.setInt(1, 1);
            statement.setString(2, "John");
            statement.setString(3, "Doe");
            statement.setInt(4, 90);
            statement.executeUpdate();

            // Student 2
            statement.setInt(1, 2);
            statement.setString(2, "Abebe");
            statement.setString(3, "Kebede");
            statement.setInt(4, 85);
            statement.executeUpdate();

            // Student 3
            statement.setInt(1, 3);
            statement.setString(2, "Sara");
            statement.setString(3, "Mohammed");
            statement.setInt(4, 92);
            statement.executeUpdate();

            // Student 4
            statement.setInt(1, 4);
            statement.setString(2, "Dawit");
            statement.setString(3, "Tesfaye");
            statement.setInt(4, 78);
            statement.executeUpdate();

            // Student 5
            statement.setInt(1, 5);
            statement.setString(2, "Hana");
            statement.setString(3, "Bekele");
            statement.setInt(4, 88);
            statement.executeUpdate();

            // Student 6
            statement.setInt(1, 6);
            statement.setString(2, "Yonas");
            statement.setString(3, "Haile");
            statement.setInt(4, 75);
            statement.executeUpdate();

            // Student 7
            statement.setInt(1, 7);
            statement.setString(2, "Meron");
            statement.setString(3, "Alemu");
            statement.setInt(4, 95);
            statement.executeUpdate();

            // Student 8
            statement.setInt(1, 8);
            statement.setString(2, "Samuel");
            statement.setString(3, "Tadesse");
            statement.setInt(4, 82);
            statement.executeUpdate();

            // Student 9
            statement.setInt(1, 9);
            statement.setString(2, "Rahel");
            statement.setString(3, "Girma");
            statement.setInt(4, 89);
            statement.executeUpdate();

            // Student 10
            statement.setInt(1, 10);
            statement.setString(2, "Mekdes");
            statement.setString(3, "Worku");
            statement.setInt(4, 91);
            statement.executeUpdate();

            // Student 11
            statement.setInt(1, 11);
            statement.setString(2, "Daniel");
            statement.setString(3, "Abebe");
            statement.setInt(4, 84);
            statement.executeUpdate();

            System.out.println("Data inserted successfully.");

            statement.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}