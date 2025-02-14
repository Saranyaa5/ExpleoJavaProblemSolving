package com.io_streams;

import java.io.*;

public class ByteIoStreamClass {
    public static void main(String[] args) {
        byte[] b = new byte[128]; 
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\saran\\eclipse-workspace1\\Expleo_java\\src\\input.txt");
            FileOutputStream fos = new FileOutputStream("C:\\Users\\saran\\eclipse-workspace1\\Expleo_java\\src\\output.txt");

            System.out.println("Bytes available: " + fis.available());
            
            int count = 0;
            int read;
            
            while ((read = fis.read(b)) != -1) { 
                fos.write(b, 0, read); 
                count += read;
            }
            
            System.out.println("Total bytes copied: " + count);
            
            fis.close();
            fos.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
