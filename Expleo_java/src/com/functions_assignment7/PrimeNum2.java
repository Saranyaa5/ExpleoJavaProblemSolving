package com.functions_assignment7;

import java.util.Scanner;

public class PrimeNum2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num: ");
		int num = sc.nextInt();
		
		if (checkPrime(num)) {
			System.out.println("Prime number");
		} else {
			System.out.println("Not number");
		}
		sc.close();
	}

	public static boolean checkPrime(int num) {
		int x=2;
		
		while(x<=num/2) {
			if(num%x==0) {
				return false;
			}
			x++;
		}
		return true;
	}
}
