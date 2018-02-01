package unit1;

/* Unit 1 test review */
public class Lesson1 {

	public static void main(String[] args) {
		// 2. Order the data types from SMALLEST to LARGEST
		//   A. long,int,small,byte B. byte,short,int,long  C. byte,int,short,long D. short,byte,int,long 
		
		// 7. What is wrong with this statement: boolean 2BeOrNot2Be = true
		//   I. No semicolon                    II. Variable names cannot have uppercase letters
		//   III. boolean is not a data type    IV. Variable names cannot start with a number
		//   A. I,III B. I,II,IV C. I,IV D. III,IV 
		
		// 10. How do you increment (add one) a variable counter by one?
		//   I. counter++;          II. counter 1;
		//   III. counter += 1;	    IV. counter+;
		//   A. I B. III,IV C. I,II D. I,III 
		
		// 17. What are Scanners and Strings?
		//   A. objects B. alliteration C. variables D. arrays
		
		/* Fill in the blanks */
		
		Scanner /*1*/ = new Scanner(System.in);
		int start = 0;
		int step = 0;
		
		System.out.println("Welcome to sequence generator!");
		System.out.print("Enter the starting number: ");
		start = reader./*4*/();
		System.out.print("Enter the step: ");
		step = reader.nextInt();
		
		if (start < 0 || step < 0) {
			System.out.println("Invalid input!");
		} else {
			for (int i = 0; i < 10; i/*9*/) {
				System.out.print(start + i * /*10*/);
				System.out.println(", ");
			}
		}
		
		
		// 5. It is impossible to create functions
		
		
		// 1. How do you create a Scanner? 
		
		// 2 *review
		
		// 3. How do you generate a number between 5 and 10 (inclusive)?
		
		// 4. Write the header for a function called subtract that has two ints called a and b as parameters and returns an int
		
		// 5. Write a printf statement that will format the following: "2 plus 3 is 5" if 2 is a, 3 is b, and 5 is c 
		
		
		// 5. Define and give an example of block
		
		
		// Compare and contrast for and while loops. Consider syntax (how they are written), when they should be used, and how they are related to each other. You may write in bullet points.
		
	}

}
