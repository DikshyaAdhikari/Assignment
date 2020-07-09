package Assignment2;

public class WrappingUnwrapping {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		//byte data type
		byte a =1;
		
		//wrapping around byte object

		Byte byteobj = new Byte(a);
		
		//int data type
		int b =10;
		
		//wrapping around Integer object
		Integer intobj = new Integer(b);
		
		//float data type
		float c = 18.6f;
		
		Float floatobj = new Float(c);
		
		//double datatype
		double d =250.5;
		
		//wrapping around double object
		Double doubleobj = new Double(d);
		
		//char data type
		char e = 'a';
		
		//wrapping around Character object
		Character charobj = e;
		
		//printing the values from objects
		System.out.println("Here we are printing the values of wrapper objects: ");
		System.out.println("Byte object byteobj: "+ byteobj);
		System.out.println("Integer object intobj: "+ intobj);
		System.out.println("Float object floatobj: "+ floatobj);
		System.out.println("Double object doubleobj: "+ doubleobj);
		System.out.println("Character object charobj"+charobj);
		
		/*
		 * retrieving datatypes from objects
		 * unwrapping objects to primitive data types
		 */
		
		byte bv = byteobj;
		int iv = intobj;
		float fv = floatobj;
		double dv = doubleobj;
		char cv = charobj;
		
		//printing the values from datatypes
		System.out.println("Now we print it as data types");
		System.out.println("Byte value is: "+ bv);
		System.out.println("Integer value is: "+ iv);
		System.out.println("Float value is: "+ fv);
		System.out.println("Double value is: "+ dv);
		System.out.println("Character value is: "+cv);
		
		
	}

}
