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
            headerRow.createCell(0).setCellValue("Student ID");
            headerRow.createCell(1).setCellValue("Name");
            headerRow.createCell(2).setCellValue("Year");
            headerRow.createCell(3).setCellValue("Section");
            headerRow.createCell(4).setCellValue("Contact");
            headerRow.createCell(5).setCellValue("Number of Borrowed Books");

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
