package com.controlflow_assignment;

import java.util.Scanner;

public class Medium3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("enter the number of pages");
		int page = sc.nextInt();
		sc.nextLine();
		String work = sc.nextLine();
		if (work.equalsIgnoreCase("TYPING")) {
			System.out.print(3 * page);
		} else if (work.equalsIgnoreCase("copying")) {
			System.out.print(3 * page - 2);
		}
		sc.close();
	}
}
