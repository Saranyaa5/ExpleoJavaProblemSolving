package com.arrays_Assignment;

import java.util.Scanner;

public class FreqArray4 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[]=new int[size];
        int freq[]=new int[128];
		System.out.println("enter the array elements: ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			freq[arr[i]]++;
		}
		for(int i=0;i<freq.length;i++) {
			if(freq[i]>0)
				System.out.println(i+" : "+freq[i]);
		}
		
		
		sc.close();
	}
}
