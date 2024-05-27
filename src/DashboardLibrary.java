
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Neighas
 */
public class DashboardLibrary extends javax.swing.JFrame {

    /**
     * Creates new form DashboardLibrary
     */
    public DashboardLibrary() {
        initComponents();
        
        
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
            
            imageURL = getClass().getResource("/lastnato/bg-dashboard.png");
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
            
            // popup logged in as admin using Joptionpane
            
            JOptionPane.showMessageDialog(this, "Logged in as ADMIN");
        
        
        
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
        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        booklist_btn = new javax.swing.JButton();
        student_btn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        teacher_btn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        bg_dash = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_content.setFocusCycleRoot(true);
        panel_content.setLayout(new java.awt.BorderLayout());
        getContentPane().add(panel_content, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 1280, 480));

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lastnato/logo.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("UNIVERSITY OF MAKATI");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(700, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 150));

        jPanel6.setBackground(new java.awt.Color(0, 0, 204));

        booklist_btn.setBackground(new java.awt.Color(0, 0, 204));
        booklist_btn.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        booklist_btn.setForeground(new java.awt.Color(255, 255, 255));
        booklist_btn.setText("Book List |");
        booklist_btn.setBorder(null);
        booklist_btn.setBorderPainted(false);
        booklist_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booklist_btnActionPerformed(evt);
            }
        });

        student_btn.setBackground(new java.awt.Color(0, 0, 204));
        student_btn.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        student_btn.setForeground(new java.awt.Color(255, 255, 255));
        student_btn.setText("Student");
        student_btn.setBorder(null);
        student_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_btnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Borrowers List:");

        teacher_btn.setBackground(new java.awt.Color(0, 0, 204));
        teacher_btn.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        teacher_btn.setForeground(new java.awt.Color(255, 255, 255));
        teacher_btn.setText("Teacher |");
        teacher_btn.setBorder(null);
        teacher_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacher_btnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("/");

        jButton4.setBackground(new java.awt.Color(0, 0, 204));
        jButton4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Book Borrowing |");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 0, 204));
        jButton5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Book Returning |");
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 0, 204));
        jButton6.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Penalty ");
        jButton6.setBorder(null);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(601, Short.MAX_VALUE)
                .addComponent(booklist_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(student_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(teacher_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addGap(45, 45, 45))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(booklist_btn)
                    .addComponent(student_btn)
                    .addComponent(jLabel2)
                    .addComponent(teacher_btn)
                    .addComponent(jLabel3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(531, 531, 531))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, -1, 32));

        bg_dash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lastnato/bg-dashboard.png"))); // NOI18N
        bg_dash.setText("jLabel4");
        getContentPane().add(bg_dash, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 1370, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void booklist_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booklist_btnActionPerformed
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

    }//GEN-LAST:event_booklist_btnActionPerformed

    private void student_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_student_btnActionPerformed
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
    }//GEN-LAST:event_student_btnActionPerformed

    private void teacher_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacher_btnActionPerformed
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
    }//GEN-LAST:event_teacher_btnActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
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
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:

        panel_content.removeAll();
        /*
        // Create a new instance of BooklistPanel
        BookreturningPanel bookreturningPanel = new BookreturningPanel();

        // Add BooklistPanel to booklist_content JPanel
        panel_content.add(bookreturningPanel);

        // Make booklist_content JPanel visible
        panel_content.setVisible(true);

        // Repaint booklist_content JPanel
        panel_content.revalidate();
        panel_content.repaint(); */
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:

        panel_content.removeAll();
        /*
        // Create a new instance of BooklistPanel
        PenaltyPanel penaltyPanel = new PenaltyPanel();

        // Add BooklistPanel to booklist_content JPanel
        panel_content.add(penaltyPanel);

        // Make booklist_content JPanel visible
        panel_content.setVisible(true);

        // Repaint booklist_content JPanel
        panel_content.revalidate();
        panel_content.repaint();*/

    }//GEN-LAST:event_jButton6ActionPerformed

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
    private javax.swing.JButton booklist_btn;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel panel_content;
    private javax.swing.JButton student_btn;
    private javax.swing.JButton teacher_btn;
    // End of variables declaration//GEN-END:variables
}
