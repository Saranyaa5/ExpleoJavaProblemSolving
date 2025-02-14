package com.controlflow_assignment;

import java.util.Scanner;

public class FestivalDiscount4 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the puchase amount: ");
		float amount=sc.nextFloat();
		float final_amt=0;
		if(amount<2000) {
			final_amt= (float) (amount*0.05);
		}
		else if(amount>=2000 && amount<5000) {
			final_amt= (float) (amount*0.25);
		}
		else if(amount>=5000 && amount<10000) {
			final_amt= (float) (amount*0.35);
		}
		else {
			final_amt= (float) (amount*0.50);
		}
		System.out.println("final amount after discount: "+(amount-final_amt));
		sc.close();
        
	}
}
