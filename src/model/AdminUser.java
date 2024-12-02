package model;

import java.util.ArrayList;

public class AdminUser extends User{
    private ArrayList<Book> libraryInventory;

    //constructor to initialize adminUser
    public AdminUser(String username, String email) {
        super(username, email);
        this.libraryInventory = new ArrayList<>();
    }

    // method adds book to the library

    public void addBook(Book book) {
        libraryInventory.add(book);
        System.out.println(book.getTitle() + "added to the inventory" );
    }

    public void removeBook(String title) {
        Book toRemove = null;
        for(Book book: libraryInventory){
            if(book.getTitle().equalsIgnoreCase(title)){
                toRemove = book;
                break;
            }
        }
        if(toRemove != null){
            libraryInventory.remove(toRemove);
            System.out.println(title + " has been removed from the inventory");
        } else {
            System.out.println(title + " was not found in the inventory");
        }
    }

    public void viewInventory() {
        System.out.println("Library Inventory:");
        for(Book book: libraryInventory){
            System.out.println(book.getTitle());
        }
    }
}
