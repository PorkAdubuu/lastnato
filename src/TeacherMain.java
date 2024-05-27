
import javax.swing.JFrame;

public class TeacherMain {
    public static void main(String[] args) {
        // Update the teacher_list table
        TeacherListDAO teacherListDAO = new TeacherListDAO();
        teacherListDAO.updateTeacherList();

        // Create and display the StudentListPanel
        JFrame frame = new JFrame("Teacher List");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new TeacherListPanel());
        frame.pack();
        frame.setVisible(true);
    }
}
