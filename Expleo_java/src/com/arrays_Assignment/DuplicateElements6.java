package com.arrays_Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElements6 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the size of the array: ");
			int size = sc.nextInt();
			int arr[] = new int[size];

			System.out.println("enter the array elements: ");
			for (int i = 0; i < size; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			int i = 0;
			for (; i < size - 1; i++) {
				if (arr[i] == arr[i + 1]) {
					break;
				}
			}
			System.out.print("duplicate element: " + arr[i]);
			sc.close();
		}
	}
}
