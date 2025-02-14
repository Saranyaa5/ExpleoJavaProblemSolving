package com.java_Core_Assignment;

import java.util.Scanner;

public class String1 {
	public static void main(String [] args) {
		 Scanner sc=new Scanner(System.in);

		 
		 String s="INDIA";
		 String encrpt="";
		 char c[]=s.toCharArray();
		 for(int i=0;i<s.length();i++) {
			 c[i]=(char) (c[i]+2);
			 encrpt+=c[i];
		 }
		 System.out.println("encrpted string: "+encrpt);
		 
		 
		sc.close();
	}
}
