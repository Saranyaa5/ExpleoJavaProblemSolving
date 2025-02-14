package com.controlflow_assignment;

import java.util.Scanner;

public class DonateBlood {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age: ");
		int age = sc.nextInt();
		System.out.println("enter the weight: ");
		int weight = sc.nextInt();
		if ((age >= 18 && age < 55) || weight > 45) {
			System.out.println("you can donate blood");
		} else {
			System.out.println("you cannot donate blood");
		}
		sc.close();
	}

}
