package com.collections_learning;
import java.util.*;
class Address{
	private String name;
	private String Street;
	private String city;
	private String State;
	private String code;
	
	Address(String name,String Street,String city,String State,String code){
		this.name=name;
		this.Street=Street;
		this.city=city;
		this.State=State;
		this.code=code;
	}
	
	
}

public class CreatingCollectionOfTypeClass {
	public static void main(String [] args) {
    ArrayList<Address> a=new ArrayList<Address>();
    a.add(new Address("Josh","melbon","salem","tamil nadu","123"));
    a.add(new Address("minu","ny","erode","kl","456"));
    a.add(new Address("kavi","tricy","namakkal","tn","147"));
    a.add(new Address("sara","land","cbe","ka","742"));
    a.add(new Address("hema","ndlkd","chennai","banglore","536"));
    for(Address val: a) {
    	System.out.println(val);
    }
	}
	
}
