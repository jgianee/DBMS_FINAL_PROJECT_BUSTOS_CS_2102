package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CancelBooking {
    public static void cancelBooking(int studentID, int classID) {
        String sql = "DELETE FROM Booking WHERE StudentID = ? AND ClassID = ?";

        try (Connection conn = JDBCConnector.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, studentID);
            pstmt.setInt(2, classID);

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Booking canceled successfully!");
            } else {
                System.out.println("Booking not found.");
            }
        } catch (SQLException e) {
            System.out.println("Error canceling booking: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Example usage (you can prompt user input or pass data here)
        cancelBooking(1, 2); // Student 1 cancels booking for Class 2 (Zumba)
    }
}
