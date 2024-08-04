package actionItem;

public class Factorial {

	/*
	 * Q4. Write a program that returns the factorial (!) of a given number using
	 * for loop. For example: 3! equals 3*2*1 = 6, again 5! equals 5*4*3*2*1 = 120.
	 */

	public static void main(String[] args) {

		Factorial factor = new Factorial();
		System.out.println(" Factorial is " + factor.doFactorial(5));

	}

// Creating a method to do factorial
	public int doFactorial(int number) {
		int factorial = 1;
		for (int i = number; i > 0; i--) {
			factorial = (factorial * i);

		}

		return factorial;
	}

}
