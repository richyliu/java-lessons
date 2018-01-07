package unit1;

import java.util.Scanner;

/*
 * scanner methods
 * for loop
 * while loop
 * do while loop
 * functions
 */

public class Lesson3_DK {

	public static void main(String[] args) {
		// functions
		print("Hello");
/* name -^    ^- parameters*/
		
		int a = 0;
		print("a: " + a);
		a = addPlusOne(2, 3);
		print("a: " + a);
		// try it yourself!
		
		
		// creates a variable to get the keyboard input
		Scanner input = new Scanner(System.in);
		int num = 0;
		// generates a random number
		int correct = generateRandom();
		
		// while the guess is incorrect, run this block of code
		while(num != correct) {
			System.out.print("Enter a number: ");
			// Next integer is assaigned to num
			num = input.nextInt();
			
			// If num > correct the function will print too high!
			if (num > correct) {
				System.out.println("Too high!");
			// otherwise it prints Too low!
			} else if (num < correct) {
				System.out.println("Too low!");
			}
		}
		System.out.println("You guessed the number!");
		
		input.close();
		
	}
	
	
	// generates a random number between 1 and 100
	public static int generateRandom() {
		return (int)(Math.random() * 100 + 1);
	}
	
	
	
	public static int addPlusOne(int a, int b) {
		return a + b + 1;
	}
	
	
	public static void print(String text) {
		System.out.println(text);
	}

}
