import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class BookStatusUpdater {
    // Database connection details
    private static final String url = "jdbc:mysql://localhost:3306/librarydb";
    private static final String user = "root";
    private static final String password = "";

    public static void main(String[] args) {
        updateBookStatus();
    }

    public static void updateBookStatus() {
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            // Get current date
            LocalDate currentDate = LocalDate.now();

            // Update status for student borrowing
            updateStudentBorrowingStatus(connection, currentDate);

            // Update status for teacher borrowing
            updateTeacherBorrowingStatus(connection, currentDate);

        } catch (SQLException ex) {
            ex.printStackTrace(); // Handle SQL exception
        }
    }

    private static void updateStudentBorrowingStatus(Connection connection, LocalDate currentDate) {
        // Query to retrieve borrowing records with due dates in the past or equal to current date
        String query = "SELECT book_id FROM student_borrowing WHERE date_borrowed <= ?";
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setObject(1, currentDate);
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    int bookId = rs.getInt("book_id");
                    // Update book status to "Borrowed"
                    updateBookStatusToBorrowed(connection, bookId);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handle SQL exception
        }
    }

    private static void updateTeacherBorrowingStatus(Connection connection, LocalDate currentDate) {
        // Query to retrieve borrowing records with borrowing dates in the past or equal to current date
        String query = "SELECT book_id FROM teacher_borrowing WHERE date_borrowed <= ?";
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setObject(1, currentDate);
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    int bookId = rs.getInt("book_id");
                    // Update book status to "Borrowed"
                    updateBookStatusToBorrowed(connection, bookId);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handle SQL exception
        }
    }

    private static void updateBookStatusToBorrowed(Connection connection, int bookId) {
        String updateSql = "UPDATE books SET status = 'Borrowed' WHERE id = ?";
        try (PreparedStatement updateStmt = connection.prepareStatement(updateSql)) {
            updateStmt.setInt(1, bookId);
            int rowsAffected = updateStmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Book with ID " + bookId + " status updated to Borrowed.");
            } else {
                System.out.println("Book with ID " + bookId + " not found or status already updated.");
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Handle SQL exception
        }
    }
}
