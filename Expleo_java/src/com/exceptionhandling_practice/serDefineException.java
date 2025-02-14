package com.exceptionhandling_practice;
class InvalidAgeException extends Exception{
	InvalidAgeException(String str){
		super(str);
	}
}
public class serDefineException {
	 public static void main(String[] args){
	        int age = 13;
	        try {
	           validate(age);
	        }
//	        catch(InvalidAgeException e) {
//	        	System.out.println(e);
//	        }
	        catch(Exception e) {
	        	System.out.println(e);
	        }
	        
	    }
	 public static void validate(int age ) throws InvalidAgeException{
		 if(age<18) {
			 throw new InvalidAgeException("invalid age");
		 }
		 else {
			 System.out.println("eligible age");
		 }
	 }
}
