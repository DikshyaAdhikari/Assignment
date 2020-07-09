package Polymorphism;

public class Maths {
	public int Add(int num1, int num2) {
		return num1 + num2;
		
	}
	
	public int Add(int num1, int num2, int num3) {
		return num1+ num2+ num3;
		
	}
	public String Add(String s1, String s2 ) {
		return s1+s2;
	}
public static void main(String[] args) {
	Maths m1 = new Maths();
	int sum = m1.Add(2, 3);
	System.out.println(sum);
	sum = m1.Add(3,5,6);
	System.out.println(sum);
	String str = m1.Add("Dikshya ", "Adhikari");
	System.out.println(str);
	
	
}
}