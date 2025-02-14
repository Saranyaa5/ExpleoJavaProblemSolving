package com.arrays_Assignment;

import java.util.Scanner;

public class ElementCount5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		int data_structure[] = new int[size];
		int count[] = new int[100];
		System.out.println("enter the array elements: ");
		for (int i = 0; i < size; i++) {
			data_structure[i] = sc.nextInt();
			count[data_structure[i]]++;
		}

		for (int i = 0; i < 100; i++) {
			if (count[i] > 0) {
				System.out.println(i + " : " + count[i]);
			}
		}
		sc.close();
	}
}
