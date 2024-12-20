package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookClass {
    public static void bookClass(int studentID, int classID) {
        String sql = "INSERT INTO Booking (StudentID, ClassID) VALUES (?, ?)";

        try (Connection conn = JDBCConnector.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, studentID);
            pstmt.setInt(2, classID);

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Class booked successfully!");
            } else {
                System.out.println("Failed to book the class.");
            }
        } catch (SQLException e) {
            System.out.println("Error booking class: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Example usage (you can prompt user input or pass data here)
        bookClass(1, 1); // Student 1 books Yoga (Class 1)
    }
}
