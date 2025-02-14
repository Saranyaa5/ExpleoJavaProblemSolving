package com.controlflow_assignment;

import java.util.Scanner;

public class InternetBill4 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter the number of hours: ");
		String hours = sc.nextLine().trim();//input (01_hr/min)
		int sum=0;
		if (hours.substring(hours.length() - 2).equalsIgnoreCase("hr")) {
			int val=Integer.parseInt(hours.substring(0, 2)); 
			if(val>7) {
				 System.out.print("the browsing time cannot be more than 7 hours");
				 
			 }
			 if(val>=5 && val<=7) {
				 
				 sum=(5)*200;
				 val-=5;
			 }
			 if(val < 5) {
			       sum+=(val*50);
			 } 
		}
		else {
			int val=Integer.parseInt(hours.substring(0, 2));
			sum=val;
		}
		System.out.print("bill for internet: "+sum);
		sc.close();
	}
}
