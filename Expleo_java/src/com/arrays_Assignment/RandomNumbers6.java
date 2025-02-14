package com.arrays_Assignment;

import java.util.Scanner;

public class RandomNumbers6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr1[] = new int[25];
		int count[] = new int[128];
		System.out.println("enter the 25 numbers randomly : ");
		for (int i = 0; i < 25; i++) {
			arr1[i] = sc.nextInt();
			count[arr1[i]]++;
		}
		for (int i = 0; i < count.length; i++) {
			if (count[i] > 0) {
				System.out.println(i + " : " + count[i]);
			}
		}

		sc.close();
	}
}
