package com.io_streams;

import java.io.*;

public class BufferedStream2 {
	public static void main(String[] args) {
		//accepting the different types of input(integer,float,double,,shorrt,long,byte,char,string,boolean)from the keyboard
		try{
			Boolean bul=false;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("etner the string: ");
		String str=br.readLine();
		System.out.println("etner the Integer: ");
		int n=Integer.parseInt(br.readLine());
		System.out.println("etner the float: ");
		float fl=Float.parseFloat(br.readLine());
		System.out.println("etner the short: ");
		short sh=Short.parseShort(br.readLine());
		System.out.println("etner the double: ");
		double db=Double.parseDouble(br.readLine());
		System.out.println("etner the long: ");
		long log=Long.parseLong(br.readLine());
		System.out.println("etner the byte: ");
		byte bit=Byte.parseByte(br.readLine());
		System.out.println("etner the Characyter: ");
		char ch=(char)br.read();
		
		// displaying in the console
		System.out.println("entered values are: ");
		System.out.println("Integer values is: "+n);
		System.out.println("float values is: "+fl);
		System.out.println("short values is: "+sh);
		System.out.println("double values is: "+db);
		System.out.println("long values is: "+log);
		System.out.println("byte values is: "+bit);
		System.out.println("Character values is: "+ch);
		System.out.println("String values is: "+str);
		System.out.println("boolean values is: "+bul);
		
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
