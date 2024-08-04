package day4;

public class ActionItem2 {

	public static void main(String[] args) {

		/*
		 * Write a program that returns the factorial (!) of a given number using for
		 * loop. For example: 3! equals 3*2*1 = 6, again 5! equals 5*4*3*2*1 = 120.
		 */

		System.out.println("Factorial is : " + doFactorial(9));
		
		System.out.println("Fahrenheit value is: "+ convertToFahrenheit(42));
	}

	public static long doFactorial(int number) {

		// declare a new long type variable
		long factorial = 1;
		while (number > 1) {
			// We are multiplying subsequent values with factorial
			factorial *= number;
			// decrementing the given number in every iteration
			number--;
		}
		// Returning the calculated value
		return factorial;
	}

	/*
	 * Write a method that accepts Celsius temperature as argument. The method
	 * should return Fahrenheit temperature after converting Celsius into
	 * Fahrenheit. [Formula F=(C x 9/5) + 32]
	 */

	public static double convertToFahrenheit(int celcius) {
		 // conversion formula
		double fahrenheit = ((celcius * 9) / 5) + 32;
		return fahrenheit;
	}
}
