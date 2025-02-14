package com.collections_learning;
import java.util.*;
public class HashMapCreation {
public static void main(String []args) {
	Map<Integer,Integer> m=new LinkedHashMap<>();
	int a[]= {1,2,4,2,3,7,1,6,7};
	Map<String,Integer> sm=new HashMap<>();
	String sa[]= {"kaviya","meena","sarnya","tharani","yamin","amir","banu"};
	for(int val:a) {
		if(m.containsKey(val)){
			m.put(val,m.get(val)+1);
		}
		else{
			m.put(val,1);
		}
		System.out.print("\n"+ m);
		
	}
	for(String val:sa) {
		if(sm.containsKey(val)){
			sm.put(val,sm.get(val)+1);
		}
		else{
			sm.put(val,1);
		}
		System.out.print("\n"+ sm);
		
	}
//	for(Map.Entry<Integer,Integer> val:m.entrySet()) {
//		System.out.print(val+ " ");
//	}
//	for(Integer val:m.keySet()) {
//		System.out.print(val+ " ");
//	}
	
	//System.out.print("\n"+m);
	
}
}
