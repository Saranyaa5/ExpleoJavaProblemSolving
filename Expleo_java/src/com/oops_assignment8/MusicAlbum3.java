package com.oops_assignment8;

class Singer {
 private String name;
 private String email;
 private char gender;
 public Singer(String name, String email, char gender) {
     this.name = name;
     this.email = email;
     this.gender = gender;
 }
 public String getName() {
     return name;
 }
 public String getEmail() {
     return email;
 }
 public char getGender() {
     return gender;
 }
}
class MusicAlbum {
 private String name;
 private Singer singer;
 private double price;
 private int qtyInStock;
 public MusicAlbum(String name, Singer singer, double price, int qtyInStock) {
     this.name = name;
     this.singer = singer;
     this.price = price;
     this.qtyInStock = qtyInStock;
 }
 public String getName() {
     return name;
 }
 public Singer getSinger() {
     return singer;
 }
 public double getPrice() {
     return price;
 }
 public int getQtyInStock() {
     return qtyInStock;
 }
 public void setPrice(double price) {
     this.price = price;
 }
 public void setQtyInStock(int qtyInStock) {
     this.qtyInStock = qtyInStock;
 }
}
public class MusicAlbum3{
 public static void main(String[] args) {
     Singer singer = new Singer("Arijit Singh", "arijit@example.com", 'm');
     MusicAlbum album = new MusicAlbum("Soulful Melodies", singer, 499.99, 50);
     System.out.println("Album Name: " + album.getName());
     System.out.println("Price: ₹" + album.getPrice());
     System.out.println("Quantity in Stock: " + album.getQtyInStock());
     Singer albumSinger = album.getSinger();
     System.out.println("\nSinger Details:");
     System.out.println("Name: " + albumSinger.getName());
     System.out.println("Email: " + albumSinger.getEmail());
     System.out.println("Gender: " + albumSinger.getGender());
 }
}
