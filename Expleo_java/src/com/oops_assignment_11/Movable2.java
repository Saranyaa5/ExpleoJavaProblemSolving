package com.oops_assignment_11;

interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}
class MovablePoint implements Movable {
    private int x, y;
    private int xSpeed, ySpeed;
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    @Override
    public void moveUp() {
        y += ySpeed;
    }
    @Override
    public void moveDown() {
        y -= ySpeed;
    }
    @Override
    public void moveLeft() {
        x -= xSpeed;
    }
    @Override
    public void moveRight() {
        x += xSpeed;
    }
    @Override
    public String toString() {
        return "MovablePoint at (" + x + ", " + y + ") with speed (" + xSpeed + ", " + ySpeed + ")";
    }
}
class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }
    @Override
    public void moveUp() {
        center.moveUp();
    }
    @Override
    public void moveDown() {
        center.moveDown();
    }
    @Override
    public void moveLeft() {
        center.moveLeft();
    }
    @Override
    public void moveRight() {
        center.moveRight();
    }
    @Override
    public String toString() {
        return "MovableCircle with radius " + radius + " and center " + center.toString();
    }
}
public class Movable2 {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(2, 3, 1, 1);
        System.out.println("Before move: " + point);
        point.moveRight();
        point.moveUp();
        System.out.println("After move: " + point);
        MovableCircle circle = new MovableCircle(5, 5, 2, 2, 10);
        System.out.println("\nBefore move: " + circle);
        circle.moveLeft();
        circle.moveDown();
        System.out.println("After move: " + circle);
    }
}
