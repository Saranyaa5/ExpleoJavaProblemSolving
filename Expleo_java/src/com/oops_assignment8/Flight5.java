package com.oops_assignment8;
import java.util.Scanner;

class Flight5{
    private int flightNumber;
    private String destination;
    private float distance;
    private float fuel;
    private void CALFUEL() {
        if (distance <= 1000) {
            fuel = 500;
        } else if (distance > 1000 && distance <= 2000) {
            fuel = 1100;
        } else {
            fuel = 2200;
        }
    }
    public void FEEDINFO() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Flight Number: ");
        flightNumber = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter Destination: ");
        destination = scanner.nextLine();
        System.out.print("Enter Distance: ");
        distance = scanner.nextFloat();
        CALFUEL();
    }
    public void SHOWINFO() {
        System.out.println("\nFlight Details:");
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Destination: " + destination);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Required Fuel: " + fuel + " liters");
    }
    public static void main(String[] args) {
        Flight5 flight = new Flight5();
        flight.FEEDINFO();
        flight.SHOWINFO();
    }
}

