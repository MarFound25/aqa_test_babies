package org.example.task1;

public class Book implements Displayable{
    private String bookName;
    private String author;
    private int year;

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBookName(String bookName) {
        return this.bookName;
    }

    public String getAuthor(String author) {
        return author;
    }

    public int getYear(int year) {
        return year;
    }

    @Override
    public void display() {
        System.out.println("The book has a name: " + this.bookName );
        System.out.println("Author:" + this.author);
        System.out.println("Year:" + this.year);
    }
}
