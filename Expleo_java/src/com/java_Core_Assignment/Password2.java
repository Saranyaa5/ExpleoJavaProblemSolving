package com.java_Core_Assignment;

import java.util.Scanner;

public class Password2 {
	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first name: ");
        String fname = sc.nextLine();
        System.out.println("Enter Last name: ");
        String lname = sc.nextLine();
        String password=fname.substring(0,3)+lname.substring(lname.length()-3)+(lname.length()+fname.length());
        System.out.println("password : "+password);
        sc.close();
	}
        
}
