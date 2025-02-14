package com.collections_learning;

import java.util.Iterator;
import java.util.*;
public class StackCreation {
public static void main(String []args) {
	Stack<String> a=new Stack<>();
	System.out.println(a.size());
	a.push("A");
	a.push("b");
	a.push("d");
	a.push("k");
	a.push("q");
	a.pop();
	System.out.println(a.peek());
	System.out.println(a.size());
	System.out.println(a);
	Iterator<String> i= a.iterator();
	while(i.hasNext()) {
		
		System.out.print(i.next()+" ");
	}
		
}
}
