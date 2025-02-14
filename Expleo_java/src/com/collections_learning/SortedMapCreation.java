package com.collections_learning;
import java.util.*;
public class SortedMapCreation {
public static void main(String [] args) {
	TreeMap<String,Double> t=new TreeMap<String,Double>();
	System.out.println("size of the TreeMap: "+ t.size());
	t.put("cara",(double) 45);
	t.put("baren",(double) 42);
	t.put("anita",(double) 64);
	t.put("david",(double) 35);
	System.out.println(t);
	
	for(Map.Entry<String, Double> val: t.entrySet()) {
	    System.out.print(val.getKey());
	}

}
}
