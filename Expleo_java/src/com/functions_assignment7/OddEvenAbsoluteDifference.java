package com.functions_assignment7;

import java.util.Scanner;

public class OddEvenAbsoluteDifference {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num: ");
		int num = sc.nextInt();
		
		checkOddEven(num);
		sc.close();
	}

	public static void checkOddEven(int num) {
		int oddcount=0;
		int evencount=0;
		for(int i=1;i<=num;i++) {
			if (i%2==0) {
				evencount++;
			}
			else {
				oddcount++;
			}
		}
		System.out.print("odd: "+ oddcount +" even: "+ evencount);
		System.out.print("absolute diff b/w odd and even count: "+ Math.abs(oddcount-evencount));
		
		
	}
}
