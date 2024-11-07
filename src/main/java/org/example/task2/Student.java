package org.example.task2;

public class Student implements Printable{
    private String name;
    private int numberBook;
    private int everageMark;

    public void setName(String name){
        this.name = name;
    }

    public void setNumberBook(int numberBook){
        this.numberBook = numberBook;
    }

    public void setEverageMark(int everageMark){
        this.everageMark = everageMark;
    }

    public String getName(String name){
        return this.name;
    }

    public int getNumberBook(int numberBook){
        return this.numberBook;
    }

    public int getEverageMark(int everageMark){
        return this.everageMark;
    }


    @Override
    public void print() {
        System.out.println("Name: " + this.name);
        System.out.println("Number of Book: " + this.numberBook);
        System.out.println("Everage Mark: " + this.everageMark);
    }
}
