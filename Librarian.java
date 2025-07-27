class Librarian extends Account {
    public Librarian(String name, String id) {
        super(name, id);
    }

    public void addBook(Library library, Book book) {
        library.addBook(book);
    }

    public void removeBook(Library library, String bookId) {
        library.removeBook(bookId);
    }

    @Override
    public void displayInfo() {
        System.out.println("Librarian Name: " + name + ", ID: " + id);
    }
}