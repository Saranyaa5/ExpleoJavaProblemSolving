package com.java_Core_Assignment;
import java.util.Scanner;

public class DelayInThirdWord1 {
	public static void main(String [] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the string:");
		 String s=sc.nextLine();
		 String [] word=s.split("\\s+");
		for(int i=0;i<word.length;i++) {
			if(i==2) {
				System.out.println("\n....pls wait");
			}
			System.out.print(word[i]+" ");
		}
		sc.close();
		
	}
}
