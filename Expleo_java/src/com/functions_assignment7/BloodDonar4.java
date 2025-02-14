package com.functions_assignment7;

import java.util.Scanner;

public class BloodDonar4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age: ");
		int age = sc.nextInt();
		System.out.println("enter the weight: ");
		int weight = sc.nextInt();
		if (donateBlood(age, weight)) {
			System.out.println("You can donate blood");
		} else {
			System.out.println("You cannot donate blood");
		}
		sc.close();
	}

	public static boolean donateBlood(int age, int weight) {
		if ((age >= 18 && age < 55) && weight > 45) {
			return true;
		}
		return false;
	}
	
}
