package com.exception_Assignment;

import java.util.Scanner;
class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}
public class ValidEmployeeName {
    public static void validateName(String name) throws InvalidNameException {
        if (!name.matches("[a-zA-Z ]+")) { 
            throw new InvalidNameException("Name is Invalid! Name should contain only alphabets.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Employee Name: ");
            String employeeName = sc.nextLine();
            validateName(employeeName);
            System.out.println("Valid Employee Name: " + employeeName);
        } catch (InvalidNameException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
