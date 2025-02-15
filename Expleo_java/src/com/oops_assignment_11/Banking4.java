package com.oops_assignment_11;

import java.util.Scanner;

class Rbi {
    Customer c;
    Account a;

    Rbi(String name, String address, String accountid, double currentbalance) {
        c = new Customer(name, address);
        a = new Account(accountid, currentbalance);
    }

    public double GetInterestRate() {
        return 0.04;
    }

    public double GetWithdrawalLimit() {
        return 5000;
    }

    public double GetMinimumBalance() {
        return 500;
    }

    public double checkbalance() {
        return a.getbalance();
    }

    public void deposit(double amount) {
        a.setbalance(amount);
        System.out.println("Amount deposited successfully!");
    }

    public void withdraw(double withamt) {
        if (a.getbalance() - withamt >= GetMinimumBalance()) {
            if (withamt <= GetWithdrawalLimit()) {
                a.setbalance(-withamt);
                System.out.println("Withdrawal successful! Remaining balance: " + a.getbalance());
            } else {
                System.out.println("Withdrawal failed! Amount exceeds withdrawal limit.");
            }
        } else {
            System.out.println("Withdrawal failed! Insufficient balance to maintain minimum balance.");
        }
    }
}

class Customer {
    String name;
    String address;

    Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }
}

class Account {
    String accountid;
    double currentbalance;

    Account(String accountid, double currentbalance) {
        this.accountid = accountid;
        this.currentbalance = currentbalance;
    }

    public double getbalance() {
        return currentbalance;
    }

    public void setbalance(double amount) {
        currentbalance += amount;
    }
}

class Sbi extends Rbi {
    Sbi(String name, String address, String accountid, double currentbalance) {
        super(name, address, accountid, currentbalance);
    }

    @Override
    public double GetInterestRate() {
        return 0.07;
    }

    @Override
    public double GetMinimumBalance() {
        return 1000;
    }
}

class icici extends Rbi {
    icici(String name, String address, String accountid, double currentbalance) {
        super(name, address, accountid, currentbalance);
    }

    @Override
    public double GetInterestRate() {
        return 0.06;
    }

    @Override
    public double GetMinimumBalance() {
        return 1500;
    }
}

public class Banking4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the bank name (SBI/ICICI):");
        String bank = sc.nextLine();

        Rbi s; 

        if (bank.equalsIgnoreCase("sbi")) {
            s = new Sbi("Saranya", "Salem", "sbi356", 700);
        } else if (bank.equalsIgnoreCase("icici")) {
            s = new icici("Tharani", "Namakkal", "icici123", 600);
        } else {
            System.out.println("Invalid bank name. Exiting...");
            return;
        }

        System.out.println("\nEnter:\n1. Check Balance\n2. Deposit\n3. Withdraw\n4. Get Interest Rate\n5. Exit");
        int n = sc.nextInt();

        outer:
        while (n != 5) {
            switch (n) {
                case 1:
                    System.out.println("Balance in your " + bank.toUpperCase() + " account: " + s.checkbalance());
                    break;
                case 2:
                    System.out.println("Enter the amount to deposit: ");
                    double depamt = sc.nextDouble();
                    s.deposit(depamt);
                    break;
                case 3:
                    System.out.println("Enter the amount to withdraw: ");
                    double withamt = sc.nextDouble();
                    s.withdraw(withamt);
                    break;
                case 4:
                    System.out.printf("Interest amount for balance %.2f is %.2f\n",
                            s.checkbalance(), s.checkbalance() * s.GetInterestRate());
                    break;
                case 5:
                    break outer;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
            System.out.println("\nEnter:\n1. Check Balance\n2. Deposit\n3. Withdraw\n4. Get Interest Rate\n5. Exit");
            n = sc.nextInt();
        }
        sc.close();
    }
}

