import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelExporter {

    public void exportToExcel() {
        String url = "jdbc:mysql://localhost:3306/librarydb";
        String user = "root";
        String password = "";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM student_list");
             ResultSet resultSet = preparedStatement.executeQuery()) {

            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Student List");

            // Create header row
            Row headerRow = sheet.createRow(0);
            String[] headers = {"Student ID", "Name", "Year", "Section", "Contact", "Number of Borrowed Books"};
            for (int i = 0; i < headers.length; i++) {
                Cell cell = headerRow.createCell(i);
                cell.setCellValue(headers[i]);
            }

            // Add data rows
            int rowNum = 1;
            while (resultSet.next()) {
                Row row = sheet.createRow(rowNum++);
                row.createCell(0).setCellValue(resultSet.getString("student_id"));
                row.createCell(1).setCellValue(resultSet.getString("student_name"));
                row.createCell(2).setCellValue(resultSet.getString("year"));
                row.createCell(3).setCellValue(resultSet.getString("section"));
                row.createCell(4).setCellValue(resultSet.getString("contact_no"));
                row.createCell(5).setCellValue(resultSet.getInt("borrowed_qty"));
            }

            // Write the output to a file
            try (FileOutputStream fileOut = new FileOutputStream("student_list.xlsx")) {
                workbook.write(fileOut);
            }

            System.out.println("Excel file generated successfully.");

        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ExcelExporter exporter = new ExcelExporter();
        exporter.exportToExcel();
    }
}
