package com.controlflow_assignment;

import java.util.Scanner;

public class Divisor2 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int num=sc.nextInt();
	   if(7%num==0) {
		   System.out.print("divisor of 7");
	   }
	   else {
		   System.out.print("not a divisor of 7");  
	   }
		sc.close();
		
	}
}
