package com.java_Core_Assignment;

import java.util.Scanner;

public class VowelPair {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line of text:");
        String s = sc.nextLine().toLowerCase();
        int count=0;
        for(int i=1;i<s.length();i++) {
        	char ch1=s.charAt(i);
        	char ch2=s.charAt(i-1);
        	if(isVowel(ch1) && isVowel(ch2) ) {
        		count++;
        	}
        }
        System.out.println("number of vowel pairs:"+count);
 sc.close();
 }
 public static boolean isVowel(char c) {
	 if(c=='a'||c=='e'|| c=='i'|| c=='o'|| c=='u') {
		 return true;
	 }
	 return false;
 }
}
