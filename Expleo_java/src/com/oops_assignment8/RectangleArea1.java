package com.oops_assignment8;
import java.util.Scanner;
class Area {
 private int length;
 private int breadth;
 public void setDim(int length, int breadth) {
     this.length = length;
     this.breadth = breadth;
 }
 public int getArea() {
     return length * breadth;
 }
}
public class RectangleArea1 {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter length of the rectangle: ");
     int length = scanner.nextInt();
     System.out.print("Enter breadth of the rectangle: ");
     int breadth = scanner.nextInt();
     Area rectangle = new Area();
     rectangle.setDim(length, breadth);
     System.out.println("Area of the rectangle: " + rectangle.getArea());
     scanner.close();
 }
}
