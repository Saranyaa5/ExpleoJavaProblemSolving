package com.oops_assignment_11;

abstract class Shape1 {
 protected String shapeName;
 public Shape1(String name) {
     this.shapeName = name;
 }
 public abstract double area();
 @Override
 public String toString() {
     return shapeName;
 }
}
class Sphere extends Shape1 {
 private double radius;
 public Sphere(double radius) {
     super("Sphere");
     this.radius = radius;
 }
 @Override
 public double area() {
     return 4 * Math.PI * Math.pow(radius, 2);
 }
 @Override
 public String toString() {
     return super.toString() + " with radius " + radius;
 }
}
class Rectangle1 extends Shape1 {
 private double length, width;
 public Rectangle1(double length, double width) {
     super("Rectangle");
     this.length = length;
     this.width = width;
 }
 @Override
 public double area() {
     return length * width;
 }
 @Override
 public String toString() {
     return super.toString() + " with length " + length + " and width " + width;
 }
}
class Cylinder extends Shape1 {
 private double radius, height;
 public Cylinder(double radius, double height) {
     super("Cylinder");
     this.radius = radius;
     this.height = height;
 }
 @Override
 public double area() {
     return 2 * Math.PI *radius*(radius + height);
 }
 @Override
 public String toString() {
     return super.toString() + " with radius " + radius + " and height " + height;
 }
}
class Paint {
 private double coverage; 
 public Paint(double coverage) {
     this.coverage = coverage;
 }
 public double amount(Shape1 s) {
     double paintRequired = s.area() / coverage;
     System.out.println("Computing amount of paint needed for " + s);
     return paintRequired;
 }
}
public class PaintThings5{
 public static void main(String[] args) {
     Paint paint = new Paint(500); 
     Rectangle1 deck = new Rectangle1(10,20);
     Sphere bigBall = new Sphere(13);
     Cylinder tank = new Cylinder(11,20);
     double deckPaint = paint.amount(deck);
     double bigBallPaint = paint.amount(bigBall);
     double tankPaint = paint.amount(tank);
     System.out.printf("\nAmount of paint needed:\n");
     System.out.printf("Deck: %.2f gallons\n", deckPaint);
     System.out.printf("Big Ball: %.2f gallons\n", bigBallPaint);
     System.out.printf("Tank: %.2f gallons\n", tankPaint);
 }
}

