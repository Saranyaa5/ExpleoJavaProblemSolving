package com.controlflow_assignment;

import java.util.*;

public class Factorial5 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter a number: ");
	        int num = sc.nextInt();
	        int fact=1;
	        if (num <=00) {
	            System.out.println("Invalid Input");
	        } 
	        else {
	        	int i=1;
	            while(fact<num) {
	            	fact*=i;
	            	i++;
	            }

	            if (fact == num) {
	                System.out.println(i-1);
	            } else {
	                System.out.println("Sorry. The given number is not a perfect factorial");
	            }
	        }
	        sc.close();
	 }
}
