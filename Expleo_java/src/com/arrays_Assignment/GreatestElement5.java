package com.arrays_Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class GreatestElement5 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[]=new int[size];
		
		System.out.println("enter the array elements: ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.printf("greatest element: %d",arr[size-1]);
		sc.close();
	}
}
