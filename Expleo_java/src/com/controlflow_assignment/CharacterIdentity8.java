package com.controlflow_assignment;

import java.util.Scanner;

public class CharacterIdentity8 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter character: ");
		char c=sc.next().charAt(0);
		
		if(c>='a' && c<='z' || c>='A' && c<='Z') {
			System.out.print("The given character is a alphabet");
		}
		else if(c>='0' && c<='9'){
			System.out.print("user cannot donate blood is a number");
		}
		else {
			System.out.print("user cannot donate blood is a special symbol");
		}
		sc.close();
	}
}
