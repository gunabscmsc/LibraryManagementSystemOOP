import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void removeBook(String bookId) {
        books.removeIf(b -> b.getBookId().equals(bookId));
        System.out.println("Book removed: " + bookId);
    }

    public Book searchBook(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                b.displayInfo();
                return b;
            }
        }
        System.out.println("Book not found.");
        return null;
    }

    public boolean borrowBook(String bookId) {
        for (Book b : books) {
            if (b.getBookId().equals(bookId) && b.isAvailable()) {
                b.borrowBook();
                System.out.println("Book borrowed: " + b.getTitle());
                return true;
            }
        }
        System.out.println("Book not available.");
        return false;
    }

    public void returnBook(String bookId) {
        for (Book b : books) {
            if (b.getBookId().equals(bookId)) {
                b.returnBook();
                System.out.println("Book returned: " + b.getTitle());
            }
        }
    }
}
