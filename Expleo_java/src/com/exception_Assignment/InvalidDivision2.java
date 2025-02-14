package com.exception_Assignment;

import java.util.Scanner;
class InvalidDivisionException extends Exception{
	InvalidDivisionException(String str){
		super(str);
	}
}
public class InvalidDivision2 {
	public static void main(String[] args){
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number1: ");                                  
		int n1=sc.nextInt();
		System.out.println("Enter the number2: ");
		int n2=sc.nextInt();
		System.out.println(validate(n1,n2));
		}
		catch(InvalidDivisionException e) {
			System.out.println(e);
		}
		
		
	}
	
	public static double validate(int n1,int n2) throws InvalidDivisionException{
		if(n2==0) {
			throw new InvalidDivisionException("not a indian citizen");
		}
		else {
			return n1/n2;
		}
	}
	
}
