package com.collections_learning;
import java.util.*;
public class DequeCreation {
public static void main(String [] args) {
	Deque<Integer> d= new ArrayDeque<>();
	d.push(5);
	System.out.println(d);
	d.push(6);
	System.out.println(d);
	d.offer(1);
	System.out.println(d);
	d.offer(2);
	System.out.println(d);
	d.offerLast(3);
	System.out.println(d);
	d.addFirst(11);
	d.addLast(12);
	d.addLast(6);
	d.addLast(3);
	System.out.println(d);
	d.removeFirstOccurrence(3);
	d.add(1);
	Iterator<Integer> it = d.iterator();
	while(it.hasNext()){
		System.out.print(it.next()+" ");
	}

	System.out.println();
	Iterator<Integer> di = d.descendingIterator();
	while(di.hasNext()){
		System.out.print(di.next()+" ");
	}
	
}
}
