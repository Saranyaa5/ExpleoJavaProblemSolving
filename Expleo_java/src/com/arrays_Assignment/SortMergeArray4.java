package com.arrays_Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class SortMergeArray4 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array 1: ");
		int size1=sc.nextInt();
		
		int arr1[]=new int[size1];
		
		System.out.println("enter the array elements: ");
		for(int i=0;i<size1;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("enter"
				+ " the size of array 2: ");
		int size2=sc.nextInt();
		
		int arr2[]=new int[size2];
		
		System.out.println("enter the array elements: ");
		for(int i=0;i<size2;i++) {
			arr2[i]=sc.nextInt();
		}
		System.out.println("enter the size of array 3: ");
		int size3=sc.nextInt();
		
		int arr3[]=new int[size3];
		
		System.out.println("enter the array elements: ");
		for(int i=0;i<size3;i++) {
			arr3[i]=sc.nextInt();
		}
		int arr4[]=new int[size1+size2+size3];
		
		for(int i=0;i<size1+size2+size3;i++) {
		    if(i<size1) {
		        arr4[i]=arr1[i];
		    }
		    else if(i>=size1 && i<(size1+size2)) { 
		        arr4[i]=arr2[i-size1];
		    }
		    else {
		        arr4[i]=arr3[i-(size1+size2)];
		    }
		}
        System.out.println("array elements of third array:");
		Arrays.sort(arr4);
		for(int i=0;i<arr4.length;i++) {
			System.out.print(arr4[i]+" ");
		}
		sc.close();
	}
}
