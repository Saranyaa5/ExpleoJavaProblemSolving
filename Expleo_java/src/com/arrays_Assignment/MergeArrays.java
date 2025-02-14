package com.arrays_Assignment;

import java.util.Scanner;

public class MergeArrays {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array 1: ");
		int size1=sc.nextInt();
		
		int arr1[]=new int[size1];
		
		System.out.println("enter the array elements: ");
		for(int i=0;i<size1;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("enter the size of array 2: ");
		int size2=sc.nextInt();
		
		int arr2[]=new int[size2];
		
		System.out.println("enter the array elements: ");
		for(int i=0;i<size2;i++) {
			arr2[i]=sc.nextInt();
		}
		int arr3[]=new int[size1+size2];
		
		for(int i=0;i<size1+size2;i++) {
			if(i<size1) {
				arr3[i]=arr1[i];
			}
			else {
				arr3[i]=arr2[i-size1];
			}
		}
		System.out.println("array elements of third array:");
		for(int i=0;i<arr3.length;i++) {
			System.out.print(arr3[i]+" ");
		}
		sc.close();
		
	}
}
