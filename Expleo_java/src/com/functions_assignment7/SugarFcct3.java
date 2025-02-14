package com.functions_assignment7;

import java.util.Scanner;

public class SugarFcct3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the hours: ");
		int hour = sc.nextInt();
		
		payment(hour);
		sc.close();
	}
	public static void payment(int hour) {
		int overtime=hour-40;
		float pay=overtime*15;
		System.out.print("over time pay for 10 employees are:"+ pay*10);
		
	}
}
