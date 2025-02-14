package com.collections_learning;

import java.util.TreeSet;

public class TreeSetCreation {
public static void main(String [] args) {
//	TreeSet<String> t=new TreeSet<>();
//	System.out.println("Size of the TreeSet: "+t.size());
//	t.add("C");
//	t.add("B");
//	t.add("C");
//	t.add("W");
//	t.add("Y");
//	t.add("Q");
//	t.add("A");
//	System.out.println("Elements in the treeset" + t);
//	t.pollFirst();
//	System.out.println("Elements in the treeset" + t);
//	t.pollLast();
//	System.out.println("Elements in the treeset" + t);
//	t.lower("K");
//	System.out.println("Elements in the treeset" + t.lower("K"));
	TreeSet<Integer> t=new TreeSet<>();
	t.add(1);
	t.add(2);
	t.add(3);
	t.add(4);
	t.add(5);
	t.add(6);
	System.out.println(t);
	System.out.println("lower: "+ t.lower(3));
	System.out.println("floor: " +t.floor(3));
	System.out.println("higher: " + t.higher(3));
	System.out.println("ceiling: "+t.ceiling(3));
	t.remove(3);
	t.remove(2);
	t.remove(1);
	System.out.println(t);
	System.out.println("lower: "+ t.lower(3));
	System.out.println("floor: " +t.floor(3));
	System.out.println("higher: " + t.higher(3));
	System.out.println("ceiling: "+t.ceiling(3));
	
}
}
