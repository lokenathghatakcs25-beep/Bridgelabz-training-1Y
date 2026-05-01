package org.example;
import java.sql.*;
public class Student {

    public void insertEntries() {
        // 1. Update this with your actual database name
        String url = "jdbc:mysql://localhost:3306/your_database_name";
        String user = "root";
        String password = "root";

        // SQL query with placeholders (?) to prevent SQL injection
        String sql = "INSERT INTO students (name, email) VALUES (?, ?)";

        // 2. Use try-with-resources to automatically close the connection
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement statement = conn.prepareStatement(sql)) {

            // 3. Set the values for your placeholders
            statement.setString(1, "Alice Smith");
            statement.setString(2, "alice@example.com");

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new student was inserted successfully!");
            }

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Student studentApp = new Student();
        studentApp.insertEntries();
    }
}
