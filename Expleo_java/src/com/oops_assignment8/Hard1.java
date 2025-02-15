package com.oops_assignment8;
import java.util.*;
class Tollbooth{
	 private int vehicle[] = new int[100];
	 private double cash;
	 private int count = 0;
	public void payingVehicle(int vehicle_detail) {
		vehicle[count++]=vehicle_detail;
		cash+=0.5;
	}
    public void nonpayingVehicle(int vehicle_detail) {
    	vehicle[count++]=vehicle_detail;
	}
    public int getCount() {
        return count;
    }
    public double getCash() {
        return cash;
    }
	
}

public class Hard1 {
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	Tollbooth t=new Tollbooth();
	int vehicle=0;
	boolean tollOpen=true;
	while(tollOpen) {
		System.out.print("enter the VEHICLE number(4 digit): ");
		vehicle=sc.nextInt();
		System.out.println("vehicle eligible to pay(y/n)?: ");
		char pay=sc.next().charAt(0);
		if(pay=='y') {
			t.payingVehicle(vehicle);
		}
		else {
			t.nonpayingVehicle(vehicle);
		}
		
		System.out.print("enter 1 toll open or 2 to close tollbooth");
		int open=sc.nextInt();
		if(open==2) {
			tollOpen=false;
		}
	}
	System.out.println("Number of vehicles: " + t.getCount());
    System.out.println("Total cash collected: $" + t.getCash());

    sc.close();
}
}

