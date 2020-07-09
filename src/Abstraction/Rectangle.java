package Abstraction;

class Rectangle extends Shape{
	
	double length;
	double width;
	
	public Rectangle (String color, double length, double width) {
		//calling shape constructor
		
		super(color);
		System.out.println("Rectangle constructor called");
		this.length = length;
		this.width = width;
	}
	
	//override
	double area(){
		return length*width;
	}
	
	//override
	public String toString() {
		return "Rectangle color is " + super.color + " and area is: " + area();
	}

}
