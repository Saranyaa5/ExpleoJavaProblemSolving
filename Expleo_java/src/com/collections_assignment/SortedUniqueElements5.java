package com.collections_assignment;

import java.util.*;

public class SortedUniqueElements5 {
	public static void main(String []args) {
		TreeSet<Integer> tree = new TreeSet<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number(or typer done to finish):");
		String n = sc.next();
		float average=0;
		int highest=Integer.MIN_VALUE;;
		int lowest=Integer.MAX_VALUE;;
		ArrayList<Integer> odd=new ArrayList<>();
		while(true) {
			if(!(n.equals("done"))) {
				int num = Integer.parseInt(n);
				tree.add(num);
				highest=Math.max(highest,num);
				lowest=Math.min(lowest,num);
			}
			else {
				break;
			}
			System.out.println("enter number(or typer done to finish):");
			n = sc.next();
		}
		for(int val:tree) {
			average+=val;
			if(val%2!=0) {
				odd.add(val);
			}
		}
		System.out.println("Sorted unique numbers: "+ tree );
		System.out.println("average "+ average/tree.size() );
		System.out.println("highest "+ highest );
		System.out.println("lowest "+ lowest );
		for(int val: odd) {
			System.out.print(val+ " ");
		}
		
	}
}
