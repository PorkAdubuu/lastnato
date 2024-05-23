import javax.swing.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.util.HashMap;
import java.util.Map;



public class BookBorrowingPanel extends javax.swing.JPanel {

    private final JPanel panelContent;
    private final BookDAO bookDAO = new BookDAO();
    private Map<String, Integer> booksBorrowedByStudent = new HashMap<>();
    private String url = "jdbc:mysql://localhost:3306/librarydb";
    private String user = "root";
    private String password = "";

    
    public BookBorrowingPanel(JPanel panelContent) {
        this.panelContent = panelContent;
        initComponents();
        customInitComponents();
        
       book_category.addItem("Fiction");
       book_category.addItem("Non-Fiction");
       book_category.addItem("Academic");
       
       book_id.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                fetchBookDetails();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                fetchBookDetails();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                fetchBookDetails();
            }
        });
                
        
    }
    private void customInitComponents() {
        // Add PropertyChangeListener to date_borrowed
        date_borrowed.getDateEditor().addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                if ("date".equals(evt.getPropertyName())) {
                    calculateDueDate();
                }
            }
        });
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        stdnt_name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        stdnt_yr_sec = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        stdnt_contact = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        book_category = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        book_id = new javax.swing.JTextField();
        book_isbn = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        book_title = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        date_borrowed = new com.toedter.calendar.JDateChooser();
        stdnt_id = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        print_due = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1290, 463));
        setPreferredSize(new java.awt.Dimension(1290, 463));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(70, 134, 242));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lastnato/back.png"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lastnato/booklist-icon.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Book Borrowing");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(375, 375, 375)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(475, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 60));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Name");

        stdnt_name.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        stdnt_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stdnt_nameActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Year/Section");

        stdnt_yr_sec.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Contact no.");

        stdnt_contact.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("Book Category");

        book_category.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        book_category.setToolTipText("");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setText("Book ID");

        book_id.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        book_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_idActionPerformed(evt);
            }
        });

        book_isbn.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setText("ISBN");

        book_title.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setText("Book Title");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel11.setText("Date Borrowed");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel12.setText("Due Date");

        stdnt_id.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel13.setText("Student ID");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        print_due.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        print_due.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                print_dueInputMethodTextChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(print_due, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(print_due, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(stdnt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(264, 264, 264)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(book_title, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(book_id, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(date_borrowed, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(134, 134, 134))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addComponent(stdnt_contact, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                            .addComponent(jLabel5)
                            .addComponent(stdnt_yr_sec, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(stdnt_name))
                        .addGap(264, 264, 264)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(book_category, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(book_isbn, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stdnt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(book_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(date_borrowed, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(stdnt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(stdnt_yr_sec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(stdnt_contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(book_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(book_isbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(book_category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 1250, 350));

        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 440, -1, -1));

        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 440, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginWindow().setVisible(true);
            }
        });
    }
    
    //method for clear button
            private void clearFields() {
            // Clear text fields
            stdnt_name.setText("");
            stdnt_id.setText("");
            stdnt_yr_sec.setText("");
            stdnt_contact.setText("");
            book_id.setText("");
            book_title.setText("");
            book_isbn.setText("");

            // Reset combo box
            book_category.setSelectedIndex(0);

            // Clear date chooser
            date_borrowed.setDate(null);

            // Clear due date label
            print_due.setText("");
        }

     
            
            //method for fetching book 
            private void fetchBookDetails() {
                int bookId = Integer.parseInt(book_id.getText());
                String url = "jdbc:mysql://localhost:3306/librarydb";
                String user = "root";
                String password = "";

                String sql = "SELECT title, isbn, category FROM books WHERE id = ?";

                try (Connection connection = DriverManager.getConnection(url, user, password);
                     PreparedStatement pstmt = connection.prepareStatement(sql)) {

                    pstmt.setInt(1, bookId);

                    try (ResultSet rs = pstmt.executeQuery()) {
                        if (rs.next()) {
                            book_title.setText(rs.getString("title"));
                            book_isbn.setText(rs.getString("isbn"));
                            book_category.setSelectedItem(rs.getString("category"));
                        } else {
                            // Clear fields if book ID is not found
                            book_title.setText("");
                            book_isbn.setText("");
                            book_category.setSelectedIndex(-1);
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                    // Handle SQLException
                }
            }
            
            

            // Method to decrement the count when a book is returned by a student
            private void decrementBookCount(String studentId) {
                if (booksBorrowedByStudent.containsKey(studentId)) {
                    int currentCount = booksBorrowedByStudent.get(studentId);
                    if (currentCount > 0) {
                        booksBorrowedByStudent.put(studentId, currentCount - 1);
                    }
                }
            }

            
            private void incrementBookCount(String studentId) {
            // Increment the count of books borrowed by the student in the database
            String updateQuery = "UPDATE student SET borrowed_books = borrowed_books + 1 WHERE student_id = ?";
            try (Connection connection = DriverManager.getConnection(url, user, password);
                 PreparedStatement pstmt = connection.prepareStatement(updateQuery)) {
                pstmt.setString(1, studentId);
                pstmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace(); // Handle the exception appropriately
            }
        }
            
            private boolean canBorrowBook(String studentId) {
            // Query the database to check how many books the student has borrowed
            String query = "SELECT COUNT(*) FROM student_borrowing WHERE student_id = ?";
            try (Connection connection = DriverManager.getConnection(url, user, password);
                 PreparedStatement pstmt = connection.prepareStatement(query)) {
                pstmt.setString(1, studentId);
                try (ResultSet rs = pstmt.executeQuery()) {
                    if (rs.next()) {
                        int borrowedBooks = rs.getInt(1);
                        return borrowedBooks < 2; // Returns true if the student can borrow more books
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace(); // Handle the exception appropriately
            }
            return false; // Return false by default if an error occurs
        }

        
            
    //method for due date 
        private void calculateDueDate() {
        Date borrowedDate = date_borrowed.getDate();
        Calendar cal = Calendar.getInstance();
        cal.setTime(borrowedDate);
        cal.add(Calendar.DAY_OF_YEAR, 3); // Add 3 days for students
        Date dueDate = cal.getTime();

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yy");
        print_due.setText(sdf.format(dueDate));
    }
        
        //method for sumbitting 
        private void submitBorrowingDetails() {
            String studentName = stdnt_name.getText();
            String studentId = stdnt_id.getText();
            String yearSection = stdnt_yr_sec.getText();
            String contactNo = stdnt_contact.getText();
            int bookId = Integer.parseInt(book_id.getText());
            String bookTitle = book_title.getText();
            String bookIsbn = book_isbn.getText();
            String bookCategory = book_category.getSelectedItem().toString();
            Date borrowedDate = date_borrowed.getDate();

            // Calculate due date
            Calendar cal = Calendar.getInstance();
            cal.setTime(borrowedDate);
            cal.add(Calendar.DAY_OF_YEAR, 3);
            Date dueDate = cal.getTime();

            String url = "jdbc:mysql://localhost:3306/librarydb";
            String user = "root";
            String password = "";

            String sql = "INSERT INTO student_borrowing (student_name, student_id, year_section, contact_no, book_id, book_title, book_isbn, book_category, date_borrowed, due_date) "
                       + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            try (Connection connection = DriverManager.getConnection(url, user, password);
                 PreparedStatement pstmt = connection.prepareStatement(sql)) {

                pstmt.setString(1, studentName);
                pstmt.setString(2, studentId);
                pstmt.setString(3, yearSection);
                pstmt.setString(4, contactNo);
                pstmt.setInt(5, bookId);
                pstmt.setString(6, bookTitle);
                pstmt.setString(7, bookIsbn);
                pstmt.setString(8, bookCategory);
                pstmt.setDate(9, new java.sql.Date(borrowedDate.getTime()));
                pstmt.setDate(10, new java.sql.Date(dueDate.getTime()));

                // Check if the book is available for borrowing or reserved by the same student
                String status = bookDAO.getBookStatus(bookId);
                boolean isBookBorrowed = isBookAlreadyBorrowed(studentId, bookId);

                if (status.equals("Available") || (!isBookBorrowed && status.equals("Reserved"))) {
                    // Proceed with borrowing
                    // Check if the student can borrow another book
                    if (canBorrowBook(studentId)) {
                        // Increment the count of books borrowed by the student
                        incrementBookCount(studentId);

                        // Set status based on borrowing date
                        Date today = new Date();
                        boolean sameDay = borrowedDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate()
                                           .equals(today.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
                        String borrowingStatus = sameDay ? "Borrowed" : "Reserved";

                        // Update book status
                        bookDAO.updateBookStatus(bookId, borrowingStatus);

                        JOptionPane.showMessageDialog(this, "Borrowing details submitted successfully!");
                    } else {
                        // Display a message indicating that the student has reached the borrowing limit
                        JOptionPane.showMessageDialog(this, "This student has reached the maximum borrowing limit (2 books).", "Borrowing Limit Exceeded", JOptionPane.WARNING_MESSAGE);
                    }
                } else {
                    // Book is not available for borrowing or already reserved by another student
                    JOptionPane.showMessageDialog(this, "This book is not available for borrowing.", "Book Unavailable", JOptionPane.WARNING_MESSAGE);
                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error submitting borrowing details: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        private boolean isBookAlreadyBorrowed(String studentId, int bookId) {
            String query = "SELECT COUNT(*) FROM student_borrowing WHERE student_id = ? AND book_id = ?";
            try (Connection connection = DriverManager.getConnection(url, user, password);
                 PreparedStatement pstmt = connection.prepareStatement(query)) {
                pstmt.setString(1, studentId);
                pstmt.setInt(2, bookId);
                try (ResultSet rs = pstmt.executeQuery()) {
                    if (rs.next()) {
                        int count = rs.getInt(1);
                        return count > 0; // Returns true if the book is already borrowed by the student
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace(); // Handle the exception appropriately
            }
            return false; // Return false by default if an error occurs
        }





        
       
    



    
    private void stdnt_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stdnt_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stdnt_nameActionPerformed

    private void book_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_book_idActionPerformed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        panelContent.removeAll();

        // Create a new instance of WhosBorrowingPanel and pass panel_content
        WhosBorrowingPanel whosBorrowingPanel = new WhosBorrowingPanel(panelContent);

        // Add WhosBorrowingPanel to panelContent
        panelContent.add(whosBorrowingPanel);

        // Make panelContent JPanel visible
        panelContent.setVisible(true);

        // Repaint and revalidate panelContent JPanel
        panelContent.revalidate();
        panelContent.repaint();
        
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        submitBorrowingDetails();           
    }//GEN-LAST:event_jButton2ActionPerformed

    private void print_dueInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_print_dueInputMethodTextChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_print_dueInputMethodTextChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        clearFields();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> book_category;
    private javax.swing.JTextField book_id;
    private javax.swing.JTextField book_isbn;
    private javax.swing.JTextField book_title;
    private com.toedter.calendar.JDateChooser date_borrowed;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel print_due;
    private javax.swing.JTextField stdnt_contact;
    private javax.swing.JTextField stdnt_id;
    private javax.swing.JTextField stdnt_name;
    private javax.swing.JTextField stdnt_yr_sec;
    // End of variables declaration//GEN-END:variables
}
