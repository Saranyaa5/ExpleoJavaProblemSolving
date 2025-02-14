package com.collections_learning;
import java.util.*;
public class PriorityQueueCreation {
public static void main(String [] args) {
	PriorityQueue<String > pq=new PriorityQueue();
	System.out.println("the size of priority queue: "+pq.size());
	
	pq.offer("a");
	pq.offer("k");
	pq.offer("w");
	pq.offer("u");
	pq.offer("r");
	pq.offer("m");
	
	System.out.println(pq);
	pq.poll();
	System.out.println(pq);
	pq.offer("a");
	
}
}
