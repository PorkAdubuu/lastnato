import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.DriverManager;

public class BookDAO {

    public List<Book> getAllBooks() {
        List<Book> books = new ArrayList<>();
        String query = "SELECT * FROM Books";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement stmt = connection.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Book book = new Book(
                    rs.getInt("id"),
                    rs.getString("title"),
                    rs.getString("isbn"),
                    rs.getString("category"),
                    rs.getString("author"),
                    rs.getString("copyright"),
                    rs.getString("publisher"),
                    rs.getString("status")
                );
                books.add(book);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return books;
    }
    
    
            public void updateBookStatus(int bookId, String status) {
            String query = "UPDATE books SET status = ? WHERE id = ?";

            try (Connection connection = DatabaseConnection.getConnection();
                 PreparedStatement pstmt = connection.prepareStatement(query)) {

                pstmt.setString(1, status);
                pstmt.setInt(2, bookId);

                pstmt.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
            
            public String getBookStatus(int bookId) throws SQLException {
        String status = "";
        String url = "jdbc:mysql://localhost:3306/librarydb";
        String user = "root";
        String password = "";
        String sql = "SELECT status FROM books WHERE id = ?";
        
        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, bookId);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                status = rs.getString("status");
            }
        }

        return status;
    }


    
    
    
    
    
    
    
    
    
    
    
    
    
}
