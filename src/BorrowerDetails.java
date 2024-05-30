public class BorrowerDetails {
    private String name;
    private String id;
    private String yearOrDepartment;
    private String section;
    private String contactNo;
    private java.sql.Date dueDate;
    private java.sql.Date dateBorrowed;
    private String category;
    private String isbn;
    private String title;

    // Getters and Setters for all fields

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getYearOrDepartment() {
        return yearOrDepartment;
    }

    public void setYearOrDepartment(String yearOrDepartment) {
        this.yearOrDepartment = yearOrDepartment;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public java.sql.Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(java.sql.Date dueDate) {
        this.dueDate = dueDate;
    }

    public java.sql.Date getDateBorrowed() {
        return dateBorrowed;
    }

    public void setDateBorrowed(java.sql.Date dateBorrowed) {
        this.dateBorrowed = dateBorrowed;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
