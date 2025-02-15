package com.oops_assignment_11;

class person{
	
    private String name;
	private String address;
	person(String name,String address){
		this.name=name;
		this.address=address;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	@Override
	public String toString() {
		return "Person[name="+name+",address="+address+"]";
	}
	
}
class Student extends person{
   String program;
   int year;
   double fee;
	
	
	Student(String name, String address,String program,int year,double fee) {
		super(name, address);
		this.program=program;
		this.year=year;
		this.fee=fee;
	}
	public String getProgram() {
		return program;
	}
	public void  setProgram(String program) {
		this.program=program;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year=year;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee=fee;
	}
	@Override
	public String toString() {
		return "Student[Person[name= "+getName()+", address= "+getAddress()+"], program= "+program+" year= "+year+" fee= "+fee+"]";
	}
	
}
class staff extends person{
	
	String School;
	double pay;
	
	staff(String name, String address,String School,double pay) {
		super(name, address);
		this.School=School;
		this.pay=pay;
	}
	
	public String getSchool() {
		return School;
	}
	public void  setSchool(String School) {
		this.School=School;
	}
	public double getFee() {
		return pay;
	}
	public void setFee(double pay) {
		this.pay=pay;
	}
	
	@Override
	public String toString() {
		return "Staff[Person[name "
				+ "= "+getName()+", address= "+getAddress()+"] , School= "+School+" , pay= "+pay+"]";
	}
	
}

public class NewClass1 {
	public static void main(String []args) {
		
	Student stu=new Student("saranya","vaikundam","cse", 2, 95000);
	staff stf=new staff("geetha", "salem","AKV", 30000);
	System.out.println(stu);
	System.out.println(stu.toString());
	System.out.println(stf.toString());
	}
}


