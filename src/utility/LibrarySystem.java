package utility;

import model.AdminUser;
import model.Book;
import model.LibraryUser;

public class LibrarySystem {

    //create an admin user
    AdminUser admin = new AdminUser( "John", "john@gmail.com");

    // Creating Book objects
    Book book1 = new Book( "Java Fundamentals", "Author 1", 10);
    Book book2 = new Book( "Python Fundamentals", "Author 2", 5);
    Book book3 = new Book( "C++ Fundamentals", "Author 3", 7);

    // adds books to the library inventory and displays books
    public void runLibrarySystem(){
        admin.addBook(book1);
        admin.addBook(book2);
        admin.addBook(book3);

        admin.viewInventory();

        admin.removeBook("C++ Fundamentals");

        admin.viewInventory();
    }

    LibraryUser libraryUser = new LibraryUser( "Jane", "jane@gmail.com");

    // library user services

    public void useLibraryServiceForUser(){
        libraryUser.borrowBook(book1);
        libraryUser.borrowBook(book2);
        libraryUser.borrowBook(book3);

        System.out.println("Library User Details: ");
        libraryUser.displayDetails();
        libraryUser.returnBook(book2);
        System.out.println("\n Library User Details after returning book: " );
        libraryUser.displayDetails();



        }
    }

