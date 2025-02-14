package com.collections_learning;
import java.util.Iterator;
import java.util.*;
public class HashSetCreation {
	public static void main(String []args) {
		HashSet<String> a=new HashSet<>();
		System.out.println(a.size());
		a.add("A");
		a.add("b");
		a.add("d");
		a.add("k");
		a.add("B");
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.remove("b"));
		System.out.println(a);
		Iterator<String> i= a.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
				
	}
}
