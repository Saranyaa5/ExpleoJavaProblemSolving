package com.functions_assignment7;

import java.util.Scanner;

public class IntervalPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the min and max limit: ");
		int min = sc.nextInt();
		int max=sc.nextInt();
		checkPrime(min,max);
			
		sc.close();
	}

	public static void checkPrime(int min,int max) {
		
		for(int i=min;i<=max;i++) {
        int x=2;
		boolean flag=true;
		while(x<=i/2) {
			if(i%x==0) {
				flag=false;
			}
			x++;
		 }
		if(flag)
		 System.out.print(i+" ");
		}
		
	}
}
