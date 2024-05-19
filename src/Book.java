public class Book {
    private int id;
    private String title;
    private String isbn;
    private String category;
    private String author;
    private String copyright;
    private String publisher;
    private String status;

    public Book(int id, String title, String isbn, String category, String author, String copyright, String publisher, String status) {
        this.id = id;
        this.title = title;
        this.isbn = isbn;
        this.category = category;
        this.author = author;
        this.copyright = copyright;
        this.publisher = publisher;
        this.status = status;
    }

    // Getters and Setters
    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getIsbn() { return isbn; }
    public String getCategory() { return category; }
    public String getAuthor() { return author; }
    public String getCopyright() { return copyright; }
    public String getPublisher() { return publisher; }
    public String getStatus() { return status; }
}
