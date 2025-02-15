package com.oops_assignment8;
import java.util.Scanner;
class Employee {
 private int salary;
 private int workHours;
 public void getInfo(int salary, int workHours) {
     this.salary = salary;
     this.workHours = workHours;
 }
 public void AddSal() {
     if (salary < 40000) {
         salary += 800;
     }
 }
 public void AddWork() {
     if (workHours > 6) {
         salary += 400;
     }
 }
 public void printSalary() {
     System.out.println("Final Salary: ₹" + salary);
 }
}
public class Employee1{
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter salary: ");
     int salary = scanner.nextInt();
     
     System.out.print("Enter work hours per day: ");
     int workHours = scanner.nextInt();
     Employee emp = new Employee();
     emp.getInfo(salary, workHours);
     emp.AddSal();
     emp.AddWork();
     emp.printSalary();
     scanner.close();
 }
}

