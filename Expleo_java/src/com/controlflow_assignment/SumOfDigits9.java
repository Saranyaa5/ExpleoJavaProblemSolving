package com.controlflow_assignment;

import java.util.Scanner;

public class SumOfDigits9 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int num=sc.nextInt();
		int sum=0;
		while(num>0) {
			sum+=num%10;
			num/=10;
		}
		System.out.print("sum of digits: "+sum);
		sc.close();
	}
}
