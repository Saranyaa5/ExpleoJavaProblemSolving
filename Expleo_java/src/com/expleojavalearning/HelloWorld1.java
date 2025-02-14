package com.expleojavalearning;

import java.util.*;

public class HelloWorld1 {
	public static void main(String[] args) {
    byte b=42;
    char c='a';
    short s=1024;
    int i=50000;
    float f= 5.67f;
    double d=.1234;
    double result= ((f*b)+(i/c)-(d*s));
    System.out.println("result: "+result);
    System.out.println("result: "+(int)result);
    System.out.printf("%.2f",result);
    Scanner sc=new Scanner(System.in);
    char n=sc.next().charAt(0);
    System.out.println(n);
    sc.nextLine();
    String str=sc.nextLine();
    System.out.println(str);
    sc.close();
    
		
	}
}
