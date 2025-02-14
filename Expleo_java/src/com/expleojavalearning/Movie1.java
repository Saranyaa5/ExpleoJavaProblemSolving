package com.expleojavalearning;

import java.util.*;

public class Movie1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//	        System.out.print("Enter movie ID: ");
//	        int movieId = sc.nextInt();
//	        sc.nextLine();
//
//	        System.out.print("Enter movie name: ");
//	        String movieName = sc.nextLine();
//
//	        System.out.print("Enter movie genre: ");
//	        String movieGenre = sc.nextLine();
//
//	        System.out.print("Enter movie description: ");
//	        String movieDesc = sc.nextLine();
//
//	        System.out.print("Enter movie language: ");
//	        String movieLang = sc.nextLine();
//
//	        System.out.print("Enter date (dd/mm/yyyy): ");
//	        String movieDate = sc.nextLine();
//
//	        System.out.println("\nMovie Details:");
//	        System.out.println("ID: " + movieId);
//	        System.out.println("Name: " + movieName);
//	        System.out.println("Genre: " + movieGenre);
//	        System.out.println("Description: " + movieDesc);
//	        System.out.println("Language: " + movieLang);
//	        System.out.println("Release Date: " + movieDate);
		

//		System.out.print("Enter seat number: ");
//		String s = sc.next();
//
//		if (s.equalsIgnoreCase("regular")) {
//			System.out.print(43);
//		}
//		else if(s.equalsIgnoreCase("standard")) {
//			System.out.print("934");
//		}
//		else if(s.equalsIgnoreCase("premium")) {
//			System.out.print("2446");
//		}
//		else  {
//			System.out.print("48234");
//		}
		
	//day 2 example
		
//	String username="saranya";
//	String password="saranya@123";
//	String enteredname="";
//	String eneteredname="";
//	String enteredpass="";
//	boolean steatAvailabe=true;
//	int seat=0;
//	System.out.println("enter the user name: ");
//	enteredname=sc.nextLine();
//	System.out.println("enter the password: ");
//	enteredpass=sc.nextLine();
//	if(username.equals(enteredname) && password.equals(enteredpass)) {
//		System.out.print("enter seat number");
//		seat=sc.nextInt();
//		if(steatAvailabe) {
//			System.out.print("your seat number is "+ seat);
//		}
//		else {
//			System.out.print("seats not availabe");
//		}
//	}
//	else {
//		System.out.print("not a valid user");
//	}
//	
//	sc.close();
		
	//day 2 switch case
		
//	System.out.print("enter type to be searched\n 1.Search by title"
//			+ " \n2.Search by language \n3.search by Release date \n4.Search by genre ");
//    int input=sc.nextInt();
//    switch(input) {
//    case 1:
//    	System.out.print("your search choice is by title");
//    	break;
//    case 2:
//    	System.out.print("your search choice is by language");
//    	break;
//    case 3:
//    	System.out.print("your search choice is by release date");
//    	break;
//    case 4:
//    	System.out.print("your search choice is by genre");
//    	break;
//    default:
//    	System.out.print("your search is incorrect input");
//    
//    }
	//looping
	// while
//	int seat=0,maxseat=10;
//	while(seat<maxseat) {
//		seat++;
//		System.out.println(maxseat-seat);
//	}
//	System.out.print("seats filled");
//	
//	}
//	 do while
// int seat=0;int max=10;
//    do {
//    
//         System.out.println(max-seat);
//         seat++;
//    }while(seat<max);
//	}
	//for loop
//	int seat=0;int max=10;
//	for(;seat<max;seat++ ) {
//		 System.out.println(max-seat);
//		
//	}
//	System.out.print("seats filled");
		
	//for each loop
//    String movie[]= {"aaa","bbb","ccc","fhosl"};
//    String genre[]= {"action","thriller","comedy","action"};
//    System.out.println("enter the genre to watch");
//    String type=sc.nextLine();
//    int count=0;
//    for(String val:genre) {
//    	if(val.equalsIgnoreCase(type)) {
//    		System.out.println(movie[count]);
//    	}
//    	count++;
//    }
	//nested loop
//	int maxSeat=5;
//	int maxscreen=2;
//	int seat=0;
//	int screen=0;
//	while(screen<maxscreen) {
//		screen++;
//		System.out.println("seat availability of screen: " + screen);
//		while(seat<maxSeat) {
//			System.out.println("seats availabe: "+ (maxSeat-seat));
//			seat++;
//		}
//		System.out.println("screen: "+ screen+" filled");
//		seat=0;
//	}
	// nested loop: do while
//		int maxSeat=5;
//		int maxscreen=2;
//		int seat=0;
//		int screen=0;
//		do {
//			screen++;
//			System.out.println("seat availability of screen: " + screen);
//			do {
//				System.out.println("seats availabe: "+ (maxSeat-seat));
//				seat++;
//			}
//			while(seat<maxSeat);
//			
//			System.out.println("screen: "+ screen+" filled");
//			seat=0;
//		}
//		while(screen<maxscreen); 
	
//		//unconditional
//		int maxvip=5,maxpremium=5,seats=0;
//		int totalseat=maxvip+maxpremium;
//		for(;seats<totalseat;seats++) {
//			if(seats>maxpremium) {
//			  System.out.println("all premium seats are booked");	
//			  System.out.println("vip 1 to 5 are reserved");
//			  break;
//			}
//			else {
//				System.out.println("premium seats available:" + (maxpremium-seats ));
//			}
//		}
//		int maxvip=5,maxpremium=5,excecutive=5,seats=0;
//        int totalseat=maxvip+maxpremium+excecutive;
//        for(;seats<totalseat;seats++) {
//        	if(seats<maxvip) {
//        		System.out.println("all vip is reserved");
//        		continue;
//        	}
//        	else if(seats<10) {
//        		System.out.println("premium seats:"+ (seats+1));
//        	}
//        
//        	else if(seats<15) {
//        	System.out.println("excecutive seats:"+  (seats+1));
//            }
//        }
		// labelled break
//		int seat=0;int maxseat=10;int screen=0;int maxscreen=2;
//		start:
//			while(screen<maxscreen) {
//				screen++;
//				System.out.println("screen "+" "+screen);
//				seat=1;
//				while(seat<maxseat) {
//					if((seat==4 || seat==5) && screen==2) {
//						System.out.println("seats 4 & 5 is reserved");
//						continue start;
//					}
//					else {
//						System.out.println("seat number booked: "+ seat);
//						seat++;
//					}
//			     }
//					
//				
//				System.out.println("all seats filled in screen");
//			}
		
     
//     int n=0;
//     
//     int result=1;
//    		 while(true) {
//    			 ++n;
//    			 if(n%2==0) {
//    				 continue;
//    			 }
//    			 else if(n%5==0) {
//    				 break;
//    			 }
//    			 result*=3;
//    		 }
//    		 System.out.print(result);
//     
//     
//	}
//	do {
//		System.out.print("df");
//		do {
//			System.out.print("df");
//		}while(false);
//	}while(false);
	
	sc.close();
    
	}
	
}
