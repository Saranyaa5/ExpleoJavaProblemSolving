package com.expleojavalearning;

import java.util.Scanner;

public class Day3 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter the number: ");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		while(num>0) {
			sum+=num%10;
			num/=10;
		}
		if(temp%sum==0) {
			System.out.println("the number is a harshad number");
		}
		else {
			System.out.println("the number is not a harshad number");
		}
		sc.close();
	}
}
