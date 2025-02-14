package com.java_Core_Assignment;

import java.util.Scanner;

public class PrintChar2 {
	public static void main(String [] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the string with alph,numb,specialchar: ");
		 String s=sc.nextLine();
		 String alphabetString="";
		 char c[]=s.toCharArray();
		 for(int i=0;i<s.length();i++) {
			
			 if((c[i]>='a' && c[i]<='z')||(c[i]>='A' && c[i]<='Z')) {
				 alphabetString+=c[i];
			 }
		 }
		 System.out.println(alphabetString);
		 sc.close();
	}

}
