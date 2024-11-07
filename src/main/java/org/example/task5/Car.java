package org.example.task5;

public class Car implements Drivable {
    private String mark;
    private String model;
    private int year;

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMark(String mark) {
        return mark;
    }

    public String getModel(String model) {
        return model;
    }

    public int getYear(int year) {
        return year;
    }

    @Override
    public void start() {
        System.out.println("Car start to drive");
    }

    @Override
    public void stop() {
        System.out.println("Car stop");

    }

    @Override
    public void drive(int distance) {
        System.out.println("Car mark:" + mark + " model: " + model + " drove: " + distance + " km");
    }
}
