package com.controlflow_assignment;

import java.util.*;

public class GradeCalculate2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double finalgrade = 0;
		int studentCount = 0;
		System.out.print("enter the excercise  grade of student " + (studentCount + 1) + " : ");
		int excercise = sc.nextInt();
		System.out.print("enter the exam  grade:" + (studentCount + 1) + " : ");
		int exam = sc.nextInt();

		while (exam >= 0 && excercise >= 0) {

			finalgrade += (exam * 0.7 + excercise * 0.3);
			studentCount++;

			System.out.print("enter the excercise  grade:" + (studentCount + 1) + " : ");
			excercise = sc.nextInt();
			System.out.print("enter the exam  grade:" + (studentCount + 1) + " : ");
			exam = sc.nextInt();
		}
		System.out.printf("average final grade of all the students are: %.2f", (finalgrade / studentCount));
		sc.close();

	}
}
