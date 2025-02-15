package com.oops_assignment_11;

abstract class Shape{
	protected  String color;
	protected boolean filled;
	public Shape() {
		
	}
	void draw() {
		System.out.println("draw");
	}
	public Shape(String color,boolean filled) {
		this.color=color;
		this.filled=filled;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public boolean getFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled=filled;
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();
	@Override
	public String toString() {
		
		return "Shape[color=" + color+" ,filled= "+filled+" ]";
		
	}
	
	
	
}
class Circle extends Shape{
    protected double radius;
    public Circle() {
    	
    }
    public Circle(double radius) {
    	this.radius=radius;
    }
	public Circle(double radius,String color, boolean filled) {
		super(color, filled);
		this.radius=radius;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius=radius;
	}

	@Override
	public double getArea() {
		
		return (3.14*(radius*radius));
	}

	@Override
	public double getPerimeter() {
		
		return (2*3.14*radius);
	}
	@Override
	public String toString() {
		
		return "Circle[Shape[color=" + color+" ,filled= "+filled+" ,radius= "+radius+" ]";
		
	}
}
class Rectangle extends Shape{
	protected double width;
	protected double length;
	
	public Rectangle() {
		
	}

	public Rectangle(double width,double length,String color, boolean filled) {
		super(color, filled);
		this.width=width;
		this.length=length;
	}
	public Rectangle(double width,double length) {
		this.width=width;
		this.length=length;
	}
    
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width=width;
	}
	public double getLength() {
		return width;
	}
	public void setLength(double length) {
		this.length=length;
	}
	
	@Override
	public double getArea() {
		
		return length*width;
	}

	@Override
	public double getPerimeter() {
		return 2*(length+width);
	}
	
	@Override
	public String toString() {
		
		return "Rectangle[Shape[color=" + color+" ,filled= "+filled+" ,width= "+width+" ,length= "+length+"  ]";
		
	}
	
}
class Square extends Rectangle{
	public double side;
	
	public Square() {
		
	}
	public Square(double side) {
		this.side=side;
	}

	public Square(double side, String color, boolean filled) {
		super(side,side,color, filled);
		
	}
	
	public double getSide() {
		return width;
	}
	public void setSide(double side) {
		this.side=side;
	}
	
	public void setWidth(double side) {
		this.side=side;
	}
	public void setLength(double side) {
		this.side=side;
	}
	@Override
    public String toString() {
		
		return "Square[Rectangle[Shape[color=" + color+" ,filled= "+filled+" ,width= "+width+" ,length= "+length+"  ]]";
		
	}	
}


public class AbsractShape3 {
 public static void main(String [] args) {
	 
	 Square s=new Square(5,"red",true);
	 System.out.println(s.toString());
	 
	 Rectangle r=new Rectangle(2,4,"blue",true);
	 System.out.println(r.toString());
	 
	 Circle c=new Circle(3,"green",false);
	 System.out.println(c.toString());
	 
 }
	
}

