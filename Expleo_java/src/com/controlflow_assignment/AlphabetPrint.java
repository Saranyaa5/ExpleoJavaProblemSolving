package com.controlflow_assignment;

import java.util.Scanner;

public class AlphabetPrint {
	public static void main(String[]args) {
		char ch=97;
		for(int i=0;i<26;i++) {
			System.out.print(ch+""+ (char)(122-i)+" ");
			ch++;
		}
	}
}
