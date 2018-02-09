package unit1;

public class Lesson5 {
	
//	public static void main(String[] args) {
//		/* review */
//		
//		/* data types */
//		
//		// 1. What are the 9 primitive data types?
//		// Hint: 4 store whole numbers, 2 store decimals
//		// byte, short, int, long, float, double, chart, boolean, and String
//		
//		// 2. Declare variables:
//		//   a. int called age
//		int age;
//		//   b. float called amount
//		float amount;
//		//   c. String called name
//		String name;
//		
//		// 3. What can variable names start with? What can they not start with?
//		// all letters (upper and lowercase) and underscore(_). Not numbers
//		
//		// Note: variable namecannot be reserved keywords (like int, float, void, etc)
//		
//		// 4. How do you print something?
//		System.out.print("meme");
//		
//		
//		/* math/operators/random */
//		
//		// 5. How do you do addition, subtraction, multiplication, and division?
//		// +, -, *, /
//		//   a. What is the order of operations?
//		// PEMDAS: parentheses, multiplication/division/modulus, addition/subtraction
//		
//		// 6. What is modulus? (a.k.a mod)
//		// remainder from division (% symbol)
//		
//		// 7. How do you add 1 to a variable (or subtract 1)
//		int num = 0;
//		num = num + 1;
//		num++;
//		num--;
//		
//		// 8. What is casting?
//		// change from one data type to another
//		// possible castings:
//		// <any interger type> -> <any decimal type> and the other way aroudn
//		// char -> String
//		(int)5.7
//		(double)5
//		(String)'a'
//		
//		// 9. What is concatenation? Show an example.
//		// combining of 2 strings or a string and any other primitive data type
//		String too = "much";
//		String much = "too";
//		String together = much + too
//		
//		// 10. Calculate 5/2
//		// 5/2 returns int
//		// 5.0/2 returns double
//		// default type for integers is int, default data type for decimals is double
//		// the default type is the data type that a number will be (like 2 or 8.4 or -1)
//		// largest data type: the data type of the result
//		// order of data types in determining largest: <any integer type> -> <any decimal type> -> String 
//		System.out.println(5.0/2);
//		
//		// 11. Booleans can only be true or false
//		// beware! java is case sensitive
//		
//		// 12. What are ==, !=, &&, ||, and !
//		// equals, not equals, and, or, and not
//		
//		// 13. What is !(true || true) && (!true || (true != false))
//		false && (false || true)
//		false && true
//		false
//		
//		// 14. How do you create a random number between 1 and 100 (inclusive)?
//		// Hint: (Math.______() * __ + __)
//		(int)(Math.random() * 99 + 1)
//		
//		
//		/* if statements */
//		
//		// 15. How do you write an if statement?
//		if (3>5) {
//			s.o.pln()
//		}
//		
//		if (condition) {
//			// this code is called
//		}
//		
//		// 16. What is else?
//		// is executed when the if statement is false
//		if (bool) {
//			// code 1
//		} else {
//			// code 2
//		}
//		
//		// 17. What is else if?
//		// computer first checks the conditions in the if, then checks the conditions in the else if
//		// only one of the if/else if/else blocks of code will be executed
//		if (condition) {
//			nekjk
//		
//		// always put parenthese and {} (brackets) for an if statement
//		} else if (condition2) {
//			
//		// else is always last
//		} else {
//			
//		}
//		
//		
//		/* loops */
//		
//		// 18. Fill in the blanks:
//		// for (declartion; condition; incrementation)
//		for (int i = 0; i < 100; i++) {
//			// type here
//		}
//		
//		
//		// 19. What is a while loop?
//		// a while loop runs *while* a condition is true
//		while(condtion) {
//			// runs
//		}
//		
//		// same as the for loop above
//		int i = 0;
//		while(i < 100) {
//			i++;
//		}
//		
//
//		/* functions */
//		
//		// 20. What are functions?
//		// group code into blocks/scopes for later usage
//		// a lot like math functions: f(x) = 2x
//		
//		// 21. What are parameters?
//		// x is a parameter
//		
//		// 22. What are return values?
//		// what is being sent back to the function. in the above example, 2x is the return
//		
//		// call a function: f(23) -> 46
//		// giving a function values for its parameters
//		
//		// 23. What is a header?
//		// 	public void addTheNumbers(int a, int b) {
//		// general form:
//		// public <return type> <name>(<parameters...>) {
//		// return type is the data type of the value that is returned
//		
//		// 24. Write a function header called eat that takes in a String food and a
//		//     number amount, and returns a double
//		// public double eat(String food, int amount) {
//		
//		
//		/* scanner */
//		
//		// 25. Declare and initialize a Scanner
//		Scanner name = new Scanner(System.in);
//		String foo = new String("");
//		
//		// 26. Get a String from the user
//		// foo = name.next();
//		
//		// 27. What is a prompt (for getting input)?
//		// printing a statement asking the user to give input
//		// ex: Enter a number: 
//
//
//		/* Strings */
//
//		// 28. How do you make a string?
//		// String <name> = new String("<whatever you want to write>")
//		// OR (shorthand method)
//		// String <name> = "<whatever you want to write>"
//
//		// 29. How are char and string different?
//		// char can only store one character, while String can store many characters
//
//
//		// 30. Write a program to convert inches to feet
//		//     It should accept input from the user and print the conversion in feet
//		//     Make sure to check for invalid input (negative numbers)
//		//
//		//     Example output:
//		//     Enter a number of inches to convert to feet: 23.4
//		//     That is 1.95 feet!
//		//
//		//     Enter a number of inches to convert to feet: -12
//		//     Error! Inches can not be negative!
//		Scanner reader = new Scanner(System.in);
//		double inches = 0;
//		double feet = 0;
//		
//		while(true) {
//			System.out.print("Enter a number of inches to convert to feet: ");
//			inches = reader.nextInt();
//			
//			feet = inches/12;
//			if (inches >= 0) {
//				System.out.println("That is " + feet + " feet!");
//			} else {
//				System.out.println("Error! Inches cannot be negative!");
//			}
//		}
//		
//		
//		// 30.5. What is main?
//		// main, or public static void main(String[] args){, is the first and only function
//		// the computer calls when you run your code
//		
//		// 31. What are scopes?
//		// Scopes are a way of group code together. Brackets {} indicated a new scope, as
//		// well as an additional indent. Code inside the scope can use variables and function
//		// outside the scope, but code outside can't use the variables inside. This a way to
//		// hide, or separate, code within a program.
//		
//		// 32. What is camel case?
//		// whenYouWriteLikeThisAndCapitalizeTheFirstLetterOfEachWord
//		
//		// 33. Where do I put semicolons?
//		// you put semicolons at the end of every line except when there is are brackets {}
//		
//		// 34. What types of questions will be on the test?
//		// Multiple choice, fill in the blanks programs, matching, true/false, and very few short answers
//	}
//	
//	public void thicc() {
//		asj;ldkfja;lskdjf
//		asdfjl'asjdflkjasd
//		fas
//		fasdfasdf
//		asdfjlfa
//		sdf
//	}
//	
//	thicc()
//	
}

/*



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
}*/