package unit1;

public class Lesson5 {
	
	public static void main(String[] args) {
		/* review */
		
		/* data types */
		
		// 1. What are the 9 primitive data types?
		// Hint: 4 store whole numbers, 2 store decimals
		
		// 2. Declare variables:
		//   a. int called age
		int age;
		//   b. float called amount
		float amount;
		//   c. String called name
		String name;
		
		// 3. What can variable names start with? What can they not start with?
		
		// 4. How do you print something?
		System.out.print("meme");
		
		
		/* math/operators/random */
		
		// 5. How do you do addition, subtraction, multiplication, and division?
		//   a. What is the order of operations?
		
		// 6. What is modulus? (a.k.a mod)
		
		// 7. How do you add 1 to a variable (or subtract 1)
		int num = 0;
		num = num + 1;
		num++;
		num--;
		
		// 8. What is casting? (change one dt to another)
		(int)5.7
		(double)5
		(String)'a'
		(int)true //? not sure
		
		// 9. What is concatenation? Show an example.
		String too = "much";
		String much = "too";
		String together = much + too
		
		// 10. Calculate 5/2
		// default types int, double
		// largest data type: the dt that will be the results
		System.out.println(5.0/2);
		
		// 11. Booleans can only be ____ or ____
		
		// 12. What are ==, !=, &&, ||, and !
		
		// 13. What is !(true || true) && (!true || (true != false))
		false && (false || true)
		false && true
		false
		
		// 14. How do you create a random number between 1 and 100 (inclusive)?
		// Hint: (Math.______() * __ + __)
		(int)(Math.random() * 99 + 1)
		
		
		/* if statements */
		
		// 15. How do you write an if statement?
		if (3>5) {
			s.o.pln()
		}
		
		if (condition) {
			// this code is called
		}
		
		// 16. What is else?
		if (bool) {
			// code 1
		} else {
			// code 2
		}
		
		// 17. What is else if?
		if (condition) {
			nekjk
		
		// always put parenthese and {} (brackets) for an if statement
		} else if (condition2) {
			
		// else is always last
		} else {
			
		}
		
		
		/* loops */
		
		// 18. Fill in the blanks:
		//   a.
		// for (declartion; condition; incrementation)
		for (int i = 0; i < 100; i++) {
			// type here
		}
		
		
		// 19. What is a while loop?
		while(condtion) {
			// runs
		}
		
		int i = 0;
		while(i < 100) {
			i++;
		}
		

		/* functions */
		
		// 20. What are functions?
		// group code into blocks/scopes for later usage
		// a lot like math functions: f(x) = 2x
		
		// 21. What are parameters?
		// x is a parameter
		
		// 22. What are return values?
		
		// call a function: f(23) -> 46
		
		// 23. What is a header?
		// 	public void thicc() {
		
		// 24. Write a function header called eat that takes in a String food and a
		//     number amount, and returns a double 
		
		
		/* scanner */
		
		// 25. Declare and initialize a Scanner
		Scanner name = new Scanner(System.in);
		String foo = new String("");
		
		// 26. Get a String from the user
		
		// 27. What is a prompt (for getting input)?


		/* Strings */

		// 28. How do you make a string?

		// 29. How are char and string different?


		// 30. Write a program to convert inches to feet
		//     It should accept input from the user and print the conversion in feet
		//     Make sure to check for invalid input (negative numbers)
		//
		//     Example output:
		//     Enter a number of inches to convert to feet: 23.4
		//     That is 1.95 feet!
		//
		//     Enter a number of inches to convert to feet: -12
		//     Error! Inches can not be negative!
	}
	
	public void thicc() {
		asj;ldkfja;lskdjf
		asdfjl'asjdflkjasd
		fas
		fasdfasdf
		asdfjlfa
		sdf
	}
	
	thicc()
	
}






{
	int num = 0;
	{
		// i can access num
		int foo = 0;
	}
	// i can't access foo
	{
		// i can access num
		// i can't access foo
	}
}