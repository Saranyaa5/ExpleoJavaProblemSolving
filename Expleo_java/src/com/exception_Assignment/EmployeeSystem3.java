package com.exception_Assignment;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
class InvalidEmpNumberException extends Exception {
    public InvalidEmpNumberException(String message) {
        super(message);
    }
}
class InvalidDateOfJoinException extends Exception {
    public InvalidDateOfJoinException(String message) {
        super(message);
    }
}
class Employee {
    private int empCode;
    private String name;
    private LocalDate dateOfBirth;
    private LocalDate dateOfAppointment;
    public Employee(int empCode, String name, LocalDate dateOfBirth, LocalDate dateOfAppointment)
            throws InvalidEmpNumberException, InvalidDateOfJoinException {
       
        if (empCode <= 0) {
            throw new InvalidEmpNumberException("Employee code must be a positive integer.");
        }
        this.empCode = empCode;
        this.name = name;
        if (!dateOfBirth.isBefore(dateOfAppointment)) {
            throw new InvalidDateOfJoinException("Date of Birth must be before Date of Appointment.");
        }
        this.dateOfBirth = dateOfBirth;
        this.dateOfAppointment = dateOfAppointment;
    }
    public int getExperience() {
        return Period.between(dateOfAppointment, LocalDate.now()).getYears();
    }
    public void displayDetails() {
        System.out.println("\nEmployee Details:");
        System.out.println("Employee Code   : " + empCode);
        System.out.println("Name           : " + name);
        System.out.println("Date of Birth  : " + dateOfBirth);
        System.out.println("Date of Joining: " + dateOfAppointment);
        System.out.println("Experience     : " + getExperience() + " years");
    }
}
public class EmployeeSystem3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter Employee Code: ");
            int empCode = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Enter Employee Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Date of Birth (YYYY-MM-DD): ");
            LocalDate dob = LocalDate.parse(scanner.nextLine());

            System.out.print("Enter Date of Appointment (YYYY-MM-DD): ");
            LocalDate doj = LocalDate.parse(scanner.nextLine());
            Employee emp = new Employee(empCode, name, dob, doj);
            emp.displayDetails();

        } catch (InvalidEmpNumberException | InvalidDateOfJoinException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input format. Please try again.");
        } finally {
            scanner.close();
        }
    }
}
