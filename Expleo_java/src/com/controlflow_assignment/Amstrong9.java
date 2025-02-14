package com.controlflow_assignment;

import java.util.Scanner;

public class Amstrong9 {
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int n=sc.nextInt();
		int temp=n;
		int len=String.valueOf(n).length();
		long val=0;
		while(n>0) {
			
			int x=1;
			for(int i=1;i<=len;i++) {
				x*=n%10;
			}
			val+=x;
			n/=10;
			
		}
		if(val==temp)
		 System.out.println("amstrong");
		else {
			System.out.println("not amstrong");
		}
		sc.close();
	}
	

}
