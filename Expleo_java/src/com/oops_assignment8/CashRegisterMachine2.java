package com.oops_assignment8;
class CashRegister {
 private int cashOnHand;
 public CashRegister() {
     this.cashOnHand = 100;
 }
 public CashRegister(int initialCash) {
     if (initialCash >= 0) {
         this.cashOnHand = initialCash;
     } else {
         System.out.println("Invalid cash amount! Setting default value to 100.");
         this.cashOnHand = 100;
     }
 }
 public int getCurrentBalance() {
     return cashOnHand;
 }
 public void acceptAmount(int amount) {
     if (amount > 0) {
         cashOnHand += amount;
         System.out.println("Amount accepted: ₹" + amount);
     } else {
         System.out.println("Invalid amount. Please enter a positive value.");
     }
 }
}
public class CashRegisterMachine2{
 public static void main(String[] args) {
     CashRegister register1 = new CashRegister();
     System.out.println("Initial Cash in Register1: ₹" + register1.getCurrentBalance());
     register1.acceptAmount(500);
     System.out.println("Updated Cash in Register1: ₹" + register1.getCurrentBalance());
     CashRegister register2 = new CashRegister(1000);
     System.out.println("\nInitial Cash in Register2: ₹" + register2.getCurrentBalance());
     register2.acceptAmount(200);
     System.out.println("Updated Cash in Register2: ₹" + register2.getCurrentBalance());
 }
}
