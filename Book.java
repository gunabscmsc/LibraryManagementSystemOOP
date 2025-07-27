class Book {
    private String bookId;
    private String title;
    private String author;
    private boolean isAvailable;

    Book(String bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getBookId() { return bookId; }
    public String getTitle() { return title; }
    public boolean isAvailable() { return isAvailable; }

    public void borrowBook() { isAvailable = false; }
    public void returnBook() { isAvailable = true; }

    public void displayInfo() {
        System.out.println("ID: " + bookId + ", Title: " + title + ", Author: " + author + ", Available: " + isAvailable);
    }
}