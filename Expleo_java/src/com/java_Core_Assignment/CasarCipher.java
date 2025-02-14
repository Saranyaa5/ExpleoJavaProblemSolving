package com.java_Core_Assignment;

import java.util.Scanner;

public class CasarCipher {
	public static void main(String [] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("1.sender\n2.receiver\n3.exit\nenter the option:");
		 int n=sc.nextInt();
		 System.out.println("enter the key: ");
		 int key=sc.nextInt();
		 sc.nextLine();
		 System.out.println("enter the original text: ");
		 String s=sc.nextLine();
		 char c[]=s.toCharArray();
		 while(n!=3) {
			 String newtext="";
		 if(n==1) {
			 
		 for(int i=0;i<s.length();i++) {
			 c[i]=(char) (c[i]+key);
			 newtext+=c[i];
		 }
		 }
		 else if(n==2){
			 for(int i=0;i<s.length();i++) {
				 c[i]=(char) (c[i]-key);
				 newtext+=c[i];
			 }
		 }
		 
		 System.out.println(n==1?"the encryped text is: "+newtext: "the decryped text is: "+newtext);
		 System.out.println();
		 System.out.println("1.sender\n2.receiver\n3.exit\nenter the option: ");
		 n=sc.nextInt();
		 if(n==3) {
			 break;
		 }
		 System.out.println("enter the key: ");
		 key=sc.nextInt();
		 sc.nextLine();
		 System.out.println("enter the original text: ");
		 s=sc.nextLine();
		 c=s.toCharArray();
		 }
		sc.close(); 
	}

}
