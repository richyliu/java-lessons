package unit1;

/* Basic math and conditionals */
public class Lesson2 {
	
	public static void main(String[] args) {
		int a = 3;
		int b = 9;
		int c = 10;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
		/* basic maths */
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		System.out.println("a / b = " + (a / b)); // why doesn't this return 0.3333?
		System.out.println("(double)a / b = " + ((double)a / b));
		System.out.println("c % a = " + (c % a)); // remainder of c / a
		
		System.out.println("a = " + a);
		a++; // increment
		System.out.println("add 1: a = " + a);
		a--; // decrement
		System.out.println("subtract 1: a = " + a);
		
		// are operators
		// = is assignment; +=, -=, *=, /=, %= are compound assignment
		
		// skip this
		a += 2;
		System.out.println("add 2: a = " + a);
		a *= 3;
		System.out.println("multiply 3: = " + a);
		a %= 4;
		System.out.println("mod 4: a = " + a);
		
		/*
		 * Exercise:
		 * use one int, one double, and one string and compound assigment operators
		 * print "3.0food4444"
		 */
		
		
		/* casting */
		// (new_data_type)number
		// (int)d -> 2
		// (double)2 -> 2.0
		// 2/3 -> 0
		// (double)2 / 3 -> 0.666666
		double d = 2.0;
		System.out.println("d = " + d);
		int e = (int)d;
		System.out.println("(int)d = " + e);
		double f = 224;
		System.out.println("f = " + f);
		double g = (int)f;
		System.out.println("(int)f = " + g);
		
		/*
		 * Exercise:
		 * use one int a = 2
		 * use compound assigment & casting to turn a into 3.0
		 */
		
		
		
		/* booleans */
		boolean x = true;
		boolean y = false;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		// == compares equality and gives you a boolean
		// && is and
		// 4 + 5
		// true && false = false
		// || is or
		// true || false = true
		// ! is not
		// !true = false
		// !false = true
		// != compares inequality
		// 12 == 12
		// 13 != 12
		// > is greater than
		// < is less than
		// >= is greater than or equals to
		// <= is less than or equals to
		
		System.out.println("x && y = " + (x && y));
		System.out.println("x || y = " + (x || y));
		System.out.println("!x = " + !x);
		System.out.println("x == y = " + (x == y));
		System.out.println("x != y = " + (x != y));
		
		/*
		 * Exercise:
		 * without running code, what is
		 * !(true || false) && (!false && !(true == false))
		 * !(true) && (!false && !(false))
		 * false && (!false && true)
		 * false && (true && true)
		 * false && (true)
		 * false
		 */
		
		
		/* conditonals */
		a = 2;
		b = 5;
		c = 2;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
		System.out.println("a == b ???");
		if (a == b) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		
		
		boolean toBe = true;
		
		System.out.println("to be or not to be?");
		if (toBe || !toBe) {
			System.out.println("To be or not to be, that is the question");
		}
		
		System.out.println("what is a and b?");
		if (a == 1) {
			if (b == 0) {
				System.out.println("a is 1 and b is 0");				
			} else if (b == 5) {
				System.out.println("a is 1 and b is 5");
			}
		} else if (a == 2) {
			if (b == 0) {
				System.out.println("a is 2 and b is 0");				
			} else if (b == 5) {
				System.out.println("a is 2 and b is 5");
			}
		} else if (a == 3){
			if (b == 0) {
				System.out.println("a is 3 and b is 0");				
			} else if (b == 5) {
				System.out.println("a is 3 and b is 5");
			}
		}
		// ^^^^ bad code!!
		
		/*
		 * Exercise:
		 * given 1 <= a <= 3 and b == 0 or b == 5
		 * how can you print "a is _ and b is _" with the least amount of for loops?
		 * (hint: use variables and strings!)
		 */
		
		if (b == 0) {
			System.out.println("b is 0");				
		} else if (b == 5) {
			System.out.println("b is 5");
		} else {
			System.out.println("idk what b is");
		}
	}
	
}
