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
        System.out.println("------------------------------");
        System.out.println("Thanks for coming, see you next time!");
        System.out.println("------------------------------");


        // testing get/set and input
        System.out.print("Please enter your name: ");
        String name = userInput.nextLine().trim();
        book.setName(name);


        System.out.println(book.getName());
    }



    static Book[] loadBooks()
    {
        Book[] books = new Book[] {
                new Book("")
        };
    }
}
