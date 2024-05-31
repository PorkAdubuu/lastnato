import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.util.List;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFFont;


public class TeacherListPanel extends javax.swing.JPanel {

    private JTable teacherTable;
    private DefaultTableModel tableModel;
    
    public TeacherListPanel() {
        initComponents();
        
        initCustomComponents();
         loadTeacherList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        close = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        search_btn = new javax.swing.JButton();
        search_txtf = new javax.swing.JTextField();
        export_btn = new javax.swing.JLabel();
        refresh_btn = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1290, 463));
        setPreferredSize(new java.awt.Dimension(1290, 463));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lastnato/close.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 10, 50, 40));

        jPanel1.setBackground(new java.awt.Color(70, 134, 242));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lastnato/teacher_icon_small.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Teacher List");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(460, 460, 460)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(521, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 60));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Employer ID", "Name", "Department", "Contact", "Book borrowed Qty"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 1250, 290));

        search_btn.setText("Search");
        search_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_btnActionPerformed(evt);
            }
        });
        add(search_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));
        add(search_txtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 220, -1));

        export_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lastnato/export-btnn.png"))); // NOI18N
        export_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                export_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                export_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                export_btnMouseExited(evt);
            }
        });
        add(export_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 420, -1, -1));

        refresh_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lastnato/refresh-btnn.png"))); // NOI18N
        refresh_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refresh_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                refresh_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                refresh_btnMouseExited(evt);
            }
        });
        add(refresh_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 420, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        // TODO add your handling code here:

        setVisible(false);

        // Hide the booklist_content JPanel
        JPanel parent = (JPanel) this.getParent();
        parent.setVisible(false);
    }//GEN-LAST:event_closeMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:

        int row = jTable1.rowAtPoint(evt.getPoint());
        if (row >= 0) {
            String teachersId = tableModel.getValueAt(row, 0).toString();
            copyToClipboard(teachersId);
            displayTeacherBorrowingDetails(row);
        }

    }//GEN-LAST:event_jTable1MouseClicked

    private void search_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_btnActionPerformed
        // TODO add your handling code here:
        String searchTerm = search_txtf.getText().trim();
        searchTeachers(searchTerm);
    }//GEN-LAST:event_search_btnActionPerformed

    private void export_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_export_btnMouseClicked
        // TODO add your handling code here:
        exportToExcel();
    }//GEN-LAST:event_export_btnMouseClicked

    private void export_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_export_btnMouseEntered
        // TODO add your handling code here:
        export_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_export_btnMouseEntered

    private void export_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_export_btnMouseExited
        // TODO add your handling code here:
        export_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_export_btnMouseExited

    private void refresh_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refresh_btnMouseClicked
        // TODO add your handling code here:
        TeacherListDAO teacherListDAO = new TeacherListDAO();
        teacherListDAO.updateTeacherList();
        loadTeacherList();
    }//GEN-LAST:event_refresh_btnMouseClicked

    private void refresh_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refresh_btnMouseEntered
        // TODO add your handling code here:
        refresh_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_refresh_btnMouseEntered

    private void refresh_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refresh_btnMouseExited
        // TODO add your handling code here:
        refresh_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_refresh_btnMouseExited

    
    //methods 
    
    private void searchTeachers(String searchTerm) {
    String url = "jdbc:mysql://localhost:3306/librarydb";
    String user = "root";
    String password = "";
    String query = "SELECT * FROM teacher_list WHERE employers_id LIKE ? OR teachers_name LIKE ? OR department LIKE ? OR contact_no LIKE ?";

    tableModel.setRowCount(0);

    try (Connection connection = DriverManager.getConnection(url, user, password);
         PreparedStatement stmt = connection.prepareStatement(query)) {

        String searchPattern = "%" + searchTerm + "%";
        stmt.setString(1, searchPattern);
        stmt.setString(2, searchPattern);
        stmt.setString(3, searchPattern);
        stmt.setString(4, searchPattern);
        stmt.setString(5, searchPattern);

        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            String employersId = rs.getString("employers_id");
            String TeachersName = rs.getString("teachers_name");
            String department = rs.getString("department");
            String contactNo = rs.getString("contact_no");
            int bookBorrowedQty = rs.getInt("borrowed_qty");

            tableModel.addRow(new Object[]{employersId, TeachersName, department, contactNo, bookBorrowedQty});
        }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error searching teachers: " + e.getMessage());
        }
    }
    
    private void copyToClipboard(String employersId) {
        StringSelection stringSelection = new StringSelection(employersId);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
        
    }
    
    private void displayTeacherBorrowingDetails(int rowIndex) {
        String employersId = tableModel.getValueAt(rowIndex, 0).toString();

        // Query the database for borrowing details
        List<String[]> borrowedBooks = getBorrowedBooks(employersId);

        // Display the details in a new dialog
        JDialog dialog = new JDialog((Frame) null, "Borrowing Details", true);
        dialog.setLayout(new BorderLayout());

        String[] columnNames = {"Book ID", "Book Title", "ISBN", "Category", "Borrow Date"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        for (String[] book : borrowedBooks) {
            model.addRow(book);
        }

        JTable table = new JTable(model);
        dialog.add(new JScrollPane(table), BorderLayout.CENTER);
        dialog.setSize(600, 300);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }
    
    private List<String[]> getBorrowedBooks(String employersId) {
        List<String[]> books = new ArrayList<>();
        String url = "jdbc:mysql://localhost:3306/librarydb";
        String user = "root";
        String password = "";
        String query = "SELECT book_id, book_title, book_isbn, book_category, date_borrowed FROM teacher_borrowing WHERE employers_id = ?";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = connection.prepareStatement(query)) {

            stmt.setString(1, employersId);
            ResultSet resultSet = stmt.executeQuery();

            while (resultSet.next()) {
            String bookId = resultSet.getString("book_id");
            String bookTitle = resultSet.getString("book_title");
            String bookIsbn = resultSet.getString("book_isbn");
            String bookCategory = resultSet.getString("book_category");
            String borrowDate = resultSet.getString("date_borrowed");

            books.add(new String[]{bookId, bookTitle, bookIsbn, bookCategory, borrowDate});
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error fetching borrowed books: " + e.getMessage());
        }

        return books;
    }
    
    // Method to export teacher list to Excel
    private void exportToExcel() {
    String url = "jdbc:mysql://localhost:3306/librarydb";
    String user = "root";
    String password = "";

    try (Connection connection = DriverManager.getConnection(url, user, password);
         PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM teacher_list");
         ResultSet resultSet = preparedStatement.executeQuery()) {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Teacher List");

        // Create a bold font
        org.apache.poi.ss.usermodel.Font headerFont = workbook.createFont();
        headerFont.setBold(true);

        // Create a cell style with the bold font
        CellStyle headerCellStyle = workbook.createCellStyle();
        headerCellStyle.setFont(headerFont);
        
        // Create a bold font for date and time
            XSSFFont dateTimeFont = workbook.createFont();
            dateTimeFont.setBold(true);

            // Create a cell style for date and time with the bold font
            CellStyle dateTimeCellStyle = workbook.createCellStyle();
            dateTimeCellStyle.setFont(dateTimeFont);

            // Get the current date and time
            LocalDateTime currentDateTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String formattedDateTime = currentDateTime.format(formatter);

            // Create a row for the export date and time
            Row dateTimeRow = sheet.createRow(0);
            Cell dateTimeCell = dateTimeRow.createCell(0);
            dateTimeCell.setCellValue("Export Date and Time: " + formattedDateTime);
            dateTimeCell.setCellStyle(dateTimeCellStyle);

        // Create the header row
        Row headerRow = sheet.createRow(2);
        Cell cell;

        cell = headerRow.createCell(0);
        cell.setCellValue("Employer ID");
        cell.setCellStyle(headerCellStyle);

        cell = headerRow.createCell(1);
        cell.setCellValue("Name");
        cell.setCellStyle(headerCellStyle);

        cell = headerRow.createCell(2);
        cell.setCellValue("Department");
        cell.setCellStyle(headerCellStyle);

        cell = headerRow.createCell(3);
        cell.setCellValue("Contact");
        cell.setCellStyle(headerCellStyle);

        cell = headerRow.createCell(4);
        cell.setCellValue("Borrowed Books");
        cell.setCellStyle(headerCellStyle);

        // Create the data rows
        int rowNum = 4;
        while (resultSet.next()) {
            Row row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(resultSet.getString("employers_id"));
            row.createCell(1).setCellValue(resultSet.getString("teachers_name"));
            row.createCell(2).setCellValue(resultSet.getString("department"));
            row.createCell(3).setCellValue(resultSet.getString("contact_no"));
            row.createCell(4).setCellValue(resultSet.getInt("borrowed_qty"));
        }

        // Write the output to a file
        try (FileOutputStream fileOut = new FileOutputStream("teacher_list.xlsx")) {
            workbook.write(fileOut);
        }

        // Display a success message
        JOptionPane.showMessageDialog(null, "Teacher list exported to Excel successfully!");

    } catch (SQLException | IOException e) {
        e.printStackTrace();
        // Display an error message if export fails
        JOptionPane.showMessageDialog(null, "Error exporting teacher list to Excel: " + e.getMessage());
    }
}
    
    // Custom method to initialize additional components
    private void initCustomComponents() {
        // Initialize the table model and assign it to the jTable1
        tableModel = (DefaultTableModel) jTable1.getModel();
    }
    
    void loadTeacherList() {
        String url = "jdbc:mysql://localhost:3306/librarydb";
        String user = "root";
        String password = "";
        String query = "SELECT * FROM teacher_list";
        tableModel.setRowCount(0);

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = connection.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                String employersId = rs.getString("employers_id");
                String teachersName = rs.getString("teachers_name");
                String department = rs.getString("department");
                String contactNo = rs.getString("contact_no");
                int bookBorrowedQty = rs.getInt("borrowed_qty");

                tableModel.addRow(new Object[]{employersId, teachersName, department, contactNo, bookBorrowedQty});
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    
    
    
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel close;
    private javax.swing.JLabel export_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel refresh_btn;
    private javax.swing.JButton search_btn;
    private javax.swing.JTextField search_txtf;
    // End of variables declaration//GEN-END:variables
}
