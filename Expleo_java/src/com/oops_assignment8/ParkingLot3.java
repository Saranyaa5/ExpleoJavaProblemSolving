package com.oops_assignment8;

import java.util.Scanner;

class ParkingLot3 {
    private int totalVehicles;
    private double totalCash;

    public ParkingLot3() {
        totalVehicles = 0;
        totalCash = 0.0;
    }

    public void payingVehicle() {
        totalVehicles++;
        totalCash += 0.50;
    }

    public void nopayVehicle() {
        totalVehicles++;
    }

    public void display() {
        System.out.println("\nParking Lot Summary");
        System.out.println("Total Vehicles: " + totalVehicles);
        System.out.println("Total Cash Collected: ₹" + totalCash);
    }

    public static void main(String[] args) {
        ParkingLot3 lot = new ParkingLot3();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Select an option:");
            System.out.println("1. Paying Vehicle");
            System.out.println("2. Non-Paying Vehicle");
            System.out.println("3. Exit and Display Summary");
            System.out.print("Enter your choice: ");
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number (1, 2, or 3).");
                sc.next();
            }
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    lot.payingVehicle();
                    System.out.println("Paying vehicle added.");
                    break;
                case 2:
                    lot.nopayVehicle();
                    System.out.println("Non-paying vehicle added.");
                    break;
                case 3:
                    lot.display();
                    break;
                default:
                    System.out.println("Invalid choice! Please enter 1, 2, or 3.");
            }
        } while (choice != 3);

        sc.close();
    }
}
