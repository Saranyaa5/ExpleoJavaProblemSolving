package com.controlflow_assignment;

import java.util.Scanner;

public class Medium2 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Quantity: ");
		int quantity=sc.nextInt();
		System.out.println("enter price: ");
		int price=sc.nextInt();
		if(quantity>500){
			System.out.print((quantity*price)*0.15);
		}
		else {
			System.out.print(quantity*price);
		}
		sc.close();
	}
}
