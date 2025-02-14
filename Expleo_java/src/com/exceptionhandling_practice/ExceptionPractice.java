package com.exceptionhandling_practice;
class LowBalanceException extends Exception {
    LowBalanceException(String str) {
        super(str);
    }
}
class NilBalanceException extends Exception{
	NilBalanceException(String str){
		super(str);
	}
}
public class ExceptionPractice {
    public static void main(String[] args){
        int balance = 5;
        try {
            checkBalance(balance);
        }
        catch(NilBalanceException e) {
        	System.out.println(e);
        }
        catch(LowBalanceException e) {
        	System.out.println(e);
        }
        
    }
    public static void checkBalance(int balance) throws LowBalanceException,NilBalanceException {
    	if(balance<=0) {
    		throw new NilBalanceException("Nil balance exception occurred");
    	}
    	else if (balance <= 5) {
            throw new LowBalanceException("low balance exception occurred");
        } else {
            System.out.println("Sufficient balance.");
        }
    }
}
