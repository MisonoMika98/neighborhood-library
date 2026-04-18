package org.pluralsight;

import java.util.Scanner;

public class LibraryApplication
{
    Scanner userInput = new Scanner(System.in);

    static Book[] books;

    void main()
    {
        // populates the array with books
        books = loadBooks();
        boolean keepGoing = true;

        // app home screen with options
        while(keepGoing){
            System.out.println();
            System.out.println("Welcome to the friendly neighborhood library");
            System.out.println();
            System.out.println();
            System.out.println("What would you like to do today?");
            System.out.println(" 1) Show available books");
            System.out.println(" 2) Show checked out books");
            System.out.println(" x) Exit the application");
            System.out.println("---------------------------------------------------");
            String selection = userInput.nextLine().trim().toLowerCase();

            // switches depending on user option
            switch(selection){
                case "1":
                    printAllAvailableBooks();
                    break;
                case "2":
                    printAllCheckedOutBooks();
                    break;
                case "x":
                    // user closes the app
                    keepGoing = false;
                    break;
                default:
                    System.out.println("Invalid selection. Please try again.");
                    System.out.println();
                    break;
            }
        }
        // exit screen
        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println("Thanks for coming, see you next time!");
        System.out.println("-----------------------------------------");


        // testing get/set and input
//        System.out.print("Please enter your name: ");
//        String name = userInput.nextLine().trim();
//        book.setName(name);
//
//
//        System.out.println(book.getName());
    }

    // print function that shows all available books
    private static void printAllAvailableBooks() {
        System.out.println();
        System.out.println("Available Books:");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println();

        System.out.println("    Book Title                 ISBN#            ID#");
        System.out.println("-------------------- ------------------------- ----");
    }

    // print function that shows all checked out/unavailable books
    private static void printAllCheckedOutBooks() {
        System.out.println();
        System.out.println("Checked out Books:");
        System.out.println("------------------------------------------------------------------------");
        System.out.println();

        System.out.println("    Book Title                 ISBN#            ID#");
        System.out.println("-------------------- ------------------------- ----");
    }



    // helper method to load the array of books

    static Book[] loadBooks()
    {
        Book[] books = new Book[] {
                new Book("Naruto, Vol. 1", "978-1-56931-900-0", "Chris Pratt", true, 1),
                new Book("Naruto, Vol. 2", "978-1-59116-178-3", "", false, 2),
                new Book("Naruto, Vol. 3", "978-1-59116-187-5", "", false, 3),
                new Book("Naruto, Vol. 4", "978-1-59116-358-9", "Soren Bjerg", true, 4),
                new Book("Naruto, Vol. 5", "978-1-59116-359-6", "Cody Rhodes", true, 5),
                new Book("Naruto, Vol. 6", "978-1-59116-739-6", "Wakamo Kosaka", true, 6),
                new Book("Naruto, Vol. 7", "978-1-59116-875-1", "", false, 7),
                new Book("Naruto, Vol. 8", "978-1-4215-0124-6", "", false, 8),
                new Book("Naruto, Vol. 9", "978-1-4215-0239-7", "Miku Hatsune", true, 9),
                new Book("Naruto, Vol. 10", "978-1-4215-0240-3", "", false, 10),
                new Book("Naruto, Vol. 11", "978-1-4215-0241-0", "", false, 11),
                new Book("Naruto, Vol. 12", "978-1-4215-0242-7", "", false, 12),
                new Book("Naruto, Vol. 13", "978-1-4215-1087-3", "Taylor Swift", true, 13),
                new Book("Naruto, Vol. 14", "978-1-4215-1088-0", "Lebron James", true, 14),
                new Book("Naruto, Vol. 15", "978-1-4215-1089-7", "Luka Doncic", true, 15),
                new Book("Naruto, Vol. 16", "978-1-4215-1090-3", "Ichika Nakamasa", true, 16),
                new Book("Naruto, Vol. 17", "978-1-4215-1652-3", "Miki Hoshii",  true, 17),
                new Book("Naruto, Vol. 18", "978-1-4215-1653-0", "Michael Jackson", true, 18),
                new Book("Naruto, Vol. 19", "978-1-4215-1654-7", "", false, 19),
                new Book("Naruto, Vol. 20", "978-1-4215-1655-4", "Barack Obama", true, 20),

        };

        return books;
    }
}
