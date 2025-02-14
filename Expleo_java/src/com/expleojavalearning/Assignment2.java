package com.expleojavalearning;

public class Assignment2 {
public static void main(String[]args) {
	int n=9473;
	int temp=n;
	int len=String.valueOf(n).length();
	long val=0;
	while(n>0) {
		
		int x=1;
		for(int i=1;i<=len;i++) {
			x*=n%10;
		}
		val+=x;
		n/=10;
		
	}
	if(val==temp)
	 System.out.println("amstrong");
	else {
		System.out.println("not amstrong");
	}
}
}
