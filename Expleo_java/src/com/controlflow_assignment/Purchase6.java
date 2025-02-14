package com.controlflow_assignment;

import java.util.Scanner;

public class Purchase6 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the puchase amt: ");
		float amount=sc.nextFloat();
		System.out.println("enter the quantity of the product: ");
		float quantity=sc.nextInt();
		float amount_paid=0;
		if(amount<1000) {
			amount_paid=(float) ((amount*quantity) - ((amount*quantity)*0.1));
			
		}
		else {
			amount_paid=(float) ((amount*quantity) - ((amount*quantity)*0.05));
		}
		System.out.println("the final paid amount: "+ amount_paid);
		sc.close();
	}
		
}
