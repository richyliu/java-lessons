package unit2;

import java.util.Scanner;

/*
 * Continue functions: good program design
 * (start taking notes!)
 */

// first, go over homework (geometric series sum and reading questions)
public class Lesson3 {
	
	// (type along)
	// programs need to be designed in a certain way, like you write essays in a particular format
	
	// all programs need to have a goal (i.e. what the program is trying to do/accomplish)
	
	// this program's goal is to calculate the nth fibonacci number
	
	// we will go through designing and writing a simple program together, then you will write one in class
	
	
	/*
	 * Testing plan:
	 * Should print 5 when user enters 6 (0,1,1,2,3,5)
	 * Should print 13 when user enters 8 (0,1,1,2,3,5,8,13)
	 * Should print error when user enters -1 (or any other number less than 1)
	 */
	public static void main(String[] args) {
		// all programs that require user input need 3 things: prompt, testing plan, and input validation
		// declare all variables at the top (recap: declare vs initialize)
		Scanner reader = new Scanner(System.in);
		int input = 0;
		int output = 0;
		
		// prompt the user for input
		System.out.println("Welcome to fibonacci number calculator!");
		System.out.print("Number of term to calculate: ");
		
		// get the user input
		input = reader.nextInt();
		
		// check the input is valid
		if (input < 1) {
			System.out.println("Cannout calculate a fibonacci term less than one!");
		} else {
			
			// call calculate
			output = calculate(input);
			
			System.out.printf("The %dth fibonacci number is %d", input, output);
			
			// always close the Scanner (prevents a *resource leak*)
			reader.close();
			
			// notice how i'm putting a lot of comments!
		}
	}
	
	// functions should have meaningful names and variable names
	public static int calculate(int nth) {
		// by definition, first and second fibonacci numbers are 0 and 1 
		if (nth == 1)
			return 0;
		else if (nth == 2)
			return 1;
		// otherwise it is the previous 2 fibonacci added together
		else return calculate(nth-1) + calculate(nth-2);
	}
}


// ok, now write your own program (start to finish!)
// goal: calculate the law of cosines for side c given sides a, b, and angle C
// (if we have extra time: allow the user to have other unknown variables besides side c)