package com.collections_learning;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIntegercREATION {
	public static void main(String []args) {
		ArrayList<Integer> a=new ArrayList<>();
		System.out.println("enter the elements: ");
		a.add(1);
		a.add(2);
		a.add(4);
		a.add(3);
		Iterator<Integer> i=a.iterator();
		while(i.hasNext()) {
			if(i.next()==4) {
				i.remove();
			}
		}
		System.out.print(a);
	}
}
