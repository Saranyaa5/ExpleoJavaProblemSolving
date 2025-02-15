package com.exception_Assignment;
import java.util.Scanner;

class InvalidUsernameException extends Exception {
    public InvalidUsernameException(String message) {
        super(message);
    }
}
class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}
public class UserAuthentication4{
    public static void validateUsername(String username) throws InvalidUsernameException {
        if (!username.matches("[a-zA-Z0-9_]{5,15}")) {
            throw new InvalidUsernameException("Invalid Username! It must be 5-15 characters long and contain only letters, digits, or underscores.");
        }
    }
    public static void validatePassword(String password) throws InvalidPasswordException {
        if (!password.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$")) {
            throw new InvalidPasswordException("Invalid Password! Password must be at least 8 characters long and contain at least one uppercase letter, one lowercase letter, one digit, and one special character.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Enter Email ID: ");
            String email = sc.nextLine();

            System.out.print("Enter Username: ");
            String username = sc.nextLine();
            
            System.out.print("Enter Password: ");
            String password = sc.nextLine();
            validateUsername(username);
            validatePassword(password);
            System.out.println("\nUser Registration Successful!");
            System.out.println("Email: " + email);
            System.out.println("Username: " + username);
        } catch (InvalidUsernameException | InvalidPasswordException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
