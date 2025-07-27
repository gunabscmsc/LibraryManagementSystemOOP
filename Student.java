import java.util.ArrayList;
import java.util.List;

class Student extends Account {
    private List<String> borrowedBookIds = new ArrayList<>();

    public Student(String name, String id) {
        super(name, id);
    }

    public void borrowBook(String bookId, Library library) {
        if (borrowedBookIds.size() < 3 && library.borrowBook(bookId)) {
            borrowedBookIds.add(bookId);
        }
    }

    public void returnBook(String bookId, Library library) {
        if (borrowedBookIds.remove(bookId)) {
            library.returnBook(bookId);
        } else {
            System.out.println("This book wasn't borrowed by the student.");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Student Name: " + name + ", ID: " + id);
    }
}