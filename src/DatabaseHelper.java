import java.time.LocalDate;

public class DatabaseHelper {
    // Assume this method retrieves the due date for a given bookID and studentID from the database
    public static LocalDate queryDueDateFromDatabase(Integer bookID, String studentID) {
        // Implementation to query the database and retrieve the due date
        // You would typically use JDBC or an ORM framework to interact with the database
        // For the sake of this example, let's return a dummy due date (e.g., current date + 14 days)
        return LocalDate.now().plusDays(14);
    }
}
