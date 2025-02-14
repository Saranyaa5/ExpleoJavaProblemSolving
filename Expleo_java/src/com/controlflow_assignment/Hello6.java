package com.controlflow_assignment;

import java.util.Scanner;

public class Hello6 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int num=sc.nextInt();
		while(num>0) {
		for(int i=0;i<num;i++) {
			System.out.print("hello ");
		}
		
		System.out.println("\nenter the number: ");
		num=sc.nextInt();
		}
		sc.close();
	}
}

	