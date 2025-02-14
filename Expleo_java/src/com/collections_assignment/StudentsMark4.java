package com.collections_assignment;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;

public class StudentsMark4 {
	public static void main(String []args) {
		Map<String,Integer> m=new LinkedHashMap<>();
		m.put("Mano",85);
		m.put("Shan",85);
		m.put("John",55);
		m.put("Anu",60);
		m.put("Aju",90);
		m.put("Frank",85);
		System.out.println("Student Marks above 75 in the stack: ");
		Stack<String> stack=new Stack<>();
		for(Map.Entry<String,Integer> val: m.entrySet()) {
			validate(stack,val);
		}
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
		
	}
	public static void validate(Stack<String> stack,Map.Entry<String,Integer> val) {
		if(val.getValue()>75) {
			stack.push(val.getKey());
		}
	}
}
