package com.functions_assignment7;

import java.util.Scanner;

public class OddEven1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num: ");
		int num = sc.nextInt();
		
		if (checkOddEven(num)) {
			System.out.println("Even number");
		} else {
			System.out.println("Odd number");
		}
		sc.close();
	}

	public static boolean checkOddEven(int num) {
		if (num%2==0) {
			return true;
		}
		return false;
	}
}
