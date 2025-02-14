package com.arrays_Assignment;

import java.util.HashSet;
import java.util.Scanner;

public class EliminateDuplicate4 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[]=new int[size];
		
		System.out.println("enter the array elements: ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		HashSet<Integer> h=new HashSet<>();
		for(int i=0;i<size-1;i++) {
			h.add(arr[i]);
		}
		System.out.println("the unique elements are: ");
		for(int val:h) {
			System.out.print(val+" ");
		}
		sc.close();
		
	}
}
