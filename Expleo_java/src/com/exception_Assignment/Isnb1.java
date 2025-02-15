package com.exception_Assignment;
import java.util.Scanner;

class IllegalISBNException extends Exception {
    public IllegalISBNException(String message) {
        super(message);
    }
}

public class Isnb1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter a 10-digit ISBN number: ");
            String isbn = scanner.nextLine();

            if (isbn.length() != 10 || !isbn.matches("\\d+")) {
                throw new IllegalISBNException("Illegal ISBN: ISBN must be a 10-digit integer.");
            }

            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += (i + 1) * Character.getNumericValue(isbn.charAt(i));
            }

            if (sum % 11 == 0) {
                System.out.println("Legal ISBN");
            } else {
                throw new IllegalISBNException("Illegal ISBN: Sum is not divisible by 11.");
            }

        } catch (IllegalISBNException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
