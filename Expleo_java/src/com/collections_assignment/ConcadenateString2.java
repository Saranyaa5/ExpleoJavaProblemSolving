package com.collections_assignment;

import java.util.*;

public class ConcadenateString2 {
	public static void main(String []args) {
		Set<String> set=new LinkedHashSet<>();
		set.add("java");
		set.add("hello");
		set.add("programming");
		set.add("world");
		
		StringBuilder sb=new StringBuilder();
		Iterator<String> i= set.iterator();
		while(i.hasNext()) {
			String val=i.next();
			System.out.print(val+" ");
			sb.append(val);
			sb.append(" ");
		}
		System.out.println("\nconcatenated result: "+sb);
		
	}
}
