package com.java_Core_Assignment;
import java.util.*;

public class UpperCase4 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter an uppercase string: ");
	        String input = scanner.nextLine();
	        scanner.close();
	        
	        int[] frequency = new int[26];
	        for (char ch : input.toCharArray()) {
	            if (ch >= 'A' && ch <= 'Z') {  
	                frequency[ch - 'A']++;
	            }
	        }
	        System.out.println("Character occurrences:");
	        for (int i = 0; i < 26; i++) {
	            if (frequency[i] > 0) {
	                System.out.println((char) (i + 'A') + ":" + frequency[i]);
	            }
	        }
	    }

}
