package org.example;

import org.example.task1.Book;
import org.example.task2.Student;
import org.example.task3.Point;
import org.example.task4.Clock;
import org.example.task5.Car;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        Student student1 = new Student();
        Clock clock1 = new Clock();
        Point point1 = new Point();
        Car car1 = new Car();

        int thousendTick = 0;

        // Book
        book1.setBookName("White Fang");
        book1.setAuthor("London");
        book1.setYear(1920);
        book1.display();

        // Student
        student1.setName("Al");
        student1.setNumberBook(2);
        student1.setEverageMark(5);
        student1.print();

        // Point
        point1.setX(16);
        point1.setX(10);

        point1.moveUp();
        point1.moveDown();
        point1.moveLeft();
        point1.moveRight();

        // Clock
        clock1.setHours(10);
        clock1.setMinutes(12);
        clock1.setSecunds(3);

        while (thousendTick != 10000)
        {
            clock1.tick();
            thousendTick++;
        }

        clock1.readTime();

        // Car
        car1.setMark("Porshe");
        car1.setModel("R");
        car1.setYear(2024);

        car1.start();
        car1.drive(25);
        car1.stop();

}
}

