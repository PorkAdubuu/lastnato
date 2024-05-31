import static com.itextpdf.text.pdf.PdfFileSpecification.url;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author Neighas
 */
public class BookReturningPanel extends javax.swing.JPanel {

    private JPanel panelContent;
    private String bookID;
    private String studentID;
    private int penaltyAmount;
    
    public BookReturningPanel(JPanel panelContent) {
        initComponents();
        this.panelContent = panelContent;

        
        
        

        // Make booklist_content JPanel visible
        panel_content.setVisible(false);
        
        

        
        
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_content = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        book_id = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        book_title = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        book_isbn = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        book_category = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        due_date = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        print_date_borrowed = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        returner_name = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        returner_id = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        year_department = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        returner_section = new javax.swing.JTextField();
        returner_contact = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        clear_btn = new javax.swing.JLabel();
        return_btn = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1290, 463));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_content.setBackground(new java.awt.Color(255, 255, 255));
        panel_content.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        panel_content.setLayout(new java.awt.BorderLayout());
        add(panel_content, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 480, 350));

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lastnato/close.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
        });
        add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 10, 50, 40));

        jPanel1.setBackground(new java.awt.Color(70, 134, 242));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lastnato/booklist-icon.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Book Returning");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(487, 487, 487)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(435, Short.MAX_VALUE))
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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setText("Book ID");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        book_id.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        book_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_idActionPerformed(evt);
            }
        });
        jPanel2.add(book_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 234, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setText("Book Title");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        book_title.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jPanel2.add(book_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 234, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setText("ISBN");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        book_isbn.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jPanel2.add(book_isbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 234, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("Book Category");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        book_category.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        book_category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Category", "Fiction", "Non-Fiction", "Academic" }));
        book_category.setToolTipText("");
        jPanel2.add(book_category, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 234, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        due_date.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        due_date.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                due_dateInputMethodTextChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(due_date, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(due_date, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel11.setText("Date Borrowed");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, -1, -1));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel15.setText("Due Date");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        print_date_borrowed.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        print_date_borrowed.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                print_date_borrowedInputMethodTextChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(print_date_borrowed, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(print_date_borrowed, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, -1, -1));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 33, 27));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 850, 310));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("BOOK DETAILS");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("RETURNER'S DETAILS");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 70, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Name");

        returner_name.setEditable(false);
        returner_name.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        returner_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returner_nameActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel13.setText("Student/Employer ID");

        returner_id.setEditable(false);
        returner_id.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel12.setText("Year/Department");

        year_department.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        year_department.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Option", "HSU", "I", "II", "III", "IV", "CCIS", "CHK", "CTHM", "ION", " " }));
        year_department.setToolTipText("");

        jLabel14.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel14.setText("Section");

        returner_section.setEditable(false);
        returner_section.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        returner_contact.setEditable(false);
        returner_contact.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Contact no.");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel14))
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(returner_id)
                    .addComponent(returner_contact)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(year_department, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(returner_section, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(returner_name))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3)
                .addGap(8, 8, 8)
                .addComponent(returner_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGap(8, 8, 8)
                .addComponent(returner_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14))
                .addGap(8, 8, 8)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(year_department, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(returner_section, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(returner_contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 90, 380, 310));

        clear_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lastnato/clear-btn.png"))); // NOI18N
        clear_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clear_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clear_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clear_btnMouseExited(evt);
            }
        });
        add(clear_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, -1, -1));

        return_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lastnato/return-btnn.png"))); // NOI18N
        return_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                return_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                return_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                return_btnMouseExited(evt);
            }
        });
        add(return_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 410, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    
    
    
    
    
    
    
    //methods
    
    // Method to determine if the user is a student
    private boolean isStudent(String userID) {
        // Implement logic to check if the user is a student
        // For example, you can query the student_borrowing or student_list table to check if the user exists
        boolean isStudent = false;
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            connection = DatabaseConnection.getConnection();
            String sql = "SELECT COUNT(*) FROM student_borrowing WHERE student_id = ?";
            statement = connection.prepareStatement(sql);
            statement.setString(1, userID);
            resultSet = statement.executeQuery();

            if (resultSet.next()) {
                isStudent = resultSet.getInt(1) > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return isStudent;
    }
    
        private void handleStudentBookReturn(int bookID, String studentID) {

         LocalDate returnDate = LocalDate.now();

            // Query the database to retrieve the due date for the book borrowed by the student
            LocalDate dueDate = queryDueDateFromDatabase(bookID, studentID);

        if (returnDate.isAfter(dueDate)) {
                        // Calculate penalty
                        long daysLate = ChronoUnit.DAYS.between(dueDate, returnDate);
                        int penaltyAmount = (int) (daysLate * 20); // Penalty is 20 pesos per day late

                        // Show a confirmation message to proceed to payment
                        int confirm = JOptionPane.showConfirmDialog(this, "You have a due date balance. Proceed to payment?", "Confirmation", JOptionPane.YES_NO_OPTION);
                        if (confirm == JOptionPane.YES_OPTION) {
                            // Open PenaltyPanel and display the penalty amount
                            panel_content.removeAll();

                            // Create a new instance of PenaltyPanel and pass panel_content
                            PenaltyPanel penaltyPanel = new PenaltyPanel(panel_content, penaltyAmount, bookID, studentID, this);

                            // Add PenaltyPanel to panel_content JPanel
                            panel_content.add(penaltyPanel);

                            // Make panel_content JPanel visible
                            panel_content.setVisible(true);

                            // Repaint and revalidate panel_content JPanel
                            panel_content.revalidate();
                            panel_content.repaint();
                        } else {
                            // Inform the user that payment was declined
                            JOptionPane.showMessageDialog(this, "Payment declined. Book cannot be returned.");
                        }
                    } else {
                        // Book returned on time, no penalty

                        panel_content.removeAll();

                        // Create a new instance of WhosBorrowingPanel and pass panel_content
                        NoPenaltyDuePanel noPenaltyDuePanel = new NoPenaltyDuePanel(panel_content);

                        // Add WhosBorrowingPanel to panel_content JPanel
                        panel_content.add(noPenaltyDuePanel);

                        // Make panel_content JPanel visible
                        panel_content.setVisible(true);

                        // Repaint and revalidate panel_content JPanel
                        panel_content.revalidate();
                        panel_content.repaint();

                        // Update the database and set book status to "Available"
                        updateDatabase(bookID, studentID);
                        updateBookStatus(bookID, "Available");
                        clearFields();
                    }

        }
    
    
    // Method to handle teacher book return
    private void handleTeacherBookReturn(int bookID, String employerID) {
        // Update the book status to "Available"
        updateBookStatus(bookID, "Available");

        // Delete the borrowing record from teacher_borrowing and teacher_list tables
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = DatabaseConnection.getConnection();

            // Begin transaction
            connection.setAutoCommit(false);

            // Delete from teacher_borrowing
            String deleteBorrowingSql = "DELETE FROM teacher_borrowing WHERE book_id = ? AND employers_id = ?";
            statement = connection.prepareStatement(deleteBorrowingSql);
            statement.setInt(1, bookID);
            statement.setString(2, employerID);
            statement.executeUpdate();
            statement.close();

            // Delete from teacher_list
            String deleteListSql = "DELETE FROM teacher_list WHERE employers_id = ?";
            statement = connection.prepareStatement(deleteListSql);
            statement.setString(1, employerID);
            statement.executeUpdate();

            // Commit transaction
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                if (connection != null) {
                    connection.rollback();
                }
            } catch (SQLException rollbackEx) {
                rollbackEx.printStackTrace();
            }
        } finally {
            try {
                if (statement != null) statement.close();
                if (connection != null) connection.setAutoCommit(true);  // Reset auto-commit to true
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        // Inform the user that the book was returned successfully
        panel_content.removeAll();

                        // Create a new instance of WhosBorrowingPanel and pass panel_content
                        NoPenaltyDuePanel noPenaltyDuePanel = new NoPenaltyDuePanel(panel_content);

                        // Add WhosBorrowingPanel to panel_content JPanel
                        panel_content.add(noPenaltyDuePanel);

                        // Make panel_content JPanel visible
                        panel_content.setVisible(true);

                        // Repaint and revalidate panel_content JPanel
                        panel_content.revalidate();
                        panel_content.repaint();

                        // Update the database and set book status to "Available"
                        updateDatabase(bookID, studentID);
                        updateBookStatus(bookID, "Available");
                        clearFields();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //END
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public String getBookID() {
        return bookID;
    }

    public String getStudentID() {
        return studentID;
    }
    
    

    public void setBookInfo(String bookID, String studentID, int penaltyAmount) {
        this.bookID = bookID;
        this.studentID = studentID;
        this.penaltyAmount = penaltyAmount;
    }

    
    public void updateDatabase(int bookID, String studentID, int amountPaid) {
            if (amountPaid >= penaltyAmount) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = DatabaseConnection.getConnection();

            // Begin transaction
            connection.setAutoCommit(false);

            // Update the book status
            String updateBookStatusSql = "UPDATE books SET status = 'Available' WHERE id = ?";
            statement = connection.prepareStatement(updateBookStatusSql);
            statement.setInt(1, bookID);
            statement.executeUpdate();
            statement.close();

            // Delete the borrowing record from student_borrowing table
            String deleteBorrowingSql = "DELETE FROM student_borrowing WHERE book_id = ? AND student_id = ?";
            statement = connection.prepareStatement(deleteBorrowingSql);
            statement.setInt(1, bookID);
            statement.setString(2, studentID);
            int borrowingDeleted = statement.executeUpdate();
            statement.close();

            // Delete the student record from student_list table
            String deleteStudentSql = "DELETE FROM student_list WHERE student_id = ?";
            statement = connection.prepareStatement(deleteStudentSql);
            statement.setString(1, studentID);
            int studentDeleted = statement.executeUpdate();
            statement.close();

            // Commit transaction
            connection.commit();

            // Check if records were deleted
            if (borrowingDeleted > 0 && studentDeleted > 0) {
                System.out.println("Records deleted successfully.");
            } else {
                System.out.println("No records deleted. Check the book ID and student ID.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                if (connection != null) {
                    connection.rollback();
                }
            } catch (SQLException rollbackEx) {
                rollbackEx.printStackTrace();
            }
        } finally {
            try {
                if (statement != null) statement.close();
                if (connection != null) connection.setAutoCommit(true);  // Reset auto-commit to true
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    } else {
        // Print an error message to debug if this block is executed
        System.out.println("Amount paid is less than the penalty amount. No updates made to the database.");
    }
    }
    
    
    
    
    private LocalDate queryDueDateFromDatabase(String bookID, String studentID) {
        // Query the database to retrieve the due date for the given book and student
        // Implement your database query here and return the due date
        return LocalDate.now(); // Dummy implementation, replace with actual query result
    }
    
    
    
    
    
    
    private LocalDate queryDueDateFromDatabase(int bookID, String studentID) {
        LocalDate dueDate = null;
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            connection = DatabaseConnection.getConnection();
            String sql = "SELECT due_date FROM student_borrowing WHERE book_id = ? AND student_id = ?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1, bookID);
            statement.setString(2, studentID);
            resultSet = statement.executeQuery();

            if (resultSet.next()) {
                dueDate = resultSet.getDate("due_date").toLocalDate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return dueDate;
    }

    private void updateDatabase(int bookID, String studentID) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = DatabaseConnection.getConnection();
            String sql = "DELETE FROM student_borrowing WHERE book_id = ? AND student_id = ?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1, bookID);
            statement.setString(2, studentID);
            statement.executeUpdate();
            
            // Add another SQL statement to delete from another table if needed
            String deleteStudentSql = "DELETE FROM student_list WHERE student_id = ?";
            statement = connection.prepareStatement(deleteStudentSql);
            statement.setString(1, studentID);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    
    
    
    
    
    private void updateBookStatus(int bookID, String status) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = DatabaseConnection.getConnection();
            String sql = "UPDATE books SET status = ? WHERE id = ?";
            statement = connection.prepareStatement(sql);
            statement.setString(1, status);
            statement.setInt(2, bookID);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public BorrowerDetails getStudentBorrowingDetails(int bookId) throws SQLException {
    String url = "jdbc:mysql://localhost:3306/librarydb";
    String user = "root";
    String password = "";
    String sql = "SELECT * FROM student_borrowing WHERE book_id = ?";

    try (Connection connection = DriverManager.getConnection(url, user, password);
         PreparedStatement pstmt = connection.prepareStatement(sql)) {
        pstmt.setInt(1, bookId);
        ResultSet rs = pstmt.executeQuery();

        if (rs.next()) {
            BorrowerDetails details = new BorrowerDetails();
            details.setName(rs.getString("student_name"));
            details.setId(rs.getString("student_id"));
            details.setYearOrDepartment(rs.getString("year"));
            details.setSection(rs.getString("section"));
            details.setContactNo(rs.getString("contact_no"));
            details.setDueDate(rs.getDate("due_date"));
            details.setDateBorrowed(rs.getDate("date_borrowed"));
            details.setCategory(rs.getString("book_category"));
            details.setIsbn(rs.getString("book_isbn"));
            details.setTitle(rs.getString("book_title"));
            return details;
        }
    }
    return null;
}

    public BorrowerDetails getTeacherBorrowingDetails(int bookId) throws SQLException {
    String url = "jdbc:mysql://localhost:3306/librarydb";
    String user = "root";
    String password = "";
    String sql = "SELECT * FROM teacher_borrowing WHERE book_id = ?";

    try (Connection connection = DriverManager.getConnection(url, user, password);
         PreparedStatement pstmt = connection.prepareStatement(sql)) {
        pstmt.setInt(1, bookId);
        ResultSet rs = pstmt.executeQuery();

        if (rs.next()) {
            BorrowerDetails details = new BorrowerDetails();
            details.setName(rs.getString("teachers_name"));
            details.setId(rs.getString("employers_id"));
            details.setYearOrDepartment(rs.getString("department"));
            details.setContactNo(rs.getString("contact_no"));
            details.setDateBorrowed(rs.getDate("date_borrowed"));
            details.setCategory(rs.getString("book_category"));
            details.setIsbn(rs.getString("book_isbn"));
            details.setTitle(rs.getString("book_title"));
            return details;
        }
    }
    return null;
}

    
        private void fetchBookDetails() {
        String bookIdText = book_id.getText();
        if (bookIdText.isEmpty()) {
            return; // If the book ID field is empty, do nothing
        }

        int bookId;
        try {
            bookId = Integer.parseInt(bookIdText);
        } catch (NumberFormatException e) {
            // If the book ID is not a valid integer, show an error message and return
            JOptionPane.showMessageDialog(this, "Please enter a valid book ID.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            BorrowerDetails studentDetails = getStudentBorrowingDetails(bookId);
            if (studentDetails != null) {
                populateFields(studentDetails);
                return;
            }

            BorrowerDetails teacherDetails = getTeacherBorrowingDetails(bookId);
            if (teacherDetails != null) {
                populateFields(teacherDetails);
                due_date.setText("");  // Clear due date for teachers
                returner_section.setText("");  // Clear section for teachers
                return;
            }

                JOptionPane.showMessageDialog(this, "No borrowing record found for the given Book ID.", "No Record Found", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error fetching details: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    private void populateFields(BorrowerDetails details) {
        returner_name.setText(details.getName());
        returner_id.setText(details.getId());
        year_department.setSelectedItem(details.getYearOrDepartment());
        returner_section.setText(details.getSection());
        returner_contact.setText(details.getContactNo());
        due_date.setText(details.getDueDate() != null ? details.getDueDate().toString() : "");
        print_date_borrowed.setText(details.getDateBorrowed() != null ? details.getDateBorrowed().toString() : "");
        book_category.setSelectedItem(details.getCategory());
        book_isbn.setText(details.getIsbn());
        book_title.setText(details.getTitle());
    }

    
    

    public void clearFields() {
        book_id.setText("");
        book_title.setText("");
        book_isbn.setText("");
        book_category.setSelectedItem("Select Category");
        print_date_borrowed.setText("");
        due_date.setText("");
        returner_name.setText("");
        returner_id.setText("");
        year_department.setSelectedItem("Select Option");
        returner_section.setText("");
        returner_contact.setText("");
    }


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private void book_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_book_idActionPerformed

    private void due_dateInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_due_dateInputMethodTextChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_due_dateInputMethodTextChanged

    private void returner_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returner_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_returner_nameActionPerformed

    private void print_date_borrowedInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_print_date_borrowedInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_print_date_borrowedInputMethodTextChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        fetchBookDetails();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        // TODO add your handling code here:

        setVisible(false);

        // Hide the booklist_content JPanel
        JPanel parent = (JPanel) this.getParent();
        parent.setVisible(false);
    }//GEN-LAST:event_closeMouseClicked

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        // TODO add your handling code here:
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_closeMouseEntered

    private void clear_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clear_btnMouseClicked
        // TODO add your handling code here:
        clearFields();
        
    }//GEN-LAST:event_clear_btnMouseClicked

    private void clear_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clear_btnMouseEntered
        // TODO add your handling code here:
        clear_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_clear_btnMouseEntered

    private void clear_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clear_btnMouseExited
        // TODO add your handling code here:
        clear_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_clear_btnMouseExited

    private void return_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_return_btnMouseClicked
        // TODO add your handling code here:
        int bookID = Integer.parseInt(book_id.getText());
        String userID = returner_id.getText();

        // Check if the user is a student or a teacher
        boolean isStudent = isStudent(userID);

        if (isStudent) {
            // Handle student book return
            handleStudentBookReturn(bookID, userID);
        } else {
            // Handle teacher book return
            handleTeacherBookReturn(bookID, userID);
        }
    }//GEN-LAST:event_return_btnMouseClicked

    private void return_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_return_btnMouseEntered
        // TODO add your handling code here:
        return_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_return_btnMouseEntered

    private void return_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_return_btnMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_return_btnMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> book_category;
    private javax.swing.JTextField book_id;
    private javax.swing.JTextField book_isbn;
    private javax.swing.JTextField book_title;
    private javax.swing.JLabel clear_btn;
    private javax.swing.JLabel close;
    private javax.swing.JLabel due_date;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel panel_content;
    private javax.swing.JLabel print_date_borrowed;
    private javax.swing.JLabel return_btn;
    private javax.swing.JTextField returner_contact;
    private javax.swing.JTextField returner_id;
    private javax.swing.JTextField returner_name;
    private javax.swing.JTextField returner_section;
    private javax.swing.JComboBox<String> year_department;
    // End of variables declaration//GEN-END:variables
}
