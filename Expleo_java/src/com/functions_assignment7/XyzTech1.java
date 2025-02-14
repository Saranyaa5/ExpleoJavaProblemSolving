package com.functions_assignment7;

import java.util.Scanner;

public class XyzTech1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("enter the salary: ");
		float salary = sc.nextFloat();
		System.out.print("enter the apprisal rating(1 to 10): ");
		int rating = sc.nextInt();
		float final_salary=paymenthike(salary,rating);
		System.out.print("final payment after hike: "+final_salary);
		sc.close();
	}
	
	public static float paymenthike(float salary,int rating) {
		
		if (rating>=1 && rating<=4) {
			return (float) (salary+(salary*0.1));
		}
		else if (rating>4 && rating<=7) {
			return (float) (salary+(salary*0.25));
		}
		else if (rating>7 && rating<=10) {
			return (float) (salary+(salary*0.25));
		}
		return salary;
	}
}
