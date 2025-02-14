package com.collections_assignment;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.*;
public class CharacterCount3 {
	public static void main(String []args) {
		Map<Character,Integer> m=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string: ");
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++) {
			char val=s.charAt(i);
			if(val=='a'|| val=='c'|| val=='s' ||val=='o') {
			if(m.containsKey(val)){
				m.put(val,m.get(val)+1);
			}
			
			else{
				m.put(val,1);
			}
			}
			
		}
		System.out.println(m);
	
	}
}
