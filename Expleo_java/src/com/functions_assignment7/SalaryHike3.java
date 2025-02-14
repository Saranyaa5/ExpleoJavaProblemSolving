package com.functions_assignment7;

import java.util.Scanner;

public class SalaryHike3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("enter the salary: ");
		float salary = sc.nextFloat();
		System.out.print("enter the hike: ");
		float hike = sc.nextFloat();
		float pay_check=validatehike(salary,hike);
		System.out.print("final salary: "+pay_check);
		sc.close();
		
	}
	public static float validatehike(float salary,float hike) {
		return salary+(salary*hike/100);
	}
		
}
