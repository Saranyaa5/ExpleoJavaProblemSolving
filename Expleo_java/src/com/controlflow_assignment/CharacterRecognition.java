package com.controlflow_assignment;

import java.util.Scanner;

public class CharacterRecognition {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the character: ");
		char ch=sc.next().charAt(0);
	   if(String.valueOf(ch).equalsIgnoreCase("a")
			   ||String.valueOf(ch).equalsIgnoreCase("e")
			   || String.valueOf(ch).equalsIgnoreCase("i") 
			   ||String.valueOf(ch).equalsIgnoreCase("o") 
			   || String.valueOf(ch).equalsIgnoreCase("u")){
		   System.out.println("character is a vowel");
	   }
	   else if((ch>='a'&& ch<='z')||ch>='A'&& ch<='B'){
		   System.out.print("character is a consonant");  
	   }
	   else {
		   System.out.print("character is a special symbol");
	   }
		sc.close();
		
	}
}
