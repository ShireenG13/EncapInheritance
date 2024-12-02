// Library Management System
//Users can borrow and return books
//keeps track of available inventory.
//Admin model.User can
//Books class

import model.LibraryUser;
import utility.LibrarySystem;

public class Main {
    public static void main(String[] args) {
        LibrarySystem librarySystem = new LibrarySystem();
        librarySystem.runLibrarySystem();
        librarySystem.useLibraryServiceForUser();

    }
}