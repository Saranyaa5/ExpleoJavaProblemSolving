package com.collections_learning;

import java.util.*;

public class LinkedListCreation {
	public static void main(String []args) {
		LinkedList<String> a=new LinkedList<>();
		System.out.println(a.size());
		a.add("A");
		a.add("b");
		a.add("d");
		a.add("k");
		a.add("q");
		a.add(1,"w");
		System.out.println(a.size());
		System.out.println(a.remove("b"));
		System.out.println(a.remove(1));
		System.out.println(a.removeFirst());
		System.out.println(a);
		Iterator<String> i= a.iterator();
		while(i.hasNext()) {
			
			System.out.print(i.next()+" ");
		}
	}
}
