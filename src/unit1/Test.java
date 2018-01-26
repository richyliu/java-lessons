package unit1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		/**
		 * This is the Unit 1 test. There are 20 multiple choice problems each
		 * worth 1 point, 10 fill in the blanks each worth 1 point, 5 true/
		 * false problems each worth 1 point, 5 short answers each worth 4
		 * points, and 1 paragraph answer worth 5 points.
		 * 
		 * You may Google an answer at any point in the test. However, you
		 * need to mark any question that you Googled with a '#' (shift-3).
		 * 
		 * You have 50 minutes for this exam. Once you are finished, you will
		 * do a typing test to test your typing speed. Good luck.
		 */
		
		
		/* Multiple choice */
		// 1. What are the four primitive data types for whole numbers?
		//   A. int,small,long,double B. byte,short,long,float C. int,short,long,byte D. byte,short,integer,long
		// 2. Order the data types from SMALLEST to LARGEST
		//   A. long,int,small,byte B. byte,short,int,long  C. byte,int,short,long D. short,byte,int,long 
		// 3. What are the 2 data types for decimals?
		//   A. double,boat B. float,double C. short,float D. int,byte  
		// 4. What is the default data type for a whole number (i.e. 5, -3, or 3344)?
		//   A. byte B. int C. short D. long
		// 5. What can variable names NOT start with?
		//   A. _ (underscore) B. A-Z (letters) C. 0-9 (numbers) D. a-z (lowercase letters)  
		// 6. What data type stores a letter?
		//   A. boolean B. char C. letter D. let  
		// 7. What is wrong with this statement: boolean 2BeOrNot2Be = true
		//   I. No semicolon    				II. Variable names cannot have uppercase letters
		//   III. boolean is not a data type	IV. Variable names cannot start with a number
		//   A. I,III B. I,II,IV C. I,IV D. III,IV 
		// 8. What operator gets the remainder of a division?
		//   A. % B. / C. // D. mod  
		// 9. How do you divide 2 numbers to get a decimal?
		//   A. 2/9 B. (int)2/9 C. (double)2/9 D. (double 2)/9 
		// 10. How do you increment (add one) a variable counter by one?
		//   A. counter addOne; B. counter++; C. counter 1; D. counter+; 
		// 11. How do you cast an integer age to a float?
		//   A. (int->float)age B. (float age) C. age = float D. (float)age  
		// 12. Which operator will be true if both inputs (x and y) are true?
		//   A. || B. && C. AND D. :(  
		// 13. What is !x?
		//   A. Not x B. x C. x + 1 D. factorial of x  
		// 14. How do you check for equality?
		//   A. x == y B. x = y C. x ===== y D. x equals y  
		// 15. In the following code, how many times will each segment be ran?
		//   if (a) {
		//   	segment 1
		//	 } else if (b) {
		// 		segment 2
		// 	 } else {
		//   	segment 3
		// 	 }
		//   A. 1 B. 3 C. 0 D. None of the above 
		// 16. In the code: if (a) {}, what does a have to be?
		//   A. boolean B. double C. int D. String  
		// 17. What are Scanners and Strings?
		//   A. objects B. alliteration C. ur mum D. shoe buckles  
		// 18. What is this following statement describing: separation of code into several levels, in which the innermost
		//     level can view the variables outside, but the outermost level cannot view the variables inside
		//   A. chucks B. blocks C. sticks D. variables  
		// 19. What are functions?
		//   A. A way to group code into reusable chunks B. A way to do math calculations C. Rhymes with destruction D. A way to write code without actually writing code 
		// 20. I will give this one to you for free 
		//   A. Choose C B. Not this one C. Pick me! D. Why are you still reading this  

		/* Fill in the blanks */
		
		Scanner /*  */ = new Scanner(System.in);
		int start = 0;
		int /**/ = 0;
		
		System.out.println("Welcome to sequence generator!");
		/**/.out.print("Enter the starting number: ");
		start = reader./**/();
		System./**/.print("Enter the step: ");
		step = reader.nextInt();
		
		if (/**/ < 0 || step < 0) {
			System.out.println("Invalid input!");
		} /**/ {
			for (int /**/ = 0; i < 10; i/**/) {
				System.out.print(start + i * /**/);
				System.out.println(", ");
			}
		}
		

		/* True/false */
		// 1. Class is short for classical
		// 2. Parentheses are needed to call functions
		// 3. Java files run starting from the main method
		// 4. A while loop never exits
		// 5. It is impossible to create functions
		

		/* Short answer */
		// 1. How do you create a Scanner? 
		// 2. Write the following code: if a and b are true or c is false, print "yes" 
		// 3. How do you generate a number between 5 and 10 (inclusive)?
		// 4. Write the header for a function called subtract that has two ints called a and b as parameters and returns an int
		// 5. Write a printf statement that will format the following: "2 plus 3 is 5" if 2 is a, 3 is b, and 5 is c 
		

		/* Paragraph answer */
		// Compare and contrast for and while loops. Consider syntax (how they are written), when they should be used, and how they are related to each other. You may write in bullet points.
	}

}
