package com.arrays_Assignment;

import java.util.Scanner;

public class DiceGmaeHard2 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		
		int arr1[]=new int[10];
		
		System.out.println("roll the dice for aruns turn(10): ");
		for(int i=0;i<10;i++) {
			arr1[i]=sc.nextInt();
		}
		
		int arr2[]=new int[10];
		
		System.out.println("roll the dice for aruns turn(10): ");
		for(int i=0;i<10;i++) {
			arr2[i]=sc.nextInt();
		}
		int player1=0,player2=0;
		for(int i=0;i<10;i++) {
			if(arr1[i]>arr2[i]) {
				player1++;
			}
			else if(arr1[i]<arr2[i]) {
				player2++;
			}
		}
		System.out.print(player1>player2 ? "Arun Wins!!":"Naveen Wins!!");
	sc.close();
	}
	
}
