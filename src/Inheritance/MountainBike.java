package Inheritance;


//derived class
public class MountainBike extends Bicycle {
	
	//this subclass adds one more field
	
	public int seatHeight;
	
	//this subclass has one constructor
	
	public MountainBike(int gear, int speed, int startHeight) {
		
		//invoking base class constructor
		super(gear, speed);
		seatHeight = startHeight;
	}
	
	//this subclass adds one more method
	 public void setHeight(int newValue) {
		 seatHeight = newValue;
	 }
	  /* overriding toString() method
	   * in order to print
	   * more information
	   */
	 
	 public String toString() {
		 return(super.toString() + "\nseat height is: "+ seatHeight);
	 }

}
