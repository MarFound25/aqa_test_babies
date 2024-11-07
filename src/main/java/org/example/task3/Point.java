package org.example.task3;

public class Point implements Movable{
    private int x;
    private int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX(int x) {
        return this.x;
    }

    public int getY(int y) {
        return this.y;
    }

    @Override
    public void moveUp() {
        System.out.println("The point has moved up");
    }

    @Override
    public void moveDown() {
        System.out.println("The point has moved down");

    }

    @Override
    public void moveLeft() {
        System.out.println("The point has moved left");
    }

    @Override
    public void moveRight() {
        System.out.println("The point has moved right");
    }
}
