package com.io_streams;
import java.io.*;

class Employee implements Serializable {
    private static final long serialVersionUID = 1L; // Add serialVersionUID
    public int empId;
    public String empName;

    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }
}

public class SerializationConcepts {
    public static void main(String[] args) {
        Employee object = new Employee(1, "Ram");
        String filename = "file.ser"; // automatically is created and  written in this
        //ser repsresent the serialized filw

        // Serialization(converting our object steam into the byte stream)
        try {
            // Saving object to file
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(object);
            out.close();
            file.close();
            System.out.println("Object has been serialized.");
        } catch (IOException e) {
            System.out.println("IOException is caught: " + e.getMessage());
        }

        Employee object1 = null;

        // Deserialization
        try {
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
            object1 = (Employee) in.readObject();
            in.close();
            file.close();
            System.out.println("Object has been deserialized.");
            System.out.println("Employee ID: " + object1.empId);
            System.out.println("Employee Name: " + object1.empName);
        } catch (IOException e) {
            System.out.println("IOException is caught: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException is caught: " + e.getMessage());
        }
    }
}
