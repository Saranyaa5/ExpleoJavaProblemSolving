package com.arrays_Assignment;

import java.util.Scanner;

public class Chocolates1 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of childer: ");
        int size = sc.nextInt();
        int arr[]=new int[size];
       
		System.out.println("enter the chocolates with each children: ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int total_chocolate=0;
		for(int i=0;i<size;i++) {
			total_chocolate +=arr[i];
		}
		if(total_chocolate%size==0) {
			System.out.print("yes!! chocolate can be equally shared among all");
		}
		else {
			System.out.print("No!! chocolate cannot be shared equally among all");
		}
		sc.close();
	}
}
