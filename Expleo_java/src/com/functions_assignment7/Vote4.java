package com.functions_assignment7;

import java.util.Scanner;

public class Vote4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age: ");
		int age = sc.nextInt();
		
		if (validateVote(age)) {
			System.out.println("You are eligible vote");
		} else {
			System.out.println("You are not eligible to donate");
		}
		sc.close();
	}

	public static boolean validateVote(int age) {
		if (age >= 18) {
			return true;
		}
		return false;
	}
}
