package unit1;

import java.util.Scanner;

public class Lesson4 {
	
	public static void main(String[] args) {
		// Scanner
		
		Scanner reader = new Scanner(System.in);
		String name = "";
		int num1 = 0;
		int num2 = 0;
		double num3 = 0;
		
		System.out.print("What is your name? ");
		name = reader.nextLine();
		
		System.out.print("Type in the first number: ");
		num1 = reader.nextInt();
		
		System.out.print("Type in the second number: ");
		num2 = reader.nextInt();
		
		System.out.print("Type in the third number: ");
		num3 = reader.nextDouble();
		
		System.out.printf("The sum of the three numbers is: %f, the average is: %f", num1+num2+num3, (num1+num2+num3)/3);
		
		
		// fill in the blanks
//		boolean exit = /*???*/;
//		int total = 0;
//		int /*???*/ = 0;
//		
//		while(!exit) {
//			System.out./*???*/("Enter an integer (type -1 to exit): ");
//			number = reader./*???*/();
//			total = /*???*/ + number;
//			
//			System.out.println("The total is: " + /*???*/);
//			
//			if (number == /*???*/) {
//				exit = true;
//			}
//		}
		
		reader.close();
		
		
		/*
		 * guess the number game
		 * - the player is given one hint (even/odd number)
		 * - the player has to guess the number within 8 tries
		 * 
		 * example output:
		 * 
		 * Welcome to Guess the Number!
		 * The number is odd and between 1 and 100
		 * Enter guess number 1: 50
		 * Too high!
		 * Enter guess number 2: 25
		 * Too high!
		 * Enter guess number 3: 12
		 * Too low!
		 * Enter guess number 4: 18
		 * Too low!
		 * Enter guess number 5: 21
		 * Too high!
		 * Enter guess number 6: 20
		 * Too high!
		 * Enter guess number 7: 19
		 * You guessed it!
		 * 
		 * 
		 * Welcome to Guess the Number!
		 * The number is odd and between 1 and 100
		 * Enter guess number 1: 1
		 * Too low!
		 * Enter guess number 2: 2
		 * Too low!
		 * Enter guess number 3: 3
		 * Too low!
		 * Enter guess number 4: 4
		 * Too low!
		 * Enter guess number 5: 5
		 * Too low!
		 * Enter guess number 6: 6
		 * Too low!
		 * Enter guess number 7: 7
		 * Too low!
		 * Enter guess number 8: 8
		 * Too low!
		 * You ran out of guesses! The number was 47
		 */
	}
	
}
