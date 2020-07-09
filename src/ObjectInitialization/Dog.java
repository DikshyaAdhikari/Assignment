package ObjectInitialization;

//class declaration
public class Dog {
	
	//Instance variables
	String name;
	String breed;
	int age;
	String color;
	
	//Constructor Declaration of class
	
	public Dog(String name, String breed, int age, String color) {
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.color = color;
	}
	
	//method 1
	public String getName() {
		return name;
	}
	
	//method 2
	public String getBreed() {
		return breed;
	}
	
	//method 3
	public int getAge() {
		return age;
	}
	
	//method 4
	public String getColor() {
		return color;
	}
	
	//override
	public String toString() {
		return ("Hi my name is "+ this.getName() + "\n My breed is " + this.getBreed() + "\n My age and color is  " + this.getAge() + ","+ this.getColor() );
		
		
	}
	
	public static void main(String[] args) {
		Dog tuffy = new Dog("tuffy", "papillon", 7, "white");
		System.out.println(tuffy.toString());
		
	}

}
