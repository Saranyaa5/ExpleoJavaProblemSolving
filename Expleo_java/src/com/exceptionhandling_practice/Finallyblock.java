package com.exceptionhandling_practice;

public class Finallyblock {
public static void main(String  [] args) {
	try {
		int data=25/0;
		System.out.println(data);
		System.exit(0);
	}
	catch(ArithmeticException e) {
		System.out.println(e);
		//System.exit(0);
	}
	finally {
		System.out.println("finally block");
	}
}
}
