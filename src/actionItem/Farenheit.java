package actionItem;

public class Farenheit {

	/*
	 * Q6. Write a method that accepts Celsius temperature as argument. The method
	 * should return Fahrenheit temperature after converting Celsius into
	 * Fahrenheit. [Formula F=(C x 9/5) + 32]
	 */

	public static void main(String[] args) {
		System.out.println(Farenheit.convertFahren(20));
	}

   // Creating a method for converting celsius into Farenheit 
	public static  int convertFahren(int celsius) {
		int faren = (celsius * 9 / 5) + 32;

		return faren;
	}

}
