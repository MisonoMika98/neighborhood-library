package org.pluralsight;

public class Book
{
    // instance variables for book
    private String name = "";
    private String id = "";
    private String isbn = "";
    private String bookTitle = "";


    // constructor for book
    public Book (){
        this.bookTitle = bookTitle;
        this.id = id;
        this.isbn = isbn;
    }

    // get and set for user's name
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    // get and set for book's title
    public String getBookTitle(){
        return bookTitle;
    }
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    // get and set for book's id
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }

    // get and set for book's isbn
    public String getIsbn(){
        return isbn;
    }
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }


//    public void checkOut(String name) {
//        System.out.println(this.name);
//    }

}
