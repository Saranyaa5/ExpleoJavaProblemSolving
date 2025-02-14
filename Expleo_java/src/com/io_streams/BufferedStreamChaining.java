package com.io_streams;

import java.io.*;

public class BufferedStreamChaining {
	public static void main(String[] args) {
		try {
			BufferedReader bufinput=new BufferedReader(new FileReader(args[0]));
		    BufferedWriter bufoutput=new BufferedWriter(new FileWriter(args[1]));
		    	String line="";
		    	while((line=bufinput.readLine())!=null) {
		    		bufoutput.write(line);
		    		bufoutput.newLine();
		    	}
		    	 bufoutput.close();
		    	 bufinput.close();
		    	System.out.println("File copied successfully!");
		    }
		
		catch(FileNotFoundException e) {
			System.out.println("file not found: "+ e);
			
		}
		catch(IOException e) {
			System.out.println("Exception: "+ e);
		}
	}
}
