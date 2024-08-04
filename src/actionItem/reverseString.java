package actionItem;

public class reverseString {
	/*
	 * Q8. Reverse a String using loop.
	 */
	public static void main(String[] args) {

		String str = "Democracy vs Autocracy";
		// create a string variable to put reverse string
		String reverseStr = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			// using charAt() method to put in the reverse string
			reverseStr += str.charAt(i);
		}
		System.out.println(reverseStr);

	}

}
