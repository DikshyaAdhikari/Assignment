package Abstraction;

public class Test {
	public static void main(String[] args) {
		Shape s1 = new Circle("Blue" , 5.6);
		Shape s2 = new Rectangle("Red", 7, 9);
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		
		
	}

}
