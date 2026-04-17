package org.pluralsight;

public class Book
{
    // instance variables for book (strings)
    private String name = "";
    private String bookTitle = "";
    private String isbn = "";
    private String checkedOutTo = "";

    // int
    private int id = 0;

    // boolean
    private boolean isCheckedOut;



    // constructor for book
    public Book (String bookTitle, String isbn, String checkedOutTo, boolean isCheckedOut, int id){
        this.bookTitle = bookTitle;
        this.isbn = isbn;
        this.checkedOutTo = checkedOutTo;
        this.isCheckedOut = isCheckedOut;
        this.id = id;
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
    public int getId(){
        return id;
    }
    public void setId(int id){
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
