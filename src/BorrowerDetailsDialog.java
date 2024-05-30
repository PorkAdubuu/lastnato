import javax.swing.*;
import java.awt.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class BorrowerDetailsDialog extends JDialog {
    private JTable detailsTable;
    private DefaultTableModel detailsTableModel;

    public BorrowerDetailsDialog(String bookId) {
        setTitle("Borrower Details");
        setLayout(new BorderLayout());
        setSize(500, 300);
        setLocationRelativeTo(null);

        detailsTableModel = new DefaultTableModel();
        detailsTable = new JTable(detailsTableModel);
        JScrollPane scrollPane = new JScrollPane(detailsTable);
        add(scrollPane, BorderLayout.CENTER);

        loadBorrowerDetails(bookId);
    }

    private void loadBorrowerDetails(String bookId) {
        try {
            String url = "jdbc:mysql://localhost:3306/librarydb";
            String user = "root";
            String password = "";

            // Check student borrowing
            String sqlStudent = "SELECT sb.student_id, s.student_name, s.year, s.section, s.contact_no " +
                                "FROM student_borrowing sb " +
                                "JOIN student_list s ON sb.student_id = s.student_id " +
                                "WHERE sb.book_id = ?";
            try (Connection connection = DriverManager.getConnection(url, user, password);
                 PreparedStatement pstmt = connection.prepareStatement(sqlStudent)) {
                pstmt.setString(1, bookId);
                ResultSet rs = pstmt.executeQuery();
                if (rs.next()) {
                    setTitle("BORROWER-STUDENT");
                    detailsTableModel.setColumnIdentifiers(new Object[]{"Student ID", "Name", "Year", "Section", "Contact No"});
                    detailsTableModel.addRow(new Object[]{
                        rs.getString("student_id"),
                        rs.getString("student_name"),
                        rs.getString("year"),
                        rs.getString("section"),
                        rs.getString("contact_no")
                    });
                    return;
                }
            }

            // Check teacher borrowing
            String sqlTeacher = "SELECT tb.employers_id, t.teachers_name, t.department, t.contact_no " +
                                "FROM teacher_borrowing tb " +
                                "JOIN teacher_list t ON tb.employers_id = t.employers_id " +
                                "WHERE tb.book_id = ?";
            try (Connection connection = DriverManager.getConnection(url, user, password);
                 PreparedStatement pstmt = connection.prepareStatement(sqlTeacher)) {
                pstmt.setString(1, bookId);
                ResultSet rs = pstmt.executeQuery();
                if (rs.next()) {
                    setTitle("BORROWER-EMPLOYER");
                    detailsTableModel.setColumnIdentifiers(new Object[]{"Employer ID", "Name", "Department", "Contact No"});
                    detailsTableModel.addRow(new Object[]{
                        rs.getString("employers_id"),
                        rs.getString("teachers_name"),
                        rs.getString("department"),
                        rs.getString("contact_no")
                    });
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
