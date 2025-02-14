package com.io_streams;
import java.io.FileInputStream;
public class FileInputStream1 {
public static void main(String []args) {
	try {
		FileInputStream input=new FileInputStream("C:\\Users\\saran\\eclipse-workspace1\\Expleo_java\\src\\input.txt");
		System.out.println(input.available());
		System.out.println("Data is the file: ");
		int i=input.read();
		//System.out.println(input.available());
		while(i!=-1) {
			//System.out.println(input.available());
			System.out.print((char)i);
			i=input.read();
		}
		input.close();
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
