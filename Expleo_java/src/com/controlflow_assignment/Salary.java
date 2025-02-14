package com.controlflow_assignment;
import java.util.*;
public class Salary {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of days: ");
		int salary=sc.nextInt();
		System.out.println("enter wages: ");
		int days=sc.nextInt();
		System.out.print("salary: "+(salary*days));
		sc.close();
		
	}
}
