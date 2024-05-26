import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdateStudentListButtonListener implements ActionListener {
    private StudentListDAO dao;

    public UpdateStudentListButtonListener(StudentListDAO dao) {
        this.dao = dao;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Call the method in StudentListDAO to update student_list
        dao.updateStudentList();
    }
}
