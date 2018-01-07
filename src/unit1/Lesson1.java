package unit1;

/* Variables */
public class Lesson1 {

	public static void main(String[] args) {
		// variables can only have letters, numbers, _
		// cannot start with a number
		int num = 89;
//      ^- type of the variable
		
		// the = symbol assigns an value on the right side to the variable on the left side
		
		// a variable can be:
		// byte, short, int, long store integers
		// float and double store decimals
		// boolean stores either true or false
		// char stores a single character
		// String stores a string (words, sentences)
		
		byte b = 12; // 0 - 10
		short d = 2121; // 0-2^16
		int c = 120302;
		long e = 12312312312312l; // l makes it a long
		float a = 2.0f; // f makes it a float
		double lol = 1.4;
		boolean f = true;
		char g = 'g';
		String h = "ernsteianrsoeitnaeirostneoianrst";
		// integers default to int, decimals default to double 
		
		// why does the following not work?
		// double b = "f";
		// int 1bb = 21;
		// byte c = 22222222222;
		// float g = 2;
		// boolean d = truth;
		
		
		h = "heello";
		h = "foo"; // another way of making a string (we will learn about objects later)
		String noob = h + "led me";
		// what is noob?
		System.out.println(noob);
	}

}
