package com.exception_Assignment;

class InvalidBookIDException extends Exception {
 public InvalidBookIDException(String message) {
     super(message);
 }
}
public class Library1 {
 public static void BookID(int n, int p) throws InvalidBookIDException {
     if (n < 0 || p < 0) {
         throw new InvalidBookIDException("n or p should not be negative.");
     }
     if (n == 0 && p == 0) {
         throw new InvalidBookIDException("n and p should not be zero.");
     }
     System.out.println("Book ID is valid: Call Number: " + n + ", ID: " + p);
 }
 public static void main(String[] args) {
     try {
         BookID(101, 25);
         BookID(-5, 10);
         BookID(0, 0);
     } catch (InvalidBookIDException e) {
         System.out.println("Error: " + e.getMessage());
     }
 }
}
