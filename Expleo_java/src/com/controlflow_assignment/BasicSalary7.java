package com.controlflow_assignment;

import java.util.Scanner;

public class BasicSalary7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("enter the salary: ");
		float salary = sc.nextFloat();
		float HRA = 0;
		float DA = 0;

		if (salary <= 10000) {
			HRA = (float) (salary * 0.2);
			DA = (float) (salary * 0.8);

		} else if (salary >= 10001 && salary <= 20000) {
			HRA = (float) (salary * 0.25);
			DA = (float) (salary * 0.9);
		} else if (salary >= 20001) {
			HRA = (float) (salary * 0.3);
			DA = (float) (salary * 0.95);
		}
		System.out.println("gross salary: " + (salary + HRA + DA));
		sc.close();
	}
}
