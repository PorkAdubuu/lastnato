
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class AddBookPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddBookPanel
     */
    public AddBookPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title_txtf2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        book_icon = new javax.swing.JLabel();
        addook_ttl = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        title_txtf = new javax.swing.JTextField();
        isbn_txtf = new javax.swing.JTextField();
        author_txtf = new javax.swing.JTextField();
        copyright_txtf = new javax.swing.JTextField();
        publisher_txtf = new javax.swing.JTextField();
        category_combo = new javax.swing.JComboBox<>();
        addBook_btn = new javax.swing.JLabel();

        title_txtf2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(133, 177, 255));

        book_icon.setBackground(new java.awt.Color(255, 255, 255));
        book_icon.setForeground(new java.awt.Color(255, 255, 255));
        book_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lastnato/bookiki.png"))); // NOI18N

        addook_ttl.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        addook_ttl.setForeground(new java.awt.Color(255, 255, 255));
        addook_ttl.setText("Book Details");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Title:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Category:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ISBN:");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Author:");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Copyright:");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Publisher:");

        title_txtf.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        isbn_txtf.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        isbn_txtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isbn_txtfActionPerformed(evt);
            }
        });

        author_txtf.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        copyright_txtf.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        publisher_txtf.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        category_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Category", "Fiction", "Non-Fiction", "Academic", " " }));

        addBook_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lastnato/addbook-btnn.png"))); // NOI18N
        addBook_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBook_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addBook_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addBook_btnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9))
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(title_txtf, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(isbn_txtf, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(author_txtf, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(copyright_txtf, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(publisher_txtf, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(category_combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(book_icon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addook_ttl))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(addBook_btn)))
                .addContainerGap(276, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(book_icon)
                    .addComponent(addook_ttl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(title_txtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(isbn_txtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(category_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(author_txtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(copyright_txtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(publisher_txtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addBook_btn)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 350));
    }// </editor-fold>//GEN-END:initComponents

    private void isbn_txtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isbn_txtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isbn_txtfActionPerformed

    private void addBook_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBook_btnMouseClicked
        // TODO add your handling code here:
        addBook();
    }//GEN-LAST:event_addBook_btnMouseClicked

    private void addBook_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBook_btnMouseEntered
        // TODO add your handling code here:
        addBook_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_addBook_btnMouseEntered

    private void addBook_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBook_btnMouseExited
        // TODO add your handling code here:
        addBook_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_addBook_btnMouseExited
        
        private void clearFields() {
        title_txtf.setText("");
        isbn_txtf.setText("");
        category_combo.setSelectedIndex(0);
        author_txtf.setText("");
        copyright_txtf.setText("");
        publisher_txtf.setText("");
       
    }
        
        private void addBook() {
        
        // Add book to the database
        String title = title_txtf.getText();
        String isbn = isbn_txtf.getText();
        String category = (String) category_combo.getSelectedItem(); // Get selected category
        String author = author_txtf.getText();
        String copyright = copyright_txtf.getText();
        String publisher = publisher_txtf.getText();

        // Check if any of the required fields are blank
        if (title.isEmpty() || isbn.isEmpty() || author.isEmpty() || copyright.isEmpty()
                || publisher.isEmpty() || category.equals("Select Category")) {
            JOptionPane.showMessageDialog(this, "Please fill in all required fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Stop further execution
        }

        // Set status to "available"
        String status = "Available";

        // Database connection parameters
        String url = "jdbc:mysql://localhost:3306/librarydb";
        String user = "root";
        String password = "";

        // SQL query to insert a new book
        String sql = "INSERT INTO books (title, isbn, category, author, copyright, publisher, status) "
                   + "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = connection.prepareStatement(sql)) {

            // Set parameters
            pstmt.setString(1, title);
            pstmt.setString(2, isbn);
            pstmt.setString(3, category);
            pstmt.setString(4, author);
            pstmt.setString(5, copyright);
            pstmt.setString(6, publisher);
            pstmt.setString(7, status); // Set status to "available"

            // Execute the insert statement
            pstmt.executeUpdate();

            JOptionPane.showMessageDialog(this, "Book added successfully!");

            // Clear input fields after adding
            clearFields();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error adding book: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addBook_btn;
    private javax.swing.JLabel addook_ttl;
    private javax.swing.JTextField author_txtf;
    private javax.swing.JLabel book_icon;
    private javax.swing.JComboBox<String> category_combo;
    private javax.swing.JTextField copyright_txtf;
    private javax.swing.JTextField isbn_txtf;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField publisher_txtf;
    private javax.swing.JTextField title_txtf;
    private javax.swing.JTextField title_txtf2;
    // End of variables declaration//GEN-END:variables
}
