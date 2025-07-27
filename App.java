public class App {
public static void main(String[] args) {
        Library library = new Library();

        Librarian librarian = new Librarian("Mr. Sharma", "L001");
        librarian.addBook(library, new Book("B101", "Java Basics", "James Gosling"));
        librarian.addBook(library, new Book("B102", "OOP Concepts", "Bjarne Stroustrup"));

        Student student = new Student("Gunasekaran", "S001");
        student.borrowBook("B101", library);
        student.returnBook("B101", library);

        library.searchBook("Java Basics");

        System.out.println();
        student.displayInfo();
        librarian.displayInfo();
    }
}
