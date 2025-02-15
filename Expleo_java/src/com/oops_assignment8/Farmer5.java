package com.oops_assignment8;
class Crop {
 private char type;
 private int quantity;
 public Crop(char type, int quantity) {
     this.type = type;
     this.quantity = quantity;
 }
 public void display() {
     System.out.println(type + " " + quantity);
 }
}
public class Farmer5{
 public static void main(String[] args) {
     Crop carrot = new Crop('C', 15);
     Crop potato = new Crop('P', 25);
     Crop brinjal = new Crop('B', 30);
     carrot.display();
     potato.display();
     brinjal.display();
 }
}
