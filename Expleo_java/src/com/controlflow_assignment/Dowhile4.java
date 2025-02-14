package com.controlflow_assignment;

import java.util.Scanner;

public class Dowhile4 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int num=sc.nextInt();
		int ans=0;
		do {
			ans+=num;
			num--;
		}while(num>0);
		System.out.print(ans);
		sc.close();
	}
}
