package com.java_Core_Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class SortNames3 {
	public static void main(String [] args) {
		 Scanner sc=new Scanner(System.in);
		String [] names= {"saran","THaara","heama","yamini"};
		Arrays.sort(names);
		for(int i=0;i<names.length;i++) {
			System.out.print(names[i]+" ");
		}
		sc.close();
	}
}
