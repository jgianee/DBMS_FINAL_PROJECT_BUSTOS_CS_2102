package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddStudent {
    public static void addStudent(String name, String studentID) {
        String sql = "INSERT INTO Student (Name, StudentIDNumber) VALUES (?, ?)";

        try (Connection conn = JDBCConnector.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, name);
            pstmt.setString(2, studentID);

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Student added successfully!");
            } else {
                System.out.println("Failed to add student.");
            }
        } catch (SQLException e) {
            System.out.println("Error adding student: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Example usage (you can prompt user input or pass data here)
        addStudent("Alice Johnson", "S12345");
    }
}
