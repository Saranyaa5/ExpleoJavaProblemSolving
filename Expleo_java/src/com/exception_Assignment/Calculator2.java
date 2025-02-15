package com.exception_Assignment;

import java.util.Scanner;
class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}
class DivisionByZeroException extends Exception {
    public DivisionByZeroException() {
        super("Denominator should not be zero.");
    }
}
class InvalidMultiplicationException extends Exception {
    public InvalidMultiplicationException() {
        super("Multiplier and multiplicand should not be 0 or 1.");
    }
}
class Complex {
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }
    public void display() {
        System.out.println("Complex Number: " + real + " + " + imaginary + "i");
    }
}
public class Calculator2{
    private static double getValidNumber(Scanner scanner) throws InvalidInputException {
        if (!scanner.hasNextDouble()) {
            scanner.next(); 
            throw new InvalidInputException("Invalid input. Only numbers are allowed.");
        }
        return scanner.nextDouble();
    }
    public static double add(double a, double b) {
        return a + b;
    }
    public static double subtract(double a, double b) {
        return a - b;
    }
    public static double multiply(double a, double b) throws InvalidMultiplicationException {
        if (a == 0 || b == 0 || a == 1 || b == 1) {
            throw new InvalidMultiplicationException();
        }
        return a * b;
    }
    public static double divide(double a, double b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException();
        }
        return a / b;
    }
    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("Calculator Application:");
            System.out.println("Select an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Power");
            System.out.println("6. Complex Number Addition");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1: 
                    System.out.print("Enter first number: ");
                    double num1 = getValidNumber(scanner);
                    System.out.print("Enter second number: ");
                    double num2 = getValidNumber(scanner);
                    System.out.println("Result: " + add(num1, num2));
                    break;

                case 2:
                    System.out.print("Enter first number: ");
                    num1 = getValidNumber(scanner);
                    System.out.print("Enter second number: ");
                    num2 = getValidNumber(scanner);
                    System.out.println("Result: " + subtract(num1, num2));
                    break;

                case 3:
                    System.out.print("Enter first number: ");
                    num1 = getValidNumber(scanner);
                    System.out.print("Enter second number: ");
                    num2 = getValidNumber(scanner);
                    System.out.println("Result: " + multiply(num1, num2));
                    break;

                case 4:
                    System.out.print("Enter numerator: ");
                    num1 = getValidNumber(scanner);
                    System.out.print("Enter denominator: ");
                    num2 = getValidNumber(scanner);
                    System.out.println("Result: " + divide(num1, num2));
                    break;

                case 5:
                    System.out.print("Enter base: ");
                    num1 = getValidNumber(scanner);
                    System.out.print("Enter exponent: ");
                    num2 = getValidNumber(scanner);
                    System.out.println("Result: " + power(num1, num2));
                    break;

                case 6:
                    System.out.print("Enter real part of first complex number: ");
                    double real1 = getValidNumber(scanner);
                    System.out.print("Enter imaginary part of first complex number: ");
                    double imag1 = getValidNumber(scanner);
                    System.out.print("Enter real part of second complex number: ");
                    double real2 = getValidNumber(scanner);
                    System.out.print("Enter imaginary part of second complex number: ");
                    double imag2 = getValidNumber(scanner);
                    Complex c1 = new Complex(real1, imag1);
                    Complex c2 = new Complex(real2, imag2);
                    Complex result = c1.add(c2);   
                    System.out.print("Resultant ");
                    result.display();
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid operation.");
            }

        } catch (InvalidInputException | DivisionByZeroException | InvalidMultiplicationException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
