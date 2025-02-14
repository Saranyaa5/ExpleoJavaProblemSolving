package com.io_streams;

import java.io.IOException;
import java.io.*;
public class ByteIoStream2 {
	public static void main(String[] args) {
        char[] b = new char[128]; 
        try {
        	FileReader fr=new FileReader(args[0]);
        	FileWriter fw=new FileWriter(args[1]);
        
        	 int count = 0;
             int read=0;
             
             while ((read = fr.read(b,0,128)) != -1) { 
                 fw.write(b); 
                 count += read;
             }

             System.out.println("Total count: " + count);
             fr.close();
             fw.close();
         } catch (IOException e) {
             System.out.println("Error: " + e.getMessage());
         
        }
	}
}