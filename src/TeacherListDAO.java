import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;


public class TeacherListDAO {
    public void updateTeacherList() {
        String url = "jdbc:mysql://localhost:3306/librarydb";
        String user = "root";
        String password = "";

        String aggregateQuery = "SELECT employers_id, teachers_name, department, contact_no, COUNT(*) as borrowed_qty " +
                                "FROM teacher_borrowing " +
                                "GROUP BY employers_id, teachers_name, department, contact_no";

        String updateQuery = "INSERT INTO teacher_list (employers_id, teachers_name, department, contact_no, borrowed_qty) " +
                             "VALUES (?, ?, ?, ?, ?) " +
                             "ON DUPLICATE KEY UPDATE teachers_name = VALUES(teachers_name), department = VALUES(department), " +
                             "contact_no = VALUES(contact_no), borrowed_qty = VALUES(borrowed_qty)";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement aggregateStmt = connection.prepareStatement(aggregateQuery);
             PreparedStatement updateStmt = connection.prepareStatement(updateQuery);
             ResultSet rs = aggregateStmt.executeQuery()) {

            while (rs.next()) {
                updateStmt.setString(1, rs.getString("employers_id"));
                updateStmt.setString(2, rs.getString("teachers_name"));
                updateStmt.setString(3, rs.getString("department"));
                updateStmt.setString(4, rs.getString("contact_no"));
                updateStmt.setInt(5, rs.getInt("borrowed_qty"));

                updateStmt.executeUpdate();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
