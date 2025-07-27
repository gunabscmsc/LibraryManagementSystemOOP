📚 Library Management System (OOP in Java)
A basic Library Management System implemented using Java OOP concepts like Abstraction, Inheritance, Encapsulation, and Polymorphism.

✅ Features
Add / Remove books

Search for books by title

Borrow and return books

Track book availability

Roles: Student and Librarian

🧱 Classes Used
Class	Description
Book	Represents a book with ID, title, author, and availability
Library	Holds a list of books and operations like add/remove/search/borrow/return
Account (abstract)	Base class for all users
Student	Can borrow up to 3 books
Librarian	Can add or remove books
Main	Contains the main method and test logic

🔧 OOP Concepts Used
Encapsulation – Private fields with public getters/setters

Inheritance – Student and Librarian inherit from Account

Abstraction – Account is an abstract class

Polymorphism – Used via method overriding

🚀 How to Run
# Navigate to src folder
cd LibraryManagementSystem/src

# Compile all Java files
javac *.java

# Run the main program
java Main

🛠️ Project Structure
LibraryManagementSystem/
│
├── README.md
└── src/
    ├── Book.java
    ├── Library.java
    ├── Account.java
    ├── Student.java
    ├── Librarian.java
    └── Main.java


📘 UML Class Diagram (Text Format)

                +------------------+
                |   <<abstract>>   |
                |     Account      |
                +------------------+
                | - name: String   |
                | - id: String     |
                +------------------+
                | +displayInfo()   |
                +------------------+
                    ▲        ▲
                    |        |
   +----------------+        +----------------+
   |                                     |
+-----------+                    +--------------+
|  Student  |                    |  Librarian   |
+-----------+                    +--------------+
| - borrowedBookIds: List       |              |
+-------------------------------+--------------+
| +borrowBook(bookId, library)  | +addBook()   |
| +displayInfo()                | +removeBook()|
+-------------------------------+--------------+

                    +-------------+
                    |   Library   |
                    +-------------+
                    | - books: List<Book>          |
                    +------------------------------+
                    | +addBook(book)               |
                    | +removeBook(bookId)          |
                    | +searchBook(title): Book     |
                    | +borrowBook(bookId): boolean |
                    | +returnBook(bookId)          |
                    +------------------------------+

                    +------------+
                    |   Book     |
                    +------------+
                    | - bookId   |
                    | - title    |
                    | - author   |
                    | - isAvailable: boolean |
                    +------------------------+
                    | +borrowBook()          |
                    | +returnBook()          |
                    | +displayInfo()         |
                    +------------------------+
