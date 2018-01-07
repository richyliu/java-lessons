package unit1;

import java.util.Scanner;

/*
 * scanner methods
 * for loop
 * while loop
 * do while loop
 * functions
 */

public class Lesson3 {

	public static void main(String[] args) {
		// functions
		print("Hello");
/* name -^    ^- parameters*/
		
		int a = 0;
		System.out.println("a: " + a);
		a = addPlusOne(2, 3);
		System.out.println("a: " + a);
		// try it yourself!
		
		
		
		/*int input = -1;
		int correct = generateRandom();
		
		while(input != correct) {
			input = getInput();
			
			if (input > correct) {
				System.out.println("Too high!");
			} else if (input < correct) {
				System.out.println("Too low!");
			}
		}
		System.out.println("You guessed the number!");*/
		
	}
	
	
	public static int getInput() {
		Scanner input = new Scanner(System.in);
		int num = 0;
		
		System.out.println("Enter a number: ");
		num = input.nextInt();
		
		input.close();
		return num;
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
