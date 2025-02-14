package com.arrays_Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class DuplicateUnique3 {
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
		ArrayList<Integer> al=new ArrayList<>();
		HashSet<Integer> h=new HashSet<>();
		
		for(int i=0;i<size-1;i++) {
			if(arr[i+1]==arr[i]){
				al.add(arr[i]);
				
			}
			h.add(arr[i]);
		}
		h.add(arr[size-1]);
		System.out.println("duplicate elements: "+ al.size() );
		
		System.out.println("\nunique elements: "+h.size() );
		for(int val: h) {
			System.out.print(val+" ");
		}
		sc.close();		
	}
}
