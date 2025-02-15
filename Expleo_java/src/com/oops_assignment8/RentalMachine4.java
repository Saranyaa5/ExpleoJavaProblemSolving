package com.oops_assignment8;
import java.util.HashMap;
import java.util.Scanner;

class RentalMachine4{
    private HashMap<String, String> machineStatus;
    private HashMap<String, String> returnDate;
    public RentalMachine4() {
        machineStatus = new HashMap<>();
        returnDate = new HashMap<>();
        machineStatus.put("Excavator", "Available");
        machineStatus.put("Bulldozer", "Available");
        machineStatus.put("Crane", "Available");
        machineStatus.put("Loader", "Available");
    }

    public void drawMachine(String machineName) {
        if (machineStatus.containsKey(machineName)) {
            if (machineStatus.get(machineName).equals("Available")) {
                machineStatus.put(machineName, "Rented");
                returnDate.put(machineName, "In 7 days");
                System.out.println(machineName + " has been rented. Please return it in 7 days.");
            } else {
                System.out.println(machineName + " is not available for rent.");
            }
        } else {
            System.out.println("Machine not found!");
        }
    }
    public void returnMachine(String machineName) {
        if (machineStatus.containsKey(machineName) && machineStatus.get(machineName).equals("Rented")) {
            machineStatus.put(machineName, "Available");
            returnDate.remove(machineName);
            System.out.println(machineName + " has been returned successfully.");
        } else {
            System.out.println("Machine is either not rented or does not exist.");
        }
    }

    public void checkStatus(String machineName) {
        if (machineStatus.containsKey(machineName)) {
            String status = machineStatus.get(machineName);
            String date = returnDate.getOrDefault(machineName, "Not rented");
            System.out.println("Status of " + machineName + ": " + status + " | Return Date: " + date);
        } else {
            System.out.println("Machine not found!");
        }
    }

    public void reserveMachine(String machineName) {
        if (machineStatus.containsKey(machineName) && machineStatus.get(machineName).equals("Available")) {
            machineStatus.put(machineName, "Reserved");
            System.out.println(machineName + " has been reserved.");
        } else {
            System.out.println(machineName + " is not available for reservation.");
        }
    }

    public void displayMachines() {
        System.out.println("\nAvailable Machines in Rental Shop:");
        for (String machine : machineStatus.keySet()) {
            System.out.println(machine + " - " + machineStatus.get(machine));
        }
    }

    public static void main(String[] args) {
        RentalMachine4 shop = new RentalMachine4();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Construction Machine Rental System");
            System.out.println("1. Rent a Machine");
            System.out.println("2. Return a Machine");
            System.out.println("3. Check Machine Status");
            System.out.println("4. Reserve a Machine");
            System.out.println("5. Show Available Machines");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            while (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number (1-6).");
                sc.next();
            }
            choice = sc.nextInt();
            sc.nextLine(); 
            switch (choice) {
                case 1:
                    System.out.print("Enter machine name to rent: ");
                    String rentMachine = sc.nextLine();
                    shop.drawMachine(rentMachine);
                    break;
                case 2:
                    System.out.print("Enter machine name to return: ");
                    String returnMachine = sc.nextLine();
                    shop.returnMachine(returnMachine);
                    break;
                case 3:
                    System.out.print("Enter machine name to check status: ");
                    String checkMachine = sc.nextLine();
                    shop.checkStatus(checkMachine);
                    break;
                case 4:
                    System.out.print("Enter machine name to reserve: ");
                    String reserveMachine = sc.nextLine();
                    shop.reserveMachine(reserveMachine);
                    break;
                case 5:
                    shop.displayMachines();
                    break;
                case 6:
                    System.out.println("Exiting Rental System");
                    break;
                default:
                    System.out.println("Invalid choice! Please select between 1-6.");
            }
        } while (choice != 6);

        sc.close();
    }
}

