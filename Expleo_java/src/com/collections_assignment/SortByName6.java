package com.collections_assignment;
import java.util.*;
public class SortByName6 {
	public static void main(String []args) {
		ArrayList<String> a=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of people: ");
	    int n=sc.nextInt();
	    sc.nextLine();
	    while(n>0) {
	    	System.out.println("enter first and last name: ");
		    String name=sc.nextLine();
		    a.add(name);
	    	n--;
	    }
	    Collections.sort(a,new Comparator<String>(){
	    	public int compare(String s1, String s2) {
                return s1.compareTo(s2);
	    }
	    });
	    for(String str: a) {
	    	System.out.println(str+" ");
	    }
	sc.close();
	}
}
