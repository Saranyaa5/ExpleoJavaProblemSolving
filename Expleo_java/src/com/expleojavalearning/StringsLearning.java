package com.expleojavalearning;
import java.util.*;
public class StringsLearning {
 public static void main(String [] args) {
	 Scanner sc=new Scanner(System.in);
	 String s1="saran";
	 System.out.println("length: "+s1.length());
	 String s2=" welcome ";
	 System.out.println("concat: "+ s1.concat(s2));
	 //System.out.println(s1.substring(3,6));
	 System.out.println("uppercase: "+s1.toUpperCase());
	 System.out.println("trim:"+s2.trim()); 
	 System.out.println("startswith: "+s1.startsWith("Sara"));
	 char[]c=s1.toCharArray();
	 
	 String s="saran";
	 String sa=new String("saran");
	 System.out.println(s.equals(s1));
	 
	sc.close();
 }
}
