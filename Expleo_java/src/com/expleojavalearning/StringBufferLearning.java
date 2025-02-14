package com.expleojavalearning;

import java.util.Scanner;

public class StringBufferLearning {
	public static void main(String [] args) {
		 Scanner sc=new Scanner(System.in);
		StringBuffer sb=new StringBuffer("hello");
//		System.out.println(sb.append("world"));
//		System.out.println(sb.insert(2,"really"));
//		System.out.println(sb.replace(2,4,"xxx"));// end index in exclusive
//		System.out.println(sb.delete(2,4));
//		System.out.println(sb.reverse());
		//System.out.println(sb.length());
		sb.append("hibsjblaigf[ekn;wfjw;poihgndafg"
				+ "h;bndv.s;bns.;kbnsghsirhs8");
		System.out.println(sb.capacity());
		sc.close();
		String s1="dbs";
		String s2="ace";
		System.out.println(s1.compareTo(s2));
		}
}
