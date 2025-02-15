package com.oops_assignment8;
import java.util.Scanner; 
class Average {
 public void calculateAverage(int a, int b, int c) {
     double avg = (a + b + c) / 3.0;
     System.out.println("The average of the three numbers is: " + avg);
 }
}
public class Average4{
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter first number: ");
     int num1 = scanner.nextInt();
     System.out.print("Enter second number: ");
     int num2 = scanner.nextInt();
     System.out.print("Enter third number: ");
     int num3 = scanner.nextInt();
     Average avgCalculator = new Average();
     avgCalculator.calculateAverage(num1, num2, num3);
     scanner.close();
 }
}

