package com.arrays_Assignment;

import java.util.Scanner;

public class MissingElement8 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[]=new int[size];
		
		System.out.println("enter the array elements: ");
		int sum=0;
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		int val=((arr.length)*(arr.length+ 1))/2;
		System.out.print("missing element: "+ (sum-val+1));
		sc.close();
	}
}
