package com.oops_assignment8;

class Triangle {
 private int side1, side2, side3;
 public Triangle() {
     this.side1 = 3;
     this.side2 = 4;
     this.side3 = 5;
 }
 public int getPerimeter() {
     return side1 + side2 + side3;
 }
 public double getArea() {
     double s = getPerimeter() / 2.0;
     return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
 }
}
public class TriangleDemo2{
 public static void main(String[] args) {
     Triangle triangle = new Triangle();

     System.out.println("Perimeter of the triangle: " + triangle.getPerimeter());
     System.out.println("Area of the triangle: " + triangle.getArea());
 }
}

