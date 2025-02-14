package com.io_streams;
import java.io.FileOutputStream;
public class FileOut {
	public static void main(String []args) {
			String data="Welcome to Java Portal!!!Have a Happy Learning";
		try {
			FileOutputStream output=new FileOutputStream("C:\\Users\\saran\\eclipse-workspace1\\Expleo_java\\src\\input.txt");
			byte[] array=data.getBytes();
			output.write(array);
			output.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
