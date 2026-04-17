package org.pluralsight;

import java.util.Scanner;

public class Main
{
    Scanner userInput = new Scanner(System.in);

    Book book = new Book();

    void main()
    {
        // app start up loop
//        boolean keepGoing = true;

//        while(keepGoing){
//            System.out.println();
//            System.out.println("Welcome to the friendly neighborhood library");
//            System.out.println();
//            System.out.println();
//            break;
//        }

        System.out.print("Please enter your name: ");
        String name = userInput.nextLine().trim();
        book.setName(name);

        System.out.println(book.getName());
    }



//    static Book[] loadBooks()
//    {
//        Book[] books = new Book[] {
//        }
//    }
}
