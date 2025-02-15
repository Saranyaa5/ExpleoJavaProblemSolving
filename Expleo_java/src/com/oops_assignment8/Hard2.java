package com.oops_assignment8;
import java.util.*;
class BrowsingCentre{
	int memId;
	String memName;
	String memLocation;
	String memType;
	int hours;
	float totalBill;
	BrowsingCentre(String name,int id,String location,String memberType,int hours){
		this.memId=id;
		this.memName=name;
		this.memLocation=location;
		this.memType=memberType;
		this.hours=hours;
		
	}
	public void setBill(Scanner sc) {
		if(memType.equalsIgnoreCase("prime")) {
			System.out.println("how many weeks you used the browsing centre: ");
				int weeks=sc.nextInt();
				// weeky charge 1000 rupees
				totalBill=weeks*1000;
				sc.nextLine();
			
			
		}
		else {
			// 50 rupees hourly
			totalBill=hours*50;
		}
	}
	public void getBill() {
        System.out.println("Total Bill of "+memName+" is Rs."+totalBill);
    }
	
	public void getUsage() {
        if (memType.equalsIgnoreCase("prime")) {
            System.out.println(memName+" is a Prime Member with a fixed weekly rent.");
        }
        else {
            System.out.println(memName+" used "+hours+" hours.");
        }
    }
	 public void HighPaidHourlyUser() {
		 if(totalBill>2000 && memType.equalsIgnoreCase("normal")) {
			 System.out.printf("name: %s, bill: %f\n",memName,totalBill);
		 }
	 }
	
}
public class Hard2 {
	public static void main(String []args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter the number of members in the browsing centre:");
			int size=sc.nextInt();
			BrowsingCentre members[]=new BrowsingCentre[size];
			sc.nextLine();
			for(int i=0;i<size;i++) {
				System.out.printf("enter member %d name:\n",i+1);
				String name=sc.nextLine();
				System.out.println("enter member id");
				int id=sc.nextInt();
				sc.nextLine();
				System.out.println("enter the location:");
				String location=sc.nextLine();
			    System.out.println("member type? (prime/normal): ");
				String memberType=sc.nextLine();
				System.out.println("enter browsing hours");
				int hours=sc.nextInt();
				sc.nextLine();
				members[i]=new BrowsingCentre(name,id,location,memberType,hours);
				members[i].setBill(sc);
			}
			
			for(BrowsingCentre obj: members) {
				 obj.getUsage();
			     obj.getBill();
			}
			System.out.println("----------Normal members who paid more than 2000/month-----------");
			
			for(BrowsingCentre obj: members) {
				obj.HighPaidHourlyUser();
			}
		}
	
	}

}
