package com.controlflow_assignment;

import java.util.Scanner;


public class LuckyNumber3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the car number:" );
		
		String s=sc.next();
		int car_number=Integer.parseInt(s);
		int len=s.length();
		int digit_sum = 0;
		if (len==4){
			while (car_number > 0) {
				 digit_sum += car_number % 10;
				 car_number /= 10;
			}
			if ( digit_sum % 3 == 0 ||  digit_sum % 5 == 0 ||  digit_sum % 7 == 0) {
				System.out.print(s+" is a Lucky number");
			} else {
				System.out.print(s+" is not a Lucky number");
			}

		} 
		else {
			System.out.print(s+" not a valid car number");
		}
		sc.close();

	}
}
