package com.controlflow_assignment;

import java.util.Scanner;

public class CharacterCount {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String with multiple character: ");
	    String str=sc.nextLine();
	    int Letters=0;
	    int Digits=0;
	    int Symbols=0;
	    for(int i=0;i<str.length();i++) {
	    	char c=str.charAt(i);
	    	if(c>='a' && c<='z' || c>='A' && c<='Z') {
				Letters++;
			}
			else if(c>='0' && c<='9'){
				Digits++;
			}
			else {
				Symbols++;
			}
	    }
	    System.out.printf("Letters: %d, Digits: %d, Other Symbols: %d",Letters,Digits,Symbols);
	
	sc.close();
	}
	}
