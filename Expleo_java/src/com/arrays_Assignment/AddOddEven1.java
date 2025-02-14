package com.arrays_Assignment;

import java.util.Scanner;

public class AddOddEven1 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[]=new int[size];
		
		System.out.println("enter the array elements: ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int odd=0;
		int even=0;
		for(int i=0;i<size;i++) {
			if(arr[i]%2==0) {
				even++;
			}
			else {
				odd++;
			}
		}
		System.out.printf("odd: %d even: %d",odd,even);
		sc.close();
	}
}
