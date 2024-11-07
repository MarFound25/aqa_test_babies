package org.example;

import org.example.task1.Book;

public class Main {
    public static void main(String[] args) {
    Book book1 = new Book();
        book1.setBookName("White Fang");
        book1.display();

    Book author1 = new Book();
    author1.setAuthor("London");
    author1.display();

    Book year1 = new Book();
    year1.setYear(1920);
    year1.display();
    }
}