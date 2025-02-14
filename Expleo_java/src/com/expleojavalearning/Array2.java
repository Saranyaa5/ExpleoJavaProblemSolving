package com.expleojavalearning;
import java.util.*;
public class Array2 {
 public static void main(String [] args) {
	 Scanner sc=new Scanner(System.in);
	 char a[][]= {{'a','b','a','b'},{'a','a','a','a','b'},{'a','b','b','a','b'},{'a','b','a'}};
	 int totalpremium=10;
	 int premium=0;
	 int totalvip=4;
	 int vip=0;
	 int totalregular=3;
	 int regular=0;
	 for(int i=0;i<a.length;i++) {
		 if(i==0) {
			 System.out.println("-------------vip------------------");
			 for(int j=0;j<a[i].length;j++) {
				 if((a[i][j])=='b') {
					 vip++;
				 }
			 }
			 System.out.println("seats booked: "+vip+"  seats available: "+ (totalvip-vip)+" total: "+ totalvip);
		 }
		 if(i==1 || i==2) {
			 if(i==2) {
			   System.out.println("------------premium---------------");
			 }
			 for(int j=0;j<a[i].length;j++) {
				 if((a[i][j])=='b') {
					 premium++;
				 }
			 }
			 if(i==2)
			  System.out.println("seats booked: "+premium+"  seats available: "+ (totalpremium-premium)+" total: "+totalpremium);
		 }
		 if(i==3) {
			 System.out.println("------------regular---------------");
			 for(int j=0;j<a[i].length;j++) {
				 if((a[i][j])=='b') {
					 regular++;
				 }
			 }
			 System.out.println("seats booked: "+regular+"  seats available: "+ (totalregular-regular)+" total: "+totalregular);
		 }
		 
			
		}
	 // jagged array
//	 int a[][]=new int[3][];
//	 a[0]=new int[] {1,2,4};
//	 a[1]=new int[] {5,6};
//	 a[2]=new int[] {1,4,9,3};
//	 for(int i=0;i<a.length;i++) {
//		 for(int j=0;j<a[i].length;j++) {
//			 	System.out.print((a[i][j])+ " ");
//		 }
//		 System.out.println();
//	 }
	 
	sc.close();
	
 }
}
