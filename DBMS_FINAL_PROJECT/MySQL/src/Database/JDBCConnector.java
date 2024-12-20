package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnector {
    private static final String URL = "jdbc:mysql://localhost:3306/Fitness_Class_Booking_System";
    private static final String USER = "root"; // Update to your MySQL username
    private static final String PASSWORD = "Apnengnnfrersh12345!"; // Update to your MySQL password

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Ensure MySQL driver is loaded
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            throw new SQLException("MySQL Driver not found. Ensure the JDBC driver is in the classpath.", e);
        }
    }
}
