package com.collections_assignment;

import java.util.*;

public class NameLength {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> a=new ArrayList<>();
		System.out.println("How many names do you want to input?: ");
		int n=sc.nextInt();
		sc.nextLine();
		System.out.println("enter the  names: ");
		for(int i=1;i<=n;i++) {
			a.add(sc.nextLine());
		}
		
		for(String s: a) {
			if(s.length()>5)
			 System.out.println(s);
		}
		sc.close();
	}
}
