package model;

import java.util.ArrayList;

public class LibraryUser extends User {
    private ArrayList<Book> borrowedBooks; //declared ArrayList

    //constructor to initialize the library user
    public LibraryUser(String userName, String email) {
        super(userName, email); // call to parent class constructor
        this.borrowedBooks = new ArrayList<>(); //Initialized ArrayList
    }
    //method to borrow a book
    public void borrowBook(Book book) {
        if(book.borrowBook()){
            borrowedBooks.add(book);
            System.out.println("You borrowed: " + book.getTitle());
        } else {
            System.out.println("Sorry" + book.getTitle() + " is not available.");
        }
    }

    //method to return a book
    public void returnBook(Book book) {
        if(borrowedBooks.remove(book)){
            book.returnBook();//update book's availability
            System.out.println("You returned: " + book.getTitle());
        } else {
            System.out.println("This book is not in your borrowed list");
        }
    }
    @Override
    public void displayDetails() {
        super.displayDetails(); // super is used to run the displayDetails in the User superclass (to display name and email id)
        System.out.println("Borrowed books: "); // This adds on to name and us email
        for ( Book book : borrowedBooks) {
            System.out.println("-" + book.getTitle());
        }
    }

}
