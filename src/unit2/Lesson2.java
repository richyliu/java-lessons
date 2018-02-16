package unit2;

/* functions */

public class Lesson2 {

	public static void main(String[] args) {
		int number = 0;
		
		number = add(2, 3);
		System.out.println(number);
		
		print();
		
//		System.out.println(multiply(4, 3));
		
		
		String name = "richard";
//		System.out.println(printName(name));
		
		System.out.println(sigma(3, 2, 10));
	}
	
	
	// warm up: guess the function!
	// i will have a "black box" that you can give numbers to
	// i will tell you the numbers the "black box" spits out
	// you have to guess what the "black box" does
	
	// a lot like functions in math class
	// inputs -> process -> outputs
	
	// example: f(x) = 2x + 3
	// the above is a function
	// inputs 2 will give you an output of 2(2) + 3 = 4 + 3 = 7
	
	// java functions are very similar, except it can accept multiple inputs, and it doesn't need an output
	// for example:
	
	// this function has an input, or accepts parameters, of two ints, called a and b
	// a and b are named so that you can access the variables inside the function
	// an int is returned, or is the output
	public static int add(int a, int b) {
		// output of the function
		return a + b;
	}
	
	// sometimes a function can have no inputs and no outputs!
	public static void print() {
		System.out.println("Hello!");
	}
	
	
	// try it!
	// make a function called multiply that multiplies two numbers together
	
	// make a function called printName that print someone's name
	
	// make a function called sigma that adds together the values in a arithmetic series
	public static int sigma(int start, int step, int numTerms) {
		
		
		return 0;
	}
}
