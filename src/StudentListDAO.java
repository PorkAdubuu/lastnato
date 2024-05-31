import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;

public class StudentListDAO {

    public void updateStudentList() {
    String url = "jdbc:mysql://localhost:3306/librarydb";
    String user = "root";
    String password = "";

    String aggregateQuery = "SELECT student_id, student_name, year, section, contact_no, COUNT(*) as borrowed_qty " +
                            "FROM student_borrowing " +
                            "GROUP BY student_id, student_name, year, section, contact_no";

    String updateQuery = "INSERT INTO student_list (student_id, student_name, year, section, contact_no, borrowed_qty) " +
                         "VALUES (?, ?, ?, ?, ?, ?) " +
                         "ON DUPLICATE KEY UPDATE student_name = VALUES(student_name), year = VALUES(year), " +
                         "section = VALUES(section), contact_no = VALUES(contact_no), borrowed_qty = VALUES(borrowed_qty)";

    try (Connection connection = DriverManager.getConnection(url, user, password);
         PreparedStatement aggregateStmt = connection.prepareStatement(aggregateQuery);
         PreparedStatement updateStmt = connection.prepareStatement(updateQuery);
         ResultSet rs = aggregateStmt.executeQuery()) {

        while (rs.next()) {
            updateStmt.setString(1, rs.getString("student_id"));
            updateStmt.setString(2, rs.getString("student_name"));
            updateStmt.setString(3, rs.getString("year"));
            updateStmt.setString(4, rs.getString("section"));
            updateStmt.setString(5, rs.getString("contact_no"));
            updateStmt.setInt(6, rs.getInt("borrowed_qty"));

            // Execute the update query
            int rowsAffected = updateStmt.executeUpdate();
            
            // Check if no rows were affected by the insert/update
            if (rowsAffected == 0) {
                // If no rows were affected, there was no change in data, so skip
                
            } else {
                // Rows were affected, either inserted or updated
                
            }
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }
}

}
