package com.java_Core_Assignment;

public class SortNamesFirst3Char {
	public static void main(String[] args) {
        String[] names = {"Ashok", "Alok", "Akash", "Amit", "Amol", "Anil", "Ashish", "Anand"};
        for (int i = 0; i < names.length - 1; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].substring(0, 3).compareTo(names[j].substring(0, 3)) > 0) {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        System.out.println("sorted names: ");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
