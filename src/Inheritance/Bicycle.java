package Inheritance;

//base class
public class Bicycle {
	 //this class has two fields
	public int gear;
	public int speed;
	
	//this class has one constructor
	
	public Bicycle(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}
	
	//this class has three methods
	
	public void applyBrake(int decrement) {
		speed -=decrement;
		
	}
	
	public void speedUp(int increment) {
		speed +=increment;
	}
	
	//toString() method to print the info of the Bicycle
	
	public String toString() {
		return("Number of gears are " + gear + "\n" + "speed of bycycle is "+ speed);	
		}

}
