

import java.awt.Component;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

import javax.swing.ImageIcon;





/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Neighas
 */
public class DashboardLibrary extends javax.swing.JFrame {

   private BooklistPanel booklistPanel;
   
    public DashboardLibrary() {
        initComponents();
        setLocationRelativeTo(null);
        
        // Create the BooklistPanel instance
        booklistPanel = new BooklistPanel();

        // Add the BooklistPanel to panel_content
        panel_content.add(booklistPanel);

        // Make booklist_content JPanel visible
        panel_content.setVisible(false);
        
        
                    java.net.URL imageURL = getClass().getResource("/lastnato/logo.png");
            if (imageURL != null) {
                try {
                    BufferedImage img = ImageIO.read(imageURL);
                    if (img != null) {
                        ImageIcon icon = new ImageIcon(img.getScaledInstance(logo.getWidth(), logo.getHeight(), BufferedImage.SCALE_SMOOTH));

                        logo.setIcon(icon);
                    }
                } catch (IOException ex) {
                    System.err.println("Error loading image: " + ex.getMessage());
                }
            } else {
                System.err.println("Resource not found: /lastnato/logo.png");
            }
            
            imageURL = getClass().getResource("/lastnato/newbg.png");
            if (imageURL != null) {
                try {
                    BufferedImage img = ImageIO.read(imageURL);
                    if (img != null) {
                        ImageIcon icon = new ImageIcon(img.getScaledInstance(bg_dash.getWidth(), bg_dash.getHeight(), BufferedImage.SCALE_SMOOTH));

                        bg_dash.setIcon(icon);
                    }
                } catch (IOException ex) {
                    System.err.println("Error loading image: " + ex.getMessage());
                }
            } else {
                System.err.println("Resource not found: /images/bg-dashboard.png");
            }
            
            BooklistPanel booklistPanel = new BooklistPanel();

    
        
        
    }
    
    
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_content = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        search_btn = new javax.swing.JLabel();
        search_bar = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bg_dash = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        booklist_btn = new javax.swing.JLabel();
        student_btn = new javax.swing.JLabel();
        teacher_btn = new javax.swing.JLabel();
        borrowing_btn = new javax.swing.JLabel();
        returning_btn = new javax.swing.JLabel();
        penalty_btn = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_content.setBackground(new java.awt.Color(255, 255, 255));
        panel_content.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel_content.setFocusCycleRoot(true);
        panel_content.setLayout(new java.awt.BorderLayout());
        getContentPane().add(panel_content, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 1280, 480));

        jLabel16.setFont(new java.awt.Font("Arial Black", 1, 30)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("What are you looking for?");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, -1, -1));

        search_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lastnato/search-icon.png"))); // NOI18N
        search_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                search_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                search_btnMouseExited(evt);
            }
        });
        getContentPane().add(search_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 270, 40, 40));

        search_bar.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        search_bar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_barActionPerformed(evt);
            }
        });
        // Assuming your parent container is a JPanel named panel_content
        getContentPane().add(search_bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 470, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lastnato/ad2.JPG"))); // NOI18N

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lastnato/ad3.PNG"))); // NOI18N

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lastnato/ad1.PNG"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(70, 134, 242));
        jLabel7.setText("Browse");

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(70, 134, 242));
        jLabel8.setText("Borrow");

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(70, 134, 242));
        jLabel9.setText("Return");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel10.setText("Explore endless stories with a simple");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel11.setText("search.");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel12.setText("Your next great read is just a click");

        jLabel13.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel13.setText("away.");

        jLabel14.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel14.setText("Easily return book and keep the");

        jLabel15.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel15.setText("adventure going.");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(39, 39, 39))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addGap(132, 132, 132))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addGap(228, 228, 228))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 1050, 270));

        jPanel1.setBackground(new java.awt.Color(70, 134, 242));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lastnato/logo.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel1.setText("UNIVERSITY OF MAKATI");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(681, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(37, 37, 37))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 130));

        bg_dash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lastnato/newbg.png"))); // NOI18N
        getContentPane().add(bg_dash, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 1370, 440));

        jPanel6.setBackground(new java.awt.Color(239, 237, 47));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Borrowers List:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("|");

        booklist_btn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        booklist_btn.setText("Book List |");
        booklist_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                booklist_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                booklist_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                booklist_btnMouseExited(evt);
            }
        });

        student_btn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        student_btn.setText("Student");
        student_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                student_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                student_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                student_btnMouseExited(evt);
            }
        });

        teacher_btn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        teacher_btn.setText("Teacher");
        teacher_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                teacher_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                teacher_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                teacher_btnMouseExited(evt);
            }
        });

        borrowing_btn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        borrowing_btn.setText("Book Borrowing |");
        borrowing_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                borrowing_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                borrowing_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                borrowing_btnMouseExited(evt);
            }
        });

        returning_btn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        returning_btn.setText("Book Returning |");
        returning_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returning_btnMouseClicked(evt);
            }
        });

        penalty_btn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        penalty_btn.setText("Penalty");
        penalty_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                penalty_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(750, Short.MAX_VALUE)
                .addComponent(booklist_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(student_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(teacher_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(borrowing_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(returning_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(penalty_btn)
                .addGap(50, 50, 50))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(booklist_btn)
                    .addComponent(student_btn)
                    .addComponent(teacher_btn)
                    .addComponent(borrowing_btn)
                    .addComponent(returning_btn)
                    .addComponent(penalty_btn))
                .addGap(531, 531, 531))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1370, 32));

        jPanel2.setBackground(new java.awt.Color(243, 243, 243));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 1370, 170));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void booklist_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booklist_btnMouseClicked
        // TODO add your handling code here:
        panel_content.removeAll();

        // Create a new instance of BooklistPanel
        BooklistPanel booklistPanel = new BooklistPanel();

        // Add BooklistPanel to booklist_content JPanel
        panel_content.add(booklistPanel);

        // Make booklist_content JPanel visible
        panel_content.setVisible(true);

        // Repaint booklist_content JPanel
        panel_content.revalidate();
        panel_content.repaint();
    }//GEN-LAST:event_booklist_btnMouseClicked

    

    
    
    
    private void student_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_student_btnMouseClicked
        // TODO add your handling code here:
        panel_content.removeAll();

        // Create a new instance of WhosBorrowingPanel and pass panel_content
        StudentListPanel StudentlistPanel = new StudentListPanel();

        // Add WhosBorrowingPanel to panel_content JPanel
        panel_content.add(StudentlistPanel);

        // Make panel_content JPanel visible
        panel_content.setVisible(true);

        // Repaint and revalidate panel_content JPanel
        panel_content.revalidate();
        panel_content.repaint();
    }//GEN-LAST:event_student_btnMouseClicked

    private void teacher_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacher_btnMouseClicked
        // TODO add your handling code here:
        panel_content.removeAll();

        // Create a new instance of WhosBorrowingPanel and pass panel_content
        TeacherListPanel teacherListPanel = new TeacherListPanel();

        // Add WhosBorrowingPanel to panel_content JPanel
        panel_content.add(teacherListPanel);

        // Make panel_content JPanel visible
        panel_content.setVisible(true);

        // Repaint and revalidate panel_content JPanel
        panel_content.revalidate();
        panel_content.repaint();
    }//GEN-LAST:event_teacher_btnMouseClicked

    private void borrowing_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrowing_btnMouseClicked
        // TODO add your handling code here:
        panel_content.removeAll();

        // Create a new instance of WhosBorrowingPanel and pass panel_content
        WhosBorrowingPanel whosBorrowingPanel = new WhosBorrowingPanel(panel_content);

        // Add WhosBorrowingPanel to panel_content JPanel
        panel_content.add(whosBorrowingPanel);

        // Make panel_content JPanel visible
        panel_content.setVisible(true);

        // Repaint and revalidate panel_content JPanel
        panel_content.revalidate();
        panel_content.repaint();
    }//GEN-LAST:event_borrowing_btnMouseClicked

    private void returning_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returning_btnMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_returning_btnMouseClicked

    private void penalty_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_penalty_btnMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_penalty_btnMouseClicked

    private void booklist_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booklist_btnMouseEntered
        // TODO add your handling code here:
        booklist_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_booklist_btnMouseEntered

    private void booklist_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booklist_btnMouseExited
        // TODO add your handling code here:
        booklist_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_booklist_btnMouseExited

    private void student_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_student_btnMouseEntered
        // TODO add your handling code here:
        student_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_student_btnMouseEntered

    private void student_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_student_btnMouseExited
        // TODO add your handling code here:
        student_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_student_btnMouseExited

    private void teacher_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacher_btnMouseEntered
        // TODO add your handling code here:
        teacher_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_teacher_btnMouseEntered

    private void teacher_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacher_btnMouseExited
        // TODO add your handling code here:
        teacher_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_teacher_btnMouseExited

    private void borrowing_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrowing_btnMouseEntered
        // TODO add your handling code here:
        borrowing_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_borrowing_btnMouseEntered

    private void borrowing_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrowing_btnMouseExited
        // TODO add your handling code here:
        borrowing_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_borrowing_btnMouseExited

    private void search_barActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_barActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_barActionPerformed

    private void search_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_btnMouseClicked
        // Retrieve the search query from the search bar
    // Retrieve the search query from the search bar
    String query = search_bar.getText();

    // Ensure booklistPanel is not null
    
        
        panel_content.removeAll();

        // Create a new instance of BooklistPanel
        BooklistPanel booklistPanel = new BooklistPanel();

        // Add BooklistPanel to booklist_content JPanel
        panel_content.add(booklistPanel);
        // Make booklist_content JPanel visible
        panel_content.setVisible(true);

        // Repaint booklist_content JPanel
        panel_content.revalidate();
        panel_content.repaint();
        
        if (booklistPanel != null) {
        // Call the searchBooksFromDashboard method of the BooklistPanel
        booklistPanel.searchBooksFromDashboard(query);
    } else {
        System.out.println("BooklistPanel is not properly initialized.");
    }

        
    }//GEN-LAST:event_search_btnMouseClicked

    private void search_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_btnMouseEntered
        // TODO add your handling code here:
        search_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_search_btnMouseEntered

    private void search_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_btnMouseExited
        // TODO add your handling code here:
        search_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_search_btnMouseExited

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(DashboardLibrary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardLibrary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardLibrary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardLibrary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardLibrary().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg_dash;
    private javax.swing.JLabel booklist_btn;
    private javax.swing.JLabel borrowing_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel panel_content;
    private javax.swing.JLabel penalty_btn;
    private javax.swing.JLabel returning_btn;
    private javax.swing.JTextField search_bar;
    private javax.swing.JLabel search_btn;
    private javax.swing.JLabel student_btn;
    private javax.swing.JLabel teacher_btn;
    // End of variables declaration//GEN-END:variables
}
