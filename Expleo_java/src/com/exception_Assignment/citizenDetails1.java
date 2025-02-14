package com.exception_Assignment;
import java.util.*;
class NoMatchExcepion extends Exception{
	NoMatchExcepion(String str){
		super(str);
	}
}
public class citizenDetails1 {
	public static void main(String[] args){
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the cititzen aadhar number: ");
		int aadar_num=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the cititzen name: ");
		String name=sc.nextLine();
		System.out.println("Enter the cititzen city: ");
		String city=sc.nextLine();
		System.out.println("Enter the cititzen State: ");
		String state=sc.nextLine();
		System.out.println("Enter the cititzen country: ");
		String country=sc.nextLine();
		validateCountry(country);
		
		}
		catch(NoMatchExcepion e) {
			System.out.println(e);
		}
		
		
	}
	public static void validateCountry(String country) throws NoMatchExcepion{
		if((country.equalsIgnoreCase("india"))) {
			System.out.println("indian citizen");
		}
		else {
			throw new NoMatchExcepion("not a indian citizen");
		}
	}
}
