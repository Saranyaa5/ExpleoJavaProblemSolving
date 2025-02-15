package com.oops_assignment8;
class Rectangle {
 private int length;
 private int breadth;
 public Rectangle(int length, int breadth) {
     this.length = length;
     this.breadth = breadth;
 }
 public int area() {
     return length * breadth;
 }
}
public class RectangleDemo3{
 public static void main(String[] args) {
     Rectangle rect1 = new Rectangle(4, 5);
     Rectangle rect2 = new Rectangle(5, 8);
     System.out.println("Area of Rectangle 1: " + rect1.area());
     System.out.println("Area of Rectangle 2: " + rect2.area());
 }
}

