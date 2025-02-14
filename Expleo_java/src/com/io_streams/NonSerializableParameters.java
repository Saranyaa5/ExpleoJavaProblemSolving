package com.io_streams;

import java.io.*;

class Employee1 implements Serializable {
    private static final long serialVersionUID = 1L; // Add serialVersionUID
    public int empId;
    public String empName;
    public transient int age;  // Will not be serialized
    public static int deptId;  // Will not be serialized (belongs to class, not instance)

    public Employee1(int empId, String empName, int age, int deptId) {
        this.empId = empId;
        this.empName = empName;
        this.age = age;
        Employee1.deptId = deptId; // Static variables belong to the class
    }
}

public class NonSerializableParameters {
    public static void main(String[] args) {
        Employee1 object = new Employee1(1, "Ram", 25, 101);
        String filename = "file.ser";

        // Serialization (writing object to file)
        try {
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(object);
            out.close();
            file.close();
            System.out.println("Object has been serialized.data before deserialization");
            printData(object); // Call method to print details
            Employee1.deptId = 2000; // Modify static variable
            object.age = 20; // Modify transient variable
        } catch (IOException e) {
            System.out.println("IOException is caught: " + e.getMessage());
        }

        // Reset deptId before deserialization to see if it restores from the file
       // Employee1.deptId = 999;

        Employee1 object1 = null;

        // Deserialization (reading object from file)
        try {
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
            object1 = (Employee1) in.readObject();
            in.close();
            file.close();

            System.out.println("\nObject has been deserialized.data after deseralization");
            printData(object1); // Print deserialized object data

        } catch (IOException e) {
            System.out.println("IOException is caught: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException is caught: " + e.getMessage());
        }
    }

    // Method to print object data
    public static void printData(Employee1 obj) {
        System.out.println("Employee ID: " + obj.empId);
        System.out.println("Employee Name: " + obj.empName);
        System.out.println("Age (transient, default value expected after deserialization): " + obj.age);
        System.out.println("Dept ID (static, retains latest value instead of serialized one): " + Employee1.deptId);
    }
}
//output of the above code
//Object has been serialized.data before deserialization
//Employee ID: 1
//Employee Name: Ram
//Age (transient, default value expected after deserialization): 25
//Dept ID (static, retains latest value instead of serialized one): 101
//
//Object has been deserialized.data after deseralization
//Employee ID: 1
//Employee Name: Ram
//Age (transient, default value expected after deserialization): 0
//Dept ID (static, retains latest value instead of serialized one): 2000