package com.java_Core_Assignment;

import java.util.Scanner;

public class NetworkingSite2 {
	public static void main(String [] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the name: ");
		 String name=sc.nextLine();
		 System.out.println("enter the password: ");
		 String pass=sc.nextLine();
		 int length=pass.length();
		 int digit=0;
		 int lowercase=0;
		 int uppercase=0;
		 int specialcharacter=0;
		 int condition=0;
		 for(int i=0;i<pass.length();i++) {
			 char ch=pass.charAt(i);
			 if(ch>='a' && ch<='z') {
				 lowercase++;
				 if(lowercase>0) {
					 condition++;
				 }
			 }
			 else if(ch>='A' && ch<='Z') {
				 uppercase++;
				 if(uppercase>0) {
					 condition++;
				 }
			 }
			 else if(ch>='0'&& ch<='9') {
				 digit++;
				 if(digit>0) {
					 condition++;
				 }
			 }
			 else {
				 specialcharacter++;
				 if(specialcharacter>0) {
					 condition++;
				 }
			 }
		 }
		  
		if(condition==4 && length>=6) {
			System.out.println("Strong password");
		}
		else if(condition==3 && length>=6) {
			System.out.println("moderate password");
		}
		else {
			System.out.println("week password");
		}
	sc.close();	
	}
}
