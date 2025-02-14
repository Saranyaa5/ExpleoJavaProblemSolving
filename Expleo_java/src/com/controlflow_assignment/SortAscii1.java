package com.controlflow_assignment;

import java.util.Arrays;

import java.util.Scanner;

public class SortAscii1 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String with multiple character: ");
	    String str=sc.nextLine();
	    StringBuilder sb=new StringBuilder();
	   
	    char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        sb.append(charArray);
	    System.out.println("Sorted string: " + sb.toString());
	    sc.close();
	}
}
