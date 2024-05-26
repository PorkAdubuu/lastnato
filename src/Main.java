
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        // Update the student_list table
        StudentListDAO studentListDAO = new StudentListDAO();
        studentListDAO.updateStudentList();

        // Create and display the StudentListPanel
        JFrame frame = new JFrame("Student List");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new StudentListPanel());
        frame.pack();
        frame.setVisible(true);
    }
}
